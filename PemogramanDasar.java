
package com.mycompany.pemogramandasar;
//Langkah pertama kita membuat package atau file directory penyimpanan
import java.util.Scanner;
//kita mengimport scanner agar perintah input data bisa berjalan
public class PemogramanDasar {
    public static void main(String[] args) {
        //Untuk scanner tersebut kita input menjadi perintah di dalam prosedur (PSVM)
        try (Scanner scanner = new Scanner(System.in)) {
            //Untuk scanner tersebut kita input menjadi perintah di dalam prosedur (PSVM)
            System.out.println("======Program penghitung pemakaian listrik sederhana======");
            //Kita berikan judul terlebih dahulu untuk projek ini dengan memprogram terminal untuk output data
            System.out.print("Masukkan Nama \t\t\t\t: ");
            //Kita berikan arahan kepada terminal untuk output data berdasarkan questionare yang di minta
            String nama = scanner.nextLine();
            //Kita meminta terminal untuk mengambil tipe data String nama berdasarkan input user
            System.out.print("Kelurahan \t\t\t\t: ");
            //Kita berikan arahan kepada terminal untuk output data berdasarkan questionare yang di minta
            String kelurahan = scanner.nextLine();
            //Kita meminta terminal untuk mengambil tipe data String kelurahan berdasarkan input user
            System.out.print("Masukkan posisi awal Kwh Meter \t\t: ");
            //Kita berikan arahan kepada terminal untuk output data berdasarkan questionare yang di minta
            int awalKwh = scanner.nextInt();
            //Kita meminta terminal untuk mengambil tipe data int awalKwh berdasarkan input user
            System.out.print("Masukkan posisi akhir Khw Meter \t: ");
            //Kita berikan arahan kepada terminal untuk output data berdasarkan questionare yang di minta
            int akhirKwh = scanner.nextInt();
            //Kita meminta terminal untuk mengambil tipe data int akhirKwh berdasarkan input user
            System.out.print("Masukkan biaya beban saat ini \t\t: ");
            //Kita berikan arahan kepada terminal untuk output data berdasarkan questionare yang di minta
            int biayaBeban = scanner.nextInt();
            //Kita meminta terminal untuk mengambil tipe data int biayaBeban berdasarkan input user
            System.out.print("Masukkan PPJ (dalam persen) \t\t: ");
            //Kita berikan arahan kepada terminal untuk output data berdasarkan questionare yang di minta
            double ppjPersen = scanner.nextDouble();
            //Untuk syntax di atas kita  untuk deklarasi tipe data double nilai ppjPersen berdasarkan input user
            int pemakaian = akhirKwh - awalKwh;
            //Untuk syntax di atas kita untuk melakukan kalkulasi pengurangan berdasarkan data yang sudah di input
            double tarifListrik = pemakaian * biayaBeban;
            //Untuk syntax di atas kita untuk melakukan kalkulasi penkalian berdasarkan data yang sudah di input
            double ppj = (ppjPersen / 100) * tarifListrik;
            //Untuk syntax di atas kita untuk melakukan kalkulasi bunga 10% dan tarif listrik berdasarkan data yang sudah di input
            double totalBayar = tarifListrik + ppj;
            //Untuk syntax di atas kita melakukan kalkulasi penjumlahan nilai tarif listrik dan ppj untuk mendapatkan total pembayaran
            System.out.println("=========================PLN " + kelurahan + "=========================");
            System.out.println("|Nama \t\t\t: " + nama + "\t\t\t|");
            System.out.println("|Kelurahan\t\t: " + kelurahan + "\t\t\t\t|");
            System.out.println("|Pemakaian bulan ini \t: " + pemakaian + " Kwh Meter" + "\t\t|");
            System.out.println("|Tarif Listrik \t\t: Rp " + tarifListrik + ",-" + "\t\t\t|");
            System.out.println("|PPJ " + ppjPersen + "% \t\t: Rp " + ppj + ",-\t\t\t|");
            System.out.println("|Total Bayar \t\t: Rp " + totalBayar + ",-\t\t\t|");
            System.out.println("==========================================================");
            //untuk output akhir yang berupa receipt kita rapikan menggunakan (\t) dan (=)
            
        }
    }
}

   


    
        

    

