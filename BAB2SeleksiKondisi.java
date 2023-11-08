package com.mycompany.pemogramandasar;
import java.util.Scanner;
public class BAB2SeleksiKondisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenu :");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        for (int i = 0; i < 4;i++){ 
        System.out.print("Pilihan anda \t: ");
        int calculate = input.nextInt();
        if (calculate > 3) {System.out.println("Data tak ditemukan, program dihentikan ...");
            break;}  
        switch (calculate) {
            case 1 :
                System.out.print("Masukkan Panjang Persegi: ");
                int lenght = input.nextInt();
                System.out.print("Masukkan Lebar Persegi: ");
                int width = input.nextInt();
                System.out.println("Keliling Persegi Panjang\t:" + ((lenght + width)*2));
                System.out.print("Luas Persegi Panjang\t\t:" + lenght * width);
                System.out.println("\n");
                break;
            case 2 :
                System.out.print("Masukkan Panjang Jari Jari\t: ");
                float row = input.nextFloat();
                System.out.println("Luas Lingkaran Adalah: " + Math.PI * Math.pow(row, 2) + " cm");
                System.out.println("Keliling Lingkaran adalah : " + Math.PI * + row * 2 + " cm^2\n");
                break;
            case 3 :
                System.out.print("Masukkan a\t: ");
                int a = input.nextInt();
                System.out.print("Masukkan b\t: ");
                int b = input.nextInt();
                System.out.print("Masukkan r\t: ");
                int r = input.nextInt();
                System.out.println("Keliling Segitiga adalah \t: " + (a + b + r) + " cm");
                System.out.println("Luas Segitiga adalah \t\t: " + (a * b) / 2 + " cm2\n");
                break;
            }
        input.close();
        }       
    } 
}
//Penjelasan singkat:
//
//Program ini memiliki tiga pilihan menu: menghitung persegi panjang, lingkaran, atau segitiga.
//Pengguna diminta memasukkan pilihan (1, 2, atau 3) untuk memilih bentuk yang ingin dihitung.
//Jika pengguna memasukkan angka lebih dari 3, program akan memberi pesan bahwa data tidak ditemukan dan program dihentikan.
//Menggunakan struktur switch untuk menangani setiap pilihan menu yang dimasukkan pengguna.
//Pada setiap kasus, program meminta input yang diperlukan dari pengguna, menghitung luas dan keliling sesuai dengan rumus masing-masing bentuk, dan mencetak hasilnya.
