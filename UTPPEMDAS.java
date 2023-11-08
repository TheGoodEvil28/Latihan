/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemogramandasar;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class UTPPEMDAS {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int jenisKendaraan = sc.nextInt();
        int lamaParkir = sc.nextInt();
        int uangDibayarkan = sc.nextInt();
        int biayaParkir = 0;
        if (jenisKendaraan == 1) {
            biayaParkir = 2000 * lamaParkir;
        } else if (jenisKendaraan == 2) {
            biayaParkir = 4000 * lamaParkir;
        } else if (jenisKendaraan == 3) {
            biayaParkir = 9000 * lamaParkir;
        }
        int kembalian = uangDibayarkan - biayaParkir;
        if (kembalian == 0) {
            System.out.println("Uang yang dibayarkan pas.");
        } else if (kembalian < 0) {
            System.out.println("Uang anda belum mencukupi.");
        } else {
            System.out.println("Anda mendapatkan kembalian sebesar:");
            int uang10ribu = kembalian / 10000;
            kembalian %= 10000;
            int uang5ribu = kembalian / 5000;
            kembalian %= 5000;
            int uang500 = kembalian / 500;
            kembalian %= 500;
            int uang100 = kembalian / 100;
            System.out.println(uang10ribu + " uang 10.000");
            System.out.println(uang5ribu + " uang 5.000");
            System.out.println(uang500 + " uang 500");
            System.out.println(uang100 + " uang 100");
        }
        sc.close();
//        Scanner input = new Scanner(System.in);
//
//        int jenisKendaraan = input.nextInt();
//        int lamaParkir = input.nextInt();
//        int uangDibayarkan = input.nextInt();
//        int biayaParkir = 0;
//
//        if (jenisKendaraan == 1) {
//            biayaParkir = 2000 * lamaParkir;
//        } else if (jenisKendaraan == 2) {
//            biayaParkir = 4000 * lamaParkir;
//        } else if (jenisKendaraan == 3) {
//            biayaParkir = 9000 * lamaParkir;
//        }
//
//        int kembalian = uangDibayarkan - biayaParkir;
//
//        if (kembalian == 0) {
//            System.out.println("Uang yang dibayarkan pas.");
//        } else if (kembalian < 0) {
//            System.out.println("Uang anda belum mencukupi.");
//        } else {
//            System.out.println("Anda mendapatkan kembalian sebesar:");
//
//            int uang10ribu = kembalian / 10000;
//            kembalian %= 10000;
//            int uang5ribu = kembalian / 5000;
//            kembalian %= 5000;
//            int uang500 = kembalian / 500;
//            kembalian %= 500;
//            int uang100 = kembalian / 100;
//
//            if (uang10ribu > 0) {
//                System.out.println(uang10ribu + " uang 10.000");
//                System.out.println(uang5ribu + " uang 5.000");
//                System.out.println(uang500 + " uang 500");
//                System.out.println(uang100 + " uang 100");
//            }
//            if (uang5ribu > 0) {
//                System.out.println(uang10ribu + " uang 10.000");
//                System.out.println(uang5ribu + " uang 5.000");
//                System.out.println(uang500 + " uang 500");
//                System.out.println(uang100 + " uang 100");
//            }
//            if (uang500 > 0) {
//                System.out.println(uang10ribu + " uang 10.000");
//                System.out.println(uang5ribu + " uang 5.000");
//                System.out.println(uang500 + " uang 500");
//                System.out.println(uang100 + " uang 100");
//            }
//            if (uang100 > 0) {
//                System.out.println(uang10ribu + " uang 10.000");
//                System.out.println(uang5ribu + " uang 5.000");
//                System.out.println(uang500 + " uang 500");
//                System.out.println(uang100 + " uang 100");
//            }
//            
//        }
//
//        input.close();
//        
        
        
    
 /*   
    Scanner sc = new Scanner(System.in);
        int jenisKendaraan = sc.nextInt();
        int lamaParkir = sc.nextInt();
        int uangDibayarkan = sc.nextInt();
        int biayaParkir = 0;
        if (jenisKendaraan == 1) {
            biayaParkir = 2000 * lamaParkir;
        } else if (jenisKendaraan == 2) {
            biayaParkir = 4000 * lamaParkir;
        } else if (jenisKendaraan == 3) {
            biayaParkir = 9000 * lamaParkir;
        }
        int kembalian = uangDibayarkan - biayaParkir;
        if (kembalian == 0) {
            System.out.println("Uang yang dibayarkan pas.");
        } else if (kembalian < 0) {
            System.out.println("Uang anda belum mencukupi.");
        } else {
            System.out.println("Anda kembalian uang " + kembalian);
            while (kembalian >= 10000) {
                System.out.println("anda kembalian uang 10 ribu");
                kembalian -= 10000;
            }
            while (kembalian >= 1000) {
                System.out.println("anda kembalian uang 1 ribu");
                kembalian -= 1000;
            }
            while (kembalian >= 500) {
                System.out.println("anda kembalian uang 500");
                kembalian -= 500;
            }
            while (kembalian >= 100) {
                System.out.println("anda kembalian uang 100");
                kembalian -= 100;
            }
        }

        sc.close();
*/
//      import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */      
//        Scanner sc = new Scanner(System.in);
//
//        double sudutElevasi = sc.nextDouble();
//        double kecepatanPesertaKmph = sc.nextDouble();
//
//        double sudutRadian = Math.toRadians(sudutElevasi);
//
//        double waktu = 6.0;
//
//        double jarakHorizontal = (kecepatanPesertaKmph * 1000 / 3600) * waktu * Math.cos(sudutRadian);
//
//        boolean dapatMenangkapBola = jarakHorizontal < 50.0;
//
//        System.out.println("Jarak horizontal bola terhadap gedung: " + Math.round(jarakHorizontal) + " meter");
//        System.out.println("Peserta dapat menangkap bola: " + dapatMenangkapBola);
//
//        sc.close();
//    }
//}
//        Scanner sc = new Scanner(System.in);
//
//        double sudutElevasi = sc.nextDouble();
//        double kecepatanPesertaKmph = sc.nextDouble();
//
//        double sudutRadian = Math.toRadians(sudutElevasi);
//
//        double waktu = 6.0;
//
//        double jarakHorizontal = (kecepatanPesertaKmph * 1000 / 3600) * waktu * Math.cos(sudutRadian);
//
//        boolean dapatMenangkapBola = jarakHorizontal < 50.0;
//
//        System.out.println("Jarak horizontal bola terhadap gedung: " + Math.round(jarakHorizontal) + " meter");
//        System.out.println("Peserta dapat menangkap bola: " + dapatMenangkapBola);
//
//        sc.close();

}
}