/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.pemogramandasar;

/**
 *
 * @author WINDOWS 10
 */
public class output3 {

    /**
     * apabila menggunakan printf untuk merapikan dokumen hasil coding
     * menggunakan symbol (-) untuk menampilan indent
     * @param args
     */
    public static void main(String args[]) {
        System.out.printf("%s%c\n","Pemrograman Java",'|');
        System.out.printf("%30s%c\n","Pemrograman" +"Java",'|');
        System.out.printf("%-30s%c\n","PemrogramanJava",'|');
        System.out.printf("%30.5s%c\n","PemrogramanJava",'|');
    }
}
