//Membuat Objek Konstruktor dari 2 kelas yang berbeda masing masing 2 objek
package p1nomor5_f1b021137;

class tanaman1 {
    String nama1; 
    String warna1;
    String jenis1;
    String habitat1;
    int tinggi1;

public tanaman1 (String nma, String wrna, String jnis, String hbtt,int tng){
     nama1 = nma;
     warna1 = wrna;
     jenis1 = jnis;
     habitat1 = hbtt;
     tinggi1 = tng;
}
public void tampil(){
    System.out.println(""+nama1);
    System.out.println(""+warna1);
    System.out.println(""+jenis1);
    System.out.println(""+habitat1);
    System.out.println(""+tinggi1);
}
}

class tanaman2 {
    String nama2; 
    String warna2;
    String jenis2;
    String habitat2;
    int tinggi2;
    
public tanaman2 (String nm, String wrn, String jns, String hbt, int tg){
     nama2 = nm;
     warna2 = wrn;
     jenis2 = jns;
     habitat2 = hbt;
     tinggi2 = tg;
}

public void tampil(){
    System.out.println(""+nama2);
    System.out.println(""+warna2);
    System.out.println(""+jenis2);
    System.out.println(""+habitat2);
    System.out.println(""+tinggi2);

}
}

public class P1Nomor5_F1B021137 {
    public static void main(String[] args) {
        tanaman1 anggrek = new tanaman1("Anggrek","Ungu","Orchidaceae","Taman",15);
        tanaman1 mawar = new tanaman1 ("Mawar","Merah","Rosaceae","Taman",12);
        tanaman2 tulip = new tanaman2("Tulip","Putih","Liliaceae","Taman",10);
        tanaman2 matahari = new tanaman2("Matahari","Kuning","Asteraceae","Taman",17);

        System.out.println("====Tanaman A====");
        anggrek.tampil();
        System.out.println("-----------------");
        mawar.tampil();
        System.out.println("====Tanaman B====");    
        tulip.tampil();
        System.out.println("-----------------");
        matahari.tampil();
        
}
}
