package com.prak1;

class Flora4 {
    public String nama;
    public int tinggi;
    public int jumlahDaun;

    Flora4(String nama, int tinggi, int jumlahDaun) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.jumlahDaun = jumlahDaun;
    }
}

class Flora5 {
    public String nama;
    public int tinggi;
    public int jumlahDaun;

    Flora5(String nama, int tinggi, int jumlahDaun) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.jumlahDaun = jumlahDaun;
    }
}

public class P1Nomor5_F1B021076 {
    public static void main(String[] args) {
        Flora4 mawarM = new Flora4("Mawar Merah", 50, 10);
        Flora4 matahari = new Flora4("Matahari Kuning", 40, 12);

        Flora5 mawarH = new Flora5("Mawar Hijau", 40, 20);
        Flora5 matahariO = new Flora5("Matahari Orange", 80, 15);

        System.out.println("Informasi Bunga Mawar:");
        System.out.println("Nama: " + mawarM.nama);
        System.out.println("Tinggi (cm): " + mawarM.tinggi);
        System.out.println("Jumlah Daun: " + mawarM.jumlahDaun);
        
        System.out.println("\nInformasi Bunga Matahari:");
        System.out.println("Nama: " + matahari.nama);
        System.out.println("Tinggi (cm): " + matahari.tinggi);
        System.out.println("Jumlah Daun: " + matahari.jumlahDaun);

        System.out.println("\nInformasi Bunga Mawar Hijau:");
        System.out.println("Nama: " + mawarH.nama);
        System.out.println("Tinggi (cm): " + mawarH.tinggi);
        System.out.println("Jumlah Daun: " + mawarH.jumlahDaun);

        System.out.println("\nInformasi Bunga Matahari Orange:");
        System.out.println("Nama: " + matahariO.nama);
        System.out.println("Tinggi (cm): " + matahariO.tinggi);
        System.out.println("Jumlah Daun: " + matahariO.jumlahDaun);
    }
}


