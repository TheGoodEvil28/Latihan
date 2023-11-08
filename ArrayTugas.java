///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.pemogramandasar;
//
//import java.util.Scanner;
//
///**
// *
// * @author WINDOWS 10
// */
//public class ArrayTugas {
//    Scanner sc = new Scanner(System.in);
//        int[] input = new int[11]; 
//        int data = 0;

//        while (true) {
//            System.out.println("===============================");
//            System.out.println("Pilihan Menu:");
//            System.out.println("1. Input Data");
//            System.out.println("2. Lihat Data");
//            System.out.println("3. Average");
//            System.out.println("4. Sum");
//            System.out.println("5. Max");
//            System.out.println("6. Min");
//            System.out.println("7. Keluar");
//
//            System.out.print("Masukkan nilai: ");
//            int pilihan = sc.nextInt();
//            System.out.println("===============================");
//            switch (pilihan) {
//                case 1:
//                    if (data< 10) {
//                         for (int i = 1; i < input.length;i++){
//                         System.out.print("Masukkan Data ke "+i+"= " );
//                       
//                        input[data] = sc.nextInt();
//                        data++;
//                           
//                         }
//                     
//                    }
//                    break;
//                case 2:
//                    if (data == 0) {
//                        System.out.println("Data kosong.");
//                    } else {
//                        System.out.print("Data: ");
//                        for (int i = 0; i < data; i++) {
//                            System.out.print(input[i] + " ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                       
//                case 3:
//                    if (data == 0) {
//                        System.out.println("Data kosong. Tidak dapat menghitung rata-rata.");
//                    } else {
//                        double sum = 0;
//                        for (int i = 0; i < data; i++) {
//                            sum += input[i];
//                        }
//                        double average = sum / data;
//                         double bulat = Math.round(average * 100.0) / 100.0;
//                        System.out.println("Rata-rata: " + bulat);
//                    }
//                    break;
//                case 4:
//                    if (data == 0) {
//                        System.out.println("Data kosong. Tidak dapat menghitung jumlah.");
//                    } else {
//                        int sum = 0;
//                        for (int i = 0; i < data; i++) {
//                            sum += input[i];
//                        }
//                        System.out.println("Jumlah: " + sum);
//                    }
//                    break;
//                    case 5:
//                    if (data == 0) {
//                        System.out.println("Data kosong. Tidak dapat mencari nilai maksimum.");
//                    } else {
//                        int max = input[0];
//                        for (int i = 1; i < data; i++) {
//                            if (input[i] > max) {
//                                max = input[i];
//                            }
//                        }
//                        System.out.println("Nilai maksimum: " + max);
//                    }
//                    break;
//                case 6:
//                    if (data == 0) {
//                        System.out.println("Data kosong. Tidak dapat mencari nilai minimum.");
//                    } else {
//                        int min = input[0];
//                        for (int i = 1; i < data; i++) {
//                            if (input[i] < min) {
//                                min = input[i];
//                            }
//                        }
//                        System.out.println("Nilai minimum: " + min);
//                         }
//                    break;
//                case 7:
//                    System.out.println("Terima kasih! Keluar dari program.");
//                    System.exit(0); // Keluar dari program
//                    break;
//                default:
//                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan yang benar.");
//            }
//}
//}

    
