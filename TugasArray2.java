package com.mycompany.pemogramandasar;
import java.util.*;
public class TugasArray2 {
    public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
        String[][] trainData = {
            {"Jenis", "Harga", "Diskon", "AC", "Colokan"},
            {"Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10", "Ada", "Ada"}
            };
        String jenisTiket = null;
        String fasilitasAC = null;
        String fasilitasColokan = null;
        int diskonTiket = 0;
        int totalHarga = 0;
        int totalBayar = 0;
        int jumlahTiket = 0;
        int hargaTiket = 0;
        boolean pesananTersedia = false;
        boolean sudahMemesan = false;
        while (true) {
            System.out.println("==============================================");
            System.out.println("Pilihan Menu:");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.print("Masukkan nomor menu: ");
            int pilihan = sc.nextInt();








            if (pilihan == 1) {
                int[] columnWidths = new int[trainData[0].length];
                for (int i = 0; i < trainData[0].length; i++) {
                    columnWidths[i] = trainData[0][i].length();
                    for (int j = 1; j < trainData.length; j++) {
                        if (trainData[j][i].length() > columnWidths[i]) {
                            columnWidths[i] = trainData[j][i].length();
                        }
                    }
                }
                for (int i = 0; i < trainData[0].length; i++) {
                    System.out.print(trainData[0][i]);
                    for (int j = 0; j < columnWidths[i] - trainData[0][i].length() + 1; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                for (int i = 1; i < trainData.length; i++) {
                    for (int j = 0; j < trainData[i].length; j++) {
                        System.out.print(trainData[i][j]);
                        for (int k = 0; k < columnWidths[j] - trainData[i][j].length() + 1; k++) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar Kereta Api yang ada AC adalah:");
                for (int i = 1; i < trainData.length; i++) {
                    if (trainData[i][3].equalsIgnoreCase("Ada")) {
                        System.out.println(trainData[i][0]);
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("Daftar Kereta Api yang ada Colokan adalah:");
                for (int i = 1; i < trainData.length; i++) {
                    if (trainData[i][4].trim().equalsIgnoreCase("Ada")) {
                        System.out.println(trainData[i][0]);
                    }
                }
            } 


else if (pilihan == 4) {
                if (!sudahMemesan) {
                    System.out.println("Masukkan jenis kereta api yang ingin Anda pesan:");
                    sc.nextLine();
                    jenisTiket = sc.nextLine();
                    hargaTiket = 0;
                    boolean jenisTiketValid = false;
                    for (int i = 1; i < trainData.length; i++) {
                        if (trainData[i][0].equalsIgnoreCase(jenisTiket)) {
                            hargaTiket = Integer.parseInt(trainData[i][1]);
                            diskonTiket = Integer.parseInt(trainData[i][2]);
                            fasilitasAC = trainData[i][3];
                            fasilitasColokan = trainData[i][4];
                            jenisTiketValid = true;
                            break;
                        }
                    }
                    if (jenisTiketValid) {
                        System.out.println("Masukkan jumlah tiket yang ingin Anda pesan:");
                        jumlahTiket = sc.nextInt();
                        pesananTersedia = true;
                        sudahMemesan = true;
                        System.out.println("Anda telah berhasil memesan tiket kereta api " + jenisTiket);
                    } else {
                        System.out.println("Jenis tiket tidak valid, silakan coba lagi.");
                    }
                } else {
                    System.out.println("Anda sudah memesan tiket sebelumnya.");
                }
            } 














else if (pilihan == 5) {
                if (pesananTersedia) {
                    totalHarga = (hargaTiket - (hargaTiket * diskonTiket / 100)) * jumlahTiket;
                    totalBayar = totalHarga;
                    System.out.println("============[ BUKTI PEMESANAN TIKET ]=============");
                    System.out.println("Jenis Kereta\t\t\t: " + jenisTiket);
                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);
                    System.out.println("Harga Satuan\t\t\t: " + hargaTiket);
                    System.out.println("Diskon Satuan\t\t\t: " + diskonTiket + " %");
                    System.out.println("Total yang harus dibayar\t: " + totalBayar);
                    System.out.println("Fasilitas yang tersedia \t: ");
                    System.out.println("AC\t\t\t\t: " + fasilitasAC);
                    System.out.println("Colokan\t\t\t\t: " + fasilitasColokan);
                } else {
                    System.out.println("Anda harus memesan tiket terlebih dahulu sebelum melihat bukti pesanan.");
                }
            }  else {
                System.out.println("Pilihan tidak valid. Program berhenti.");
                sc.close();
                break; 
            }
        }
      
    }
}

//package com.mycompany.pemogramandasar;
//import java.util.*;
//public class TugasArray2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[][] trainData = {
//            {"Jenis", "Harga", "Diskon", "AC", "Colokan"},
//            {"Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada"},
//            {"Bisnis", "100000", "5", "Ada", "Tidak Ada"},
//            {"Eksekutif", "200000", "7", "Ada", "Tidak Ada"},
//            {"Pariwisata", "300000", "10", "Ada", "Ada"}
//        };
//        String jenisTiket = null;
//        String fasilitasAC = null;
//        String fasilitasColokan = null;
//        int diskonTiket = 0;
//        int totalHarga = 0;
//        int totalBayar = 0;
//        int jumlahTiket = 0;
//        int hargaTiket = 0;
//        boolean pesananTersedia = false;
//        boolean sudahMemesan = false;
//
//        while (true) {
//            System.out.println("==============================================");
//            System.out.println("Pilihan Menu:");
//            System.out.println("1. Melihat Daftar Kereta Api");
//            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
//            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
//            System.out.println("4. Memesan Tiket Kereta Api");
//            System.out.println("5. Melihat Pesanan Tiket");
//            System.out.print("Masukkan nomor menu: ");
//            int pilihan = sc.nextInt();
//            if (pilihan == 1) {
//                int[] columnWidths = new int[trainData[0].length];
//                for (int i = 0; i < trainData[0].length; i++) {
//                    columnWidths[i] = trainData[0][i].length();
//                    for (int j = 1; j < trainData.length; j++) {
//                        if (trainData[j][i].length() > columnWidths[i]) {
//                            columnWidths[i] = trainData[j][i].length();
//                        }
//                    }
//                }
//                for (int i = 0; i < trainData[0].length; i++) {
//                    System.out.print(trainData[0][i]);
//                    for (int j = 0; j < columnWidths[i] - trainData[0][i].length() + 1; j++) {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//                for (int i = 1; i < trainData.length; i++) {
//                    for (int j = 0; j < trainData[i].length; j++) {
//                        System.out.print(trainData[i][j]);
//                        for (int k = 0; k < columnWidths[j] - trainData[i][j].length() + 1; k++) {
//                            System.out.print(" ");
//                        }
//                    }
//                    System.out.println();
//                }
//            } else if (pilihan == 2) {
//                System.out.println("Daftar Kereta Api yang ada AC adalah:");
//                for (int i = 1; i < trainData.length; i++) {
//                    if (trainData[i][3].equalsIgnoreCase("Ada")) {
//                        System.out.println(trainData[i][0]);
//                    }
//                }
//            } else if (pilihan == 3) {
//                System.out.println("Daftar Kereta Api yang ada Colokan adalah:");
//                for (int i = 1; i < trainData.length; i++) {
//                    if (trainData[i][4].trim().equalsIgnoreCase("Ada")) {
//                        System.out.println(trainData[i][0]);
//                    }
//                }
//            } else if (pilihan == 4) {
//                if (!sudahMemesan) {
//                    System.out.println("Masukkan jenis kereta api yang ingin Anda pesan:");
//                    sc.nextLine();
//                    jenisTiket = sc.nextLine();
//                    hargaTiket = 0;
//                    boolean jenisTiketValid = false;
//                    for (int i = 1; i < trainData.length; i++) {
//                        if (trainData[i][0].equalsIgnoreCase(jenisTiket)) {
//                            hargaTiket = Integer.parseInt(trainData[i][1]);
//                            diskonTiket = Integer.parseInt(trainData[i][2]);
//                            fasilitasAC = trainData[i][3];
//                            fasilitasColokan = trainData[i][4];
//                            jenisTiketValid = true;
//                            break;
//                        }
//                    }
//                    if (jenisTiketValid) {
//                        System.out.println("Masukkan jumlah tiket yang ingin Anda pesan:");
//                        jumlahTiket = sc.nextInt();
//                        pesananTersedia = true;
//                        sudahMemesan = true;
//                        System.out.println("Anda telah berhasil memesan tiket kereta api " + jenisTiket);
//                    } else {
//                        System.out.println("Jenis tiket tidak valid, silakan coba lagi.");
//                    }
//                } else {
//                    System.out.println("Anda sudah memesan tiket sebelumnya.");
//                }
//            } else if (pilihan == 5) {
//                if (pesananTersedia) {
//                    totalHarga = (hargaTiket - (hargaTiket * diskonTiket / 100)) * jumlahTiket;
//                    totalBayar = totalHarga;
//                    System.out.println("============[ BUKTI PEMESANAN TIKET ]=============");
//                    System.out.println("Jenis Kereta\t\t\t: " + jenisTiket);
//                    System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);
//                    System.out.println("Harga Satuan\t\t\t: " + hargaTiket);
//                    System.out.println("Diskon Satuan\t\t\t: " + diskonTiket + " %");
//                    System.out.println("Total yang harus dibayar\t: " + totalBayar);
//                    System.out.println("Fasilitas yang tersedia \t: ");
//                    System.out.println("AC\t\t\t\t: " + fasilitasAC);
//                    System.out.println("Colokan\t\t\t\t: " + fasilitasColokan);
//                } else {
//                    System.out.println("Anda harus memesan tiket terlebih dahulu sebelum melihat bukti pesanan.");
//                }
//            }  else {
//                System.out.println("Pilihan tidak valid. Program berhenti.");
//                sc.close();
//                break; 
//            }
//        }        
//    }
//}
