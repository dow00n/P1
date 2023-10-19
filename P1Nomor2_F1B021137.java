//Membuat 5 atribut kemudian tampilkan dalam 2 objek yang berbeda
package p1nomor2_F1B021137;
class tanaman {
    String nama; 
    String warna;
    String jenis;
    String habitat;
    int tinggi;
}

public class P1Nomor2_F1B021137 {
    public static void main(String[] args) {
    tanaman anggrek = new tanaman();
    tanaman tulip = new tanaman();

    anggrek.nama= "Anggrek";
    anggrek.warna= "Ungu";
    anggrek.jenis= "Orchidaceae";
    anggrek.habitat= "Taman";
    anggrek.tinggi= 15 ;

    tulip.nama= "Tulip";
    tulip.warna= "Putih";  
    tulip.jenis= "Liliaceae";
    tulip.habitat= "Taman";
    tulip.tinggi= 10;
    
    System.out.println(anggrek.nama);
    System.out.println(anggrek.warna);
    System.out.println(anggrek.jenis);
    System.out.println(anggrek.habitat);
    System.out.println(anggrek.tinggi);
    System.out.println("=================");
    System.out.println(tulip.nama);
    System.out.println(tulip.warna);
    System.out.println(tulip.jenis);
    System.out.println(tulip.habitat);
    System.out.println(tulip.tinggi);
    System.out.println("=================");
    
}
}
