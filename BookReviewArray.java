/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemogramandasar;
import java.util.*;

/**
 *
 * @author WINDOWS 10
 */
public class BookReviewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array 3d dengan ukuran 3 kali 4 kali 5
//        int arr3d [][][] = new int[3][4][5];
//        int i, j,k;
//        for (i =0; i < 3 ; i++)
//            for (j =0; j<4; j++)
//                for(k = 0; k < 5; k++)
//                    arr3d [i][j][k] = i * j * k;
//        for (i = 0; i<3; i++){
//            for(j =0; j<4; j++){
//                for (k = 0; k<5; k++)
//                    System.out.print(arr3d[i][j][k]+ " ");
//                    System.out.println();
//                
//                
//            }
//            System.out.println();
//        }
//       
                     
        //alokasi ukuran berbeda array2D
//        int arr2D [][] = new int[4][];
//        arr2D [0] = new int[1];
//        arr2D [1] = new int[2];
//        arr2D [2] = new int[3];
//        arr2D [3] = new int[4];
//        int i, j, k = 0;
//        for (i = 0; i <4 ; i++)
//            for (j = 0; j < i + 1; j++){
//            arr2D[i][j]= k;
//            k++;
//            }
//        for (i = 0; i <4 ; i++){
//            for (j = 0; j < i + 1; j++) // why is putting the kur awal pengaruh on structure
//                System.out.print(arr2D[i][j] + " ");
//                System.out.println();
//            }

        //array 2 dimensi di dalam for
//        int arr2D [][] = new int[4][5];
//        int i, j, k = 0;
//        for (i = 0; i < 4 ; i++){
//            for (j = 0;  j< 5; j++) {
//                arr2D [i][j] = k;
//                k++;
//            }
//        }
//        for (i = 0; i < 4 ; i++){
//            for (j = 0;  j< 5; j++) {
//                System.out.print(arr2D[i][j] + " ");
//                System.out.println();
//            }
//        } //why is this? diferent to the one below
        
//        int arr2D [][] = new int[4][5];
//        int i, j, k = 0;
//        for (i = 0; i < 4 ; i++)
//            for (j = 0;  j< 5; j++) {
//                arr2D [i][j] = k;
//                k++;
//            }
//        for (i = 0; i < 4 ; i++){
//            for (j = 0;  j< 5; j++) 
//                System.out.print(arr2D[i][j] + " ");
//                System.out.println();
//        }
        
        //array satu dimensi
//        double arrA [] = {10.1,11.2,12.3,13.4,14.5};
//        double hasil = 0;
//        int i; // for tidak perlu menggunakan kurung kur awal dan akhir agar bisa di baca di main dan tidak loop "{}"
//        for (i = 0; i < 5; i++) { // kenapa tidak bisa jika menggunakan inisialisai i {karena sudah inisialisasi di Main}
//            hasil = hasil + arrA[i];
//            System.out.println("Rata rata adalah : " + hasil/5);
//        }

        //konversi tipe data
//        byte b;
//        int i = 257;
//        double d = 323.142;
//        System.out.println("\nKonversi dari int menjadi byte");
//        b = (byte) i;
//        System.out.println("i dan b " + i + " " + b);
//        System.out.println("\nKonversi double menjadi int");
//        i = (int) d;
//        System.out.println("d dan i " + d + " " + i);
//        System.out.println("\nKonversi int menjadi double");
//        d = (double) i;
//        System.out.println("i dan d " + i + " " + d);
//        System.out.println("\nKonversi double menjadi byte");
//        b = (byte) d;
//        System.out.println("d dan b " + d + " " + b);
        
        //pembacaan data di dalam blok if
//        int x; //di kenali oleh semua metode di dalam main
//        x = 10;
//        if (x ==10) { //memulai blok yang baru
//            int y =20; // hanya di kenali dalam blok if ini
//            
//            //x dan y di kenali oleh blok ini
//            System.out.println("x dan y "+ x +" "+ y);
//            x = y *5;
//        }
//        //y = 100 // ketika keluar dari blok if maka y tidak bisa terbaca
//        // x masih dikenali di sini, dan bisa membaca perintah di dalam blok if
//        System.out.println("y tidak di kenali");
//        System.out.println("x adalah "+ x);

       // Mengendalikan statemen dengan boolean
//        boolean b;
//        b = false;
//        
//        System.out.println("b adalah " + b);
//        
//        b = true;
//        System.out.println("b adalah " + b);
//        if (b) {
//            System.out.println("ini dieksekusi ");   
//        }
//        b = false;
//        if (b) {
//            System.out.println("ini tidak di eksekusi ");
//        }
//        System.out.println("10>9 adalah " + (10>9));
               
         //aritmatika dengan char
//        char ch1;
//        ch1 = 'x'; // sayangnya char tidak dapat di masukkan scanner
//        for (int i = 0; i < 4; i++) {
//        System.out.println("ch1 memuat: " + ch1);
//        ch1++;
//        System.out.println("ch1 sekarang adalah: " + ch1);
//        } //kenapa setelah z selanjutnya yang di keluarkan adalah simbol bukan ke A
        
        
        //menghitung kecepatan cahaya
//        int kecepatanCahaya; // 340000
//        long hari, detik, jarak; // 1000 hari
//        System.out.println("masukkan kecepatan cahaya: ");
//        kecepatanCahaya = sc.nextInt();
//        System.out.println("masukkan berapa hari yang di habiskan: ");
//        hari = sc.nextLong();
//        detik = hari * 24 * 60 *60;
//        jarak = kecepatanCahaya * detik;
//        
//        System.out.println("dalam" + hari);
//        System.out.println("hari, cahaya menjelajah sekitar: ");
//        System.out.println(jarak + "KM");
        
        //penyelesaian menghitung luas lingkaran
//        double pi, r, luas;
//        System.out.println("Masukkan ruas jari jari lingkaran: ");
//        r = sc.nextDouble();
//        pi = 3.14;
//        luas = Math.PI * Math.pow(r, 2);
//        System.out.println("maka luas lingkaran adalah" + luas );
        
    }
    
}
