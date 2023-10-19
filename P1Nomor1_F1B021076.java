package com.prak1;


class Flora {
    String nama;
    int tinggi;
    int jumlahDaun;
}

public class P1Nomor1_F1B021076 {
    public static void main(String[] args) {
        Flora mangga = new Flora();
        mangga.nama = "Mangga";
        mangga.tinggi = 500;
        mangga.jumlahDaun = 2000;

        String a = mangga.nama;
        int b = mangga.tinggi;
        int c = mangga.jumlahDaun;

        System.out.println("Nama : "+ a);
        System.out.println("Tinggi : " + b + "cm" );
        System.out.println("Jumlah Daun : " + c + "daun");
    }
}   
