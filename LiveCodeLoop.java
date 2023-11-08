/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Budi adalah seorang entrepreneur. Semua lini bisnis Ia jajal, dari mulai jualan pentol korea sampai kini Ia mencoba untuk membuka barbershop bernama Rawr Cuts. Layanan potong rambut di Rawr Cuts ada 3 macam dengan harga yang berbeda yaitu Junior Cut, Senior Cut, Dan Cepmek Cut. Harga layanan potong rambut di Rawr Cuts dibanderol dengan harga berturut Rp50.000 , Rp75.000, dan Rp100.000. Selain potong rambut, barbershop ini memiliki layanan lain yaitu cat rambut dengan harga Rp75.000.
//
//Rawr Cuts baru mulai aktif melayani pelanggan setelah dibuka secara resmi pada tanggal 1 Oktober 2022. Karena baru saja buka, barbershop ini mengadakan Grand Opening Promo sebesar 40% selama 2 minggu untuk pelanggan yang menggunakan jasa dengan menggunakan kartu member. Pembuatan kartu member baru pada barbershop ini adalah Rp50.000. Tunggulah promo-promo menarik lainnya dengan bergabung dengan member Rawr Cuts
//
//Bantulah Budi untuk membuat program kasir di Rawr Cuts
//
//Input Format
//
//Nama Pelanggan
//Hari menggunakan jasa
//Layanan potong rambut
//Cat rambut
//Member baru/lama
//Constraints
//
//Hari menggunakan jasa adalah jumlah hari dihitung dari Grand Opening sampai menggunakan jasa
//Hari < 30
//Pelanggan bisa jadi tidak potong rambut
//Constraint member -> lama, baru, non-member
//Output Format
//
//Mengikuti sample test case dibawah
//
//Sample Input 0
//
//Budi Rahmadi
//10
//Cepmek Cut
//true
//baru
//Sample Output 0
//
//========================
//------------------------
//        Rawr Cuts
//========================
//11 Oktober 2022
//
//Budi Rahmadi
//Cepmek Cut     Rp.100000
//Lainnya        Rp.75000
//------------------------
//Diskon              40%
//
//Member         Rp.50000
//Total          Rp.155000
//========================
//   Terimakasih Banyak
//------------------------
//========================
//Sample Input 1
//
//Dilan Ngawi
//13
//Junior Cut
//false
//lama
//Sample Output 1
//
//========================
//------------------------
//        Rawr Cuts
//========================
//14 Oktober 2022
//
//Dilan Ngawi
//Junior Cut     Rp.50000
//Lainnya        Rp.0
//------------------------
//Diskon              40%
//
//Member         Rp.0
//Total          Rp.30000
//========================
//   Terimakasih Banyak
//------------------------
//========================

//Dalam bahasa pemrograman, loop (perulangan) adalah sebuah struktur kontrol yang digunakan untuk menjalankan serangkaian statements atau blok kode berulang kali hingga suatu kondisi tercapai.
//
//Pada bahasa Java beberapa bentuk perulangan, di antaranya:
//
//for (inisialisasi; kondisi; iterasi) {
//    statement;
//}
//while (syarat_perulangan) {
//    statement;
//}
//Buatlah sebuah program menggunakan konsep perulangan yang dapat menerima input dari user berupa bilangan X. Lalu program akan menampilkan jumlah semua bilangan dari 1 sampai X.
//
//Input Format
//
//Integer
//
//Constraints
//
//Input yang dimasukkan adalah > 0
//
//Output Format
//
//Integer
//
//Sample Input 0
//
//3
//Sample Output 0
//
//6
//Explanation 0
//
//Hasil penjumlahan: 1 + 2 + 3 = 6
//
//Sample Input 1
//
//5
//Sample Output 1
//
//15
//Explanation 1
//
//1 + 2 + 3 + 4 + 5 = 15

package com.mycompany.pemogramandasar;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;
public class LiveCodeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan X: ");
        int X = scanner.nextInt();

        if (X <= 0) {
            System.out.println("Input harus lebih dari 0.");
        } else {
            int total = 0;

            for (int i = 1; i <= X; i++) {
                total += i;
            }

            System.out.println("Hasil penjumlahan: " + total);
        }
        scanner.close();
        
        
       
        
    }
    
}
