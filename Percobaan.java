/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.pemogramandasar;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Percobaan {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner masukkan = new Scanner(System.in);
        int bilangan1, bilangan2;
        System.out.println("Masukkan bilangan pertama: ");
        bilangan1 = masukkan.nextInt();
        System.out.println("Masukkan bilangan kedua: ");
        bilangan2 = masukkan.nextInt();
        System.out.println("Hasil penjumlahan\t\t: " + (bilangan1 + bilangan2));
        System.out.println("Hasil pengurangan\t\t: " + (bilangan1 - bilangan2));
        System.out.println("Hasil perkalian\t\t\t: " + (bilangan1 * bilangan2));
        System.out.println("Hasil pembagian\t\t\t: " + (double)bilangan1 / bilangan2);
        
    }
}
