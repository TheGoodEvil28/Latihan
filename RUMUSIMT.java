package com.mycompany.pemogramandasar;
import java.util.Scanner;
public class RUMUSIMT {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 1; i <= 2; i++) {
                float berat,tinggi,IMT;
                System.out.print("Berat badan (kg) :"); 
                berat = input.nextFloat();
                System.out.print("tinggi badan (m) :");
                tinggi = input.nextFloat();
                
                IMT = (float) (berat / Math.pow(tinggi, 2));
                IMT = (float) (Math.round(IMT * 100.0) / 100.0);
                if ( IMT <= 18.5 ) {
                    System.out.println("IMT  = "+ IMT + " Termasuk Kurus\n" );
                    continue;
                }else if (IMT > 18.5 && IMT < 25){
                    System.out.println("IMT  = "+ IMT + " Termasuk Normal\n");
                }else if (IMT > 25 && IMT < 30){
                    System.out.printf("IMT  = "+ IMT + " Termasuk Gemuk\n");
                }else if (IMT > 30){
                    System.out.println("IMT  = "+ IMT + " Termasuk Kegemukan\n"); 
                }
            }
        }
    }   
}
//Berikut adalah penjelasan singkat mengenai kode tersebut:
//
//Program ini menggunakan kelas Scanner untuk memungkinkan pengguna memasukkan berat badan dan tinggi badan.
//Loop for digunakan untuk meminta input berat badan dan tinggi badan sebanyak 2 kali.
//Untuk setiap iterasi loop, program akan meminta dan menerima input berat badan (kg) dan tinggi badan (m).
//Program menghitung IMT (Indeks Massa Tubuh) dengan rumus IMT = berat / (tinggi^2).
//Nilai IMT dibulatkan menjadi dua desimal dengan menggunakan Math.round.
//Berdasarkan nilai IMT, program menampilkan kategori IMT (Kurus, Normal, Gemuk, atau Kegemukan).