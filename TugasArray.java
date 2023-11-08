package com.mycompany.pemogramandasar;


import java.util.*;


/**
 *
 * @author WINDOWS 10
 */
public class TugasArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        int choice;
        boolean exit = false;
        boolean canInputData = true;
        int maxDataInput = 0; 

        while (!exit) {
            System.out.println("\nPilihan Menu:");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Keluar");
            System.out.print("Masukkan nilai: \n");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (canInputData) {
                        System.out.print("Masukkan jumlah data yang ingin dimasukkan: \n");
                        maxDataInput = sc.nextInt();
                        for (int i = 0; i < maxDataInput; i++) {
                            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
                            int newData = sc.nextInt();
                            data.add(newData);
                        }
                        canInputData = false;
                    } else {
                        System.out.println("Anda sudah selesai menginput data.");
                    }
                    break;
                case 2:
                    if (data.isEmpty()) {
                        System.out.println("Data kosong.");
                    } else {
                        System.out.print("Data: \n");
                        for (int value : data) {
                            System.out.print(value + ",");
                        }
                        System.out.println();
                        canInputData = false; 
                    }
                    break;
                case 3:
                    if (data.isEmpty()) {
                        System.out.println("Data kosong.");
                    } else {
                        int sum = 0;
                        for (int value : data) {
                            sum += value;
                        }
                        double average = (double) sum / data.size();
                        double roundedAverage = Math.round(average * 100.0) / 100.0;
                        System.out.print("Rata-rata: \n" + roundedAverage + "\n");
                        canInputData = false;
                    }
                    break;
                case 4:
                    if (data.isEmpty()) {
                        System.out.println("Data kosong.");
                    } else {
                        int sum = 0;
                        for (int value : data) {
                            sum += value;
                        }
                        System.out.print("Jumlah: \n" + sum + "\n");
                        canInputData = false; 
                    }
                    break;
                case 5:
                    if (data.isEmpty()) {
                        System.out.println("Data kosong.");
                    } else {
                        int max = Integer.MIN_VALUE;
                        for (int value : data) {
                            if (value > max) {
                                max = value;
                            }
                        }
                        System.out.print("Nilai maksimum: \n" + max + "\n");
                        canInputData = false; 
                    }
                    break;
                case 6:
                    if (data.isEmpty()) {
                        System.out.println("Data kosong.");
                    } else {
                        int min = Integer.MAX_VALUE;
                        for (int value : data) {
                            if (value < min) {
                                min = value;
                            }
                        }
                        System.out.print("Nilai minimum: \n" + min + "\n");
                        canInputData = false;
                    }
                    break;
                case 7:
                    exit = true;
                    System.out.print("Keluar dari program. " + "\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 1-7.");
            }
        }
        sc.close();
    }
}