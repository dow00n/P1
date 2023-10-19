//Tugas Kalkulator Kecepatan
package p1tugas_f1b021050;

import java.util.Scanner;

class Perhitungan{
    float kecepatan;
    float jarak;
    float waktu;

    public Perhitungan(float jrk, float wkt){
        jarak = jrk;
        waktu = wkt;
    }

    public float hitung(){
        kecepatan = jarak / waktu;
        return kecepatan;
    }
}

public class P1Tugas_F1B021050 {
    public static void main(String[] args){
        Scanner kalk = new Scanner(System.in);
        System.out.println("Masukkan nilai jarak dalam satuan meter = ");
        float jarak = kalk.nextFloat();

        System.out.println("Masukkan nilai waktu dalam satuan detik = ");
        float waktu = kalk.nextFloat();

        Perhitungan kris = new Perhitungan(jarak, waktu);
        System.out.println("Kecepatan = "+ kris.hitung()+" m/s");
    }
}
