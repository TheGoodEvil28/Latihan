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
public class Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaTerbesar = getMax(10, 20);
        int a = 100;
        int b = 1000;
        float c = getMax(a, b);
        float d = 100.0f;
        System.out.println("c adalah " + c);
        int x = 100;
        int j = 50;
        
        ubahData(x, j);
        System.out.println("yg bukan fungsi adalah "+x);
        ubahData(10, 11);
        
        int z []={5,10};
        ubahArray(z);
        System.out.println("z index 1 " + z[0] + "z undex 1 " + z[1] );
    }

    public static int getMax(int angka1, int angka2) {
        if (angka1>angka2) {
            return angka1;
        }
        return angka2;
    }

    public static void printMax(int angka1, int angka2) {
        if (angka1>angka2) {
        System.out.println("angka yg besar adalah"+angka1);
        }
        System.out.println("angka yg besar adala");
        return;

    }

    static void ubahData(int a, int z){
        System.out.println("line 26 "+a);
        a = 10;
        System.out.println("line 28 "+a);
        
    }
    
    static void ubahArray(int[]a){
        int temp = 0;
        a[0] = a[1];
        a[1] = temp;
        System.out.println("a index 0" + a[0] + "a index 1" + a[1]);
        
    }
}

    
        
        
        
            
        
        
//                System.out.print("Masukkan angka (1-7) untuk menghitung hari: ");
//        int angka = input.nextInt();
//
//        String hari;
//
//        switch (angka) {
//            case 1:
//                hari = "Minggu";
//                break;
//            case 2:
//                hari = "Senin";
//                break;
//            case 3:
//                hari = "Selasa";
//                break;
//            case 4:
//                hari = "Rabu";
//                break;
//            case 5:
//                hari = "Kamis";
//                break;
//            case 6:
//                hari = "Jumat";
//                break;
//            case 7:
//                hari = "Sabtu";
//                break;
//            default:
//                hari = "Hari yang tidak valid";
//                break;
//        }
//
//        System.out.println("Hari ke-" + angka + " adalah " + hari);
//        
//        
//        int angkaTerbesar = getMax(10, 20);
//        int a = 100;
//        int b = 1000;
//        int x = getMax(a, b);
//        System.out.println(getmax (angka1:10, angka2:20);
//        System.out.print("Method");
//        int angkaTerbesar = getMax (angka1:10, angka2:20);
//        int a (1){
//        return;
//        return 12 * feet;
//    }
//        lingkup tipe namaMetode(parameter){
//            Peryataan-peryataan (bodi metode);
//
//        } 
//    }
//static void cekHari(int tgl)
//{
//switch (tgl){
//}
//}
//    public static int getMax(int angka1, int angka2)
//            
//    {
//        
//        if(angka1>angka2)
//        {
//            System.out.println("angka yang besar adalah" + angka1);
//        
//        }
//        System.out.println("angka yang besar adalah" + angka2);
//        return 0;
//    }
//}
//static void ubahData(int a){
//a = 10;
//
//
//}
