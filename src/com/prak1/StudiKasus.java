package com.prak1;

import java.util.Scanner;

class Flora {
    String nama;
    int tinggi;
    int jumlahDaun;
}


class Flora1 {
    String name;
    int tinggi;
    int jumlahDaun;
    String jenis;
    int berat;

}

class Flora2 {
    String name;
    int tinggi;
    int jumlahDaun;
    String jenis;
    int berat;

    void pengelompokkan() {

        if (jenis == "monokotil") {
            System.out.println(this.name + " adalah tumbuhan berbiji 1");
            System.out.println("\n");
        } else {
            System.out.println(this.name + " adalah tumbuhan berbiji 2");
            System.out.println("\n");
            
        }
    }

    void tampilkan(){
        System.out.println("Nama : " + this.name);
        System.out.println("Tinggi : " + this.tinggi + "cm");
        System.out.println("Jumlah Daun : " + this.jumlahDaun + "daun");
        System.out.println("Jenis : " + this.jenis);
        System.out.println("Berat : " + this.berat + "ton");
        
        this.pengelompokkan();



    }
}


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







public class StudiKasus {
    public static void main(String[] args) {
    //Membuat attribut dari sebuah class dan buatkan objek

    Flora mangga = new Flora();
    mangga.nama = "Mangga";
    mangga.tinggi = 500;
    mangga.jumlahDaun = 2000;

    String a = mangga.nama;
    int b = mangga.tinggi;
    int c = mangga.jumlahDaun;

    System.out.println("\n");
    System.out.println("Jobsheet 1 : Membuat attribut dari sebuah class dan buatkan objek \n");
    System.out.println("Nama : "+ a);
    System.out.println("Tinggi : " + b + "cm" );
    System.out.println("Jumlah Daun : " + c + "daun");
    System.out.println("\n");
    System.out.println("========================================");
    System.out.println("\n");


    //Membuat 5 attribut kemudian tampilkan dalam 2 objek yang berbeda
    Flora1 rambutan = new Flora1();
    rambutan.name = "Rambutan";
    rambutan.tinggi = 500;
    rambutan.jumlahDaun = 2000;
    rambutan.jenis = "Monokotil";
    rambutan.berat = 2;

    System.out.println("Jobsheet 2 : Membuat 5 attribut kemudian tampilkan dalam 2 objek yang berbeda \n");
    System.out.println("Nama : " + rambutan.name);
    System.out.println("Tinggi : " + rambutan.tinggi + "cm");
    System.out.println("Jumlah Daun : " + rambutan.jumlahDaun + "daun");
    System.out.println("Jenis : " + rambutan.jenis);
    System.out.println("Berat : " + rambutan.berat + "ton");
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
    System.out.println("========================================");
    System.out.println("\n");


    //Membuat class dan method

    System.out.println("Jobsheet 3 : Membuat class dan method \n");

    Flora2 jambu = new Flora2();
    jambu.name = "Jambu";
    jambu.tinggi = 500;
    jambu.jumlahDaun = 2000;
    jambu.jenis = "dikotil";
    jambu.berat = 2;
    jambu.tampilkan();


    Flora2 salak = new Flora2();
    salak.name = "salak";
    salak.tinggi = 400;
    salak.jumlahDaun = 50;
    salak.jenis = "monokotil";
    salak.berat = 1;
    salak.tampilkan();

    System.out.println("========================================");
    System.out.println("\n");




    //Membuat program inputan dinamis menggunakan studi kasus masing-masing dengan 5 buah objek yang berbeda

    Scanner scanner = new Scanner(System.in);

        String nama;
        int tinggi;
        int jumlahDaun;

        System.out.println("Jobsheet 4 : Membuat program inputan dinamis menggunakan studi kasus masing-masing dengan 5 buah objek yang berbeda \n");

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

        System.out.println("========================================");
        System.out.println("\n");





    //Membuat Objek Konstruktor dari 2 kelas yang berbeda masing masing 2 objek

    Flora4 mawarM = new Flora4("Mawar Merah", 50, 10);
    Flora4 matahari = new Flora4("Matahari Kuning", 40, 12);

    Flora5 mawarH = new Flora5("Mawar Hijau", 40, 20);
    Flora5 matahariO = new Flora5("Matahari Orange", 80, 15);

    System.out.println("Jobsheet 5 : Membuat Objek Konstruktor dari 2 kelas yang berbeda masing masing 2 objek\n");

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

    
    System.out.println("\n");
    System.out.println("========================================");
    System.out.println("\n");


    
    }
}

