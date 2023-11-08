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
public class ARRAY {
    public static void main(String[] args) {
        int [] arrA = new int[]{3,5,2,1,4,6,8,7,9,10};
        int [] arrB;
        
        arrB=arrA;
        int A = 10;
        int B;
        
         System.out.println("arrB index 2 line 20 :" + arrB[2]);
         arrB [2]=100;
        System.out.println("arrA index 2 line 22" + arrA[2]);
        System.out.println("arrA index 2 line 23" + arrA[2]);
        System.out.println("arrB index 2 line 24" + arrB[3]);
        System.out.println("arrA index 2 line 25" + arrA[3]);
//        Scanner input = new Scanner(System.in);
//        ArrayList<Integer> data = new ArrayList<>();
//        int choice;
//        boolean exit = false;
//        while (!exit) {
//            System.out.println("Pilihan Menu:");
//            System.out.println("1. Input Data");
//            System.out.println("2. Lihat Data");
//            System.out.println("3. Average");
//            System.out.println("4. Sum");
//            System.out.println("5. Max");
//            System.out.println("6. Min");
//            System.out.println("7. Keluar");
//            System.out.print("Masukkan nilai: ");
//            choice = input.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.print("Masukkan data: ");
//                    int newData = input.nextInt();
//                    data.add(newData);
//                    break;
//                case 2:
//                    if (data.isEmpty()) {
//                        System.out.println("Data kosong.");
//                    } else {
//                        System.out.print("Data: ");
//                        for (int value : data) {
//                            System.out.print(value + " ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 3:
//                    if (data.isEmpty()) {
//                        System.out.println("Data kosong.");
//                    } else {
//                        double average = calculateAverage(data);
//                        System.out.println("Rata-rata: " + average);
//                    }
//                    break;
//                case 4:
//                    if (data.isEmpty()) {
//                        System.out.println("Data kosong.");
//                    } else {
//                        int sum = calculateSum(data);
//                        System.out.println("Jumlah: " + sum);
//                    }
//                    break;
//                case 5:
//                    if (data.isEmpty()) {
//                        System.out.println("Data kosong.");
//                    } else {
//                        int max = findMax(data);
//                        System.out.println("Nilai maksimum: " + max);
//                    }
//                    break;
//                case 6:
//                    if (data.isEmpty()) {
//                        System.out.println("Data kosong.");
//                    } else {
//                        int min = findMin(data);
//                        System.out.println("Nilai minimum: " + min);
//                    }
//                    break;
//                case 7:
//                    exit = true;
//                    System.out.println("Keluar dari program.");
//                    break;
//                default:
//                    System.out.println("Pilihan tidak valid. Masukkan angka 1-7.");
//            }
//        }    
//        input.close();
//    }
//    public static double calculateAverage(ArrayList<Integer> data) {
//        int sum = 0;
//        for (int value : data) {
//            sum += value;
//        }
//        return (double) sum / data.size();
//    }   
//    public static int calculateSum(ArrayList<Integer> data) {
//        int sum = 0;
//        for (int value : data) {
//            sum += value;
//        }
//        return sum;
//    }
//    
//    public static int findMax(ArrayList<Integer> data) {
//        int max = Integer.MIN_VALUE;
//        for (int value : data) {
//            if (value > max) {
//                max = value;
//            }
//        }
//        return max;
//    }
//    
//    public static int findMin(ArrayList<Integer> data) {
//        int min = Integer.MAX_VALUE;
//        for (int value : data) {
//            if (value < min) {
//                min = value;
//            }
//        }
//        return min;
        
//        B=A;
//        
//        System.out.println("B Line 20 =" + B);
//        B = 100;
//         System.out.println("B Line 23 =" + B);
//         System.out.println("B Line 24 =" + A);
//        Scanner sc = new Scanner(System.in);
//        String[][] mobil ={{"Avanza", "Toyota"},
//                            {"Jazz", "Honda"},
//                            {"fortuner","Toyota"}};
//        
//        for (int i = 0; i < mobil.length; i++) {
//            for (int j = 0; j < mobil[i].length; j++) {
//                System.out.println(mobil[i][j]);   
//            }   
//        }
//        
//        for (String baris[] : mobil){
//            for(String output : baris){
//                System.out.println(output);
//            }
//        }
//        int[] arrayInput = new int [10];
//        for (int i = 0; i < arrayInput.length; i++) {
//            if(i == 5) break;
//            arrayInput[i] = sc.nextInt();
//        }
//        
//        for (int i = 0; i < arrayInput.length; i++) {
//            int firstElement = 1;
//            if (i + 1 < arrayInput.length) {
//                arrayInput[i] = firstElement;
//                arrayInput[i+1] = ++firstElement;
//                
//            }
//            
//        }
//        System.out.printf("isi dari array tersebut adalah: ");
//        
//        for (int i : arrayInput) {
//            
//        }

        
//        String [] mobil= {"Avanza","Inova","Fortuner","Raize"};
//        String[] mobil = new String [5];
//        mobil[0] = "Avanza";
//        mobil [1] = "Inova";
//        mobil[2] = "Fortuner";
//        
//        mobil = new String[10];
//        
//        System.out.println(mobil.length);
        
//        System.out.println(mobil[]);
//        mobil = new String[10];
//           for(String a : mobil){
//               System.out.println(a);
//           }
//        System.out.println(mobil[0]);
//        System.out.println(mobil[1]);
//        System.out.println(mobil[2]);
//        System.out.println(mobil[3]);
//          for (int i = 0; i < mobil.length; i++) {
//              System.out.println(mobil[i]);
//        }         
//           System.out.printf("Isi dari array tersebut adalah: ");
//           for (int i = 0; i : arrayInput) {
//        System.out.println(i);
//            
//        }
    }
}
        
        
//        int [] arrA = new int[]{3,5,2,1,4,6,8,7,9,10};
//        int [] arrB = new int[10];
//        int b []= {1,2,-4, 8,9};
//        int c [][]= {{1,3,5,20}, {5,6,7,11}, {8,9}};
//        System.out.println("Isi array c:");
//for (int i = 0; i < c.length; i++) {
//    for (int j = 0; j < c[i].length; j++) {
//        System.out.print(c[i][j] + " ");
//    }
//    System.out.println();  // Untuk membuat baris baru setiap selesai mencetak satu baris array
//}
//
//        
//        System.out.println(c[0][0]);
//        System.out.println(c[0][1]);
//        System.out.println(c[0][2]);
//        System.out.println(c[1][0]);
//        System.out.println(c[1][1]);
//        System.out.println(c[1][2]);
//        System.out.println("--------------");
//        System.out.println(c[0].length);
//        System.out.println(arrA);
//        for (int i = 0; i < arrA.length; i++) {
//            System.out.print(arrA[i]+" "); 
//        }
//        System.out.println("-------------");
//        arrB[6] = arrA[0]+ arrA[7];
//        for (int i = 0; i < arrB.length; i++) {
//            System.out.print(arrB[i]+" "); 
//        }
//        int c = 10;
//        int z = 1;
//        String A = " "+ arrA[2] + arrA[5];
//        String B = " "+(c+z);
//        int O = c+z;
//        System.out.println("B =" + B);
//        System.out.println("O =" + O);
//        int x= arrA[2] + arrA[5];
//        System.out.println("A =" + A);
//        System.out.println("X =" + x);
//        System.out.println((arrA[2] + arrA[5]) );
//        displayangka("1");
//        displayangka(1);
//        int a;
//        int b [] = new int[a]{1, 2, 3, 4};
//        a = new Integer[10];
//        a[6] = 15; a[3] = 27;
//        namaArray = new  tipe [Jumlah Elemen];
//    } 
//    static  void displayangka(int angka)
//    {
//        System.out.println("ini yang angka integer"); 
//    }
//    static  void displayangka(String angka)
//    {
//        System.out.println("ini yang angka string"); 
//    }
//}
