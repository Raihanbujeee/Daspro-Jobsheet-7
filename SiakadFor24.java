// import java.util.Scanner;
// public class SiakadFor24 {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in); 
//         double nilai, tertinggi = 100, terendah = 0;

//         for(int i = 1; i <= 10; i++) {
//             System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
//             nilai = input.nextDouble();
//             if (nilai > tertinggi) {
//                 tertinggi = nilai;
//             }
//             if (nilai < terendah) {
//                 terendah = nilai;
//             }
//         }
//         System.out.println("Nilai tertinggi = " + tertinggi);
//         System.out.println("Nilai terendah = " + terendah);

//     }
// }


import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0; 
        int batasKelulusan = 60;
       
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
           
            if (nilai >= batasKelulusan) {
                lulus++;
            } else {
                tidakLulus++; 
            }
        }
        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah = " + terendah);

        System.out.println("Jumlah mahasiswa yang lulus = " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + tidakLulus);
    }
}

