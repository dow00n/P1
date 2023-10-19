package com.prak1;

import java.util.Scanner;

class Flora3 {
    String nama;
    int tinggi;
    int jumlahDaun;

    Flora3(String nama, int tinggi, int jumlahDaun) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.jumlahDaun = jumlahDaun;
    }
}

public class P1Nomor4_F1B021076 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nama;
        int tinggi;
        int jumlahDaun;


        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data Flora ke-" + (i + 1));
            System.out.print("Nama: ");
            nama = scanner.nextLine();
            System.out.print("Tinggi(cm): ");
            tinggi = Integer.parseInt(scanner.nextLine());
            System.out.print("JumlahDaun(daun): ");
            jumlahDaun = Integer.parseInt(scanner.nextLine());
            System.out.println("\n");

            Flora3 flora = new Flora3(nama, tinggi, jumlahDaun);
            System.out.println("Data Flora ke-" + (i + 1) + ":");
            System.out.println("Nama: " + flora.nama);
            System.out.println("Tinggi (cm): " + flora.tinggi);
            System.out.println("Jumlah Daun: " + flora.jumlahDaun);
            System.out.println("\n");
        }

        scanner.close();
    }
}



