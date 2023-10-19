package com.prak1;

class Flora1 {
    String name;
    int tinggi;
    int jumlahDaun;
    String jenis;
    int berat;

}



public class job2 {
    public static void main(String[] args) {
        Flora1 mangga = new Flora1();
        mangga.name = "Mangga";
        mangga.tinggi = 500;
        mangga.jumlahDaun = 2000;
        mangga.jenis = "Monokotil";
        mangga.berat = 2;

        System.out.println("Nama : " + mangga.name);
        System.out.println("Tinggi : " + mangga.tinggi + "cm");
        System.out.println("Jumlah Daun : " + mangga.jumlahDaun + "daun");
        System.out.println("Jenis : " + mangga.jenis);
        System.out.println("Berat : " + mangga.berat + "ton");
        System.out.println("\n");

        Flora1 pisang = new Flora1();
        pisang.name = "pisang";
        pisang.tinggi = 400;
        pisang.jumlahDaun = 50;
        pisang.jenis = "Dikotil";
        pisang.berat = 1;
    
        System.out.println("Nama : " + pisang.name);
        System.out.println("Tinggi : " + pisang.tinggi + "cm");
        System.out.println("Jumlah Daun : " + pisang.jumlahDaun + "daun");
        System.out.println("Jenis : " + pisang.jenis);
        System.out.println("Berat : " + pisang.berat + "ton");
        System.out.println("\n");
    }
}
