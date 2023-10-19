//Pengecek Angka Ganjil atau Genap
import java.util.Scanner;

public class P1Tugas_F1B021076 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkin angkanya: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " itu angka genap");
        } 
        else {
            System.out.println(angka + " itu angka ganjil");
        }
    }
}
