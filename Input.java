/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.pemogramandasar;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner; 
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        System.out.print("masukkan nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nilai2 = input.nextInt();
        hasil = nilai1+nilai2;
        System.out.print("maka hasil : "+hasil);
    }
}
