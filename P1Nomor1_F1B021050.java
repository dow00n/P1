//Membuat attribut dari sebuah class dan buatkan objek
package p1nomor1_f1b021050;
class tanaman {
    String nama; 
    String warna;
    String jenis;
}

public class P1Nomor1_F1B021050 {
    public static void main(String[] args) {
    tanaman anggrek = new tanaman(); 

    anggrek.nama= "Anggrek";
    anggrek.warna= "Ungu";
    anggrek.jenis= "Orchidaceae";
        
    System.out.println(anggrek.nama);
    System.out.println(anggrek.warna);
    System.out.println(anggrek.jenis);
}
}

