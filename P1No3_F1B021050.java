//Membuat class dan method
package p1no3_f1b021050;
class tanaman {
    String nama; 
    String warna;
    String jenis;
    String habitat;
    int tinggi;


public tanaman (String nm, String wrn, String jns, String hbt, int tg){
     nama = nm;
     warna = wrn;
     jenis = jns;
     habitat = hbt;
     tinggi = tg;
}

public void tampil(){
    System.out.println(""+nama);
    System.out.println(""+warna);
    System.out.println(""+jenis);
    System.out.println(""+habitat);
    System.out.println(""+tinggi);
    System.out.println("=================");
}
}

public class P1No3_F1B021050 {
    public static void main(String[] args) {
        tanaman anggrek = new tanaman("Anggrek","Ungu","Orchidaceae","Taman",15);
        tanaman tulip = new tanaman("Tulip","Putih","Liliaceae","Taman",10);

        anggrek.tampil();
        tulip.tampil();
}
}

