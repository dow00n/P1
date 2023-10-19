//Membuat program inputan dinamis menggunakan studi kasus masing-masing dengan 5 buah objek yang berbeda
package p1nomor4_f1b021050;
import java.util.Scanner;

class tanaman {
    String nama; 
    int tinggi;
    String jenis;

public tanaman (String nm, int tg, String jns){
     nama = nm;
     tinggi = tg;
     jenis = jns;
}
}

public class P1Nomor4_F1B021050 {
    public static void main(String[] args) {
        Scanner kris = new Scanner(System.in);

        String nama;
        int tinggi;
        String jenis;
      
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data Flora ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama = kris.nextLine();
            System.out.print("Tinggi: ");
            tinggi = Integer.parseInt(kris.nextLine());
            System.out.print("Jenis : ");
            jenis = kris.nextLine();
            System.out.println("\n");

            tanaman tnm = new tanaman (nama, tinggi, jenis);
            System.out.println("Data Flora ke -" + (i + 1) + ":");
            System.out.println("Nama    : " + tnm.nama);
            System.out.println("Tinggi  : " + tnm.tinggi);
            System.out.println("Jenis   : " + tnm.jenis);
            System.out.println("\n");
        }
        kris.close();
    }
}
