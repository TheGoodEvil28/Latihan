
package com.mycompany.pemogramandasar;
import java.util.Scanner;
public class PerhitunganUpahdanDenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
        int upah, lembur, denda, total;
        System.out.print("Jumlah jam kerja tiap minggu: ");
        int jam = input.nextInt();
        int tarifBiasa = 5000;
        int tarifLembur = 6000;
        int batasMinimal = 50;
        int batasMaksimal = 60;
        if (jam <= batasMinimal) {
            upah = jam * tarifBiasa;
            lembur = 0;
            denda = (batasMinimal - jam) * 1000;
            total = upah - denda;
        } else if (jam > batasMaksimal) {
            upah = batasMaksimal * tarifBiasa;
            lembur = (jam - batasMaksimal) * tarifLembur;
            denda = 0;
            total = upah + lembur - denda;
        } else {
            upah = jam * tarifBiasa;
            lembur = 0;
            denda = 0;
            total = upah + lembur - denda;
        } 
        System.out.println("Jam Kerja \t: " + jam);
        System.out.println("Upah\t= Rp. \t" + upah);
        System.out.println("Lembur\t= Rp. \t" + lembur);
        System.out.println("Denda\t= Rp. \t" + denda);
        System.out.println("-----------------------");
        System.out.print("Total\t= Rp. \t" + total );
        System.out.println("\n");
        }
        input.close();
        }
        
    }
//Penjelasan singkat:
//
//Program ini menggunakan kelas Scanner untuk memungkinkan pengguna memasukkan jumlah jam kerja per minggu.
//Program melakukan perhitungan upah, lembur, dan denda berdasarkan jumlah jam kerja.
//Program memeriksa apakah jumlah jam kerja kurang dari atau sama dengan batas minimal, lebih dari batas maksimal, atau berada di antara keduanya.
//Berdasarkan hasil perhitungan, program mencetak upah, lembur, denda, dan total upah mingguan.
//Program menggunakan loop for untuk memproses input sebanyak 3 kali. Setiap iterasi memproses satu input jumlah jam kerja.
//Terakhir, program menutup objek Scanner untuk membersihkan sumber daya.
    
    

