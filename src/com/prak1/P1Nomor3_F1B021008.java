package com.prak1;

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




public class job3 {
 
public static void main(String[] args) {

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



 }
}

