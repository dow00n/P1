import java.util.Scanner;
import java.io.IOException;


public class KalkulatorDiskon {
    double price, persen, result;
    //konstruktor default
    public KalkulatorDiskon(){}
    //konstruktor 2 parameter
    public KalkulatorDiskon(double price, double persen){
        this.price = price;
        this.persen = persen;
    }
    public double getPrice() {
        return price;
    }

    public double getPersen() {
        return persen;
    }
    public double hitungDiskon(){
        result = price * (1 - (persen/100));
        return result;
    }
    public void display(){
        System.out.println("harga barang: "+getPrice());
        System.out.println("Jumlah persenan: "+getPersen());
        System.out.println("hasil Diskon: "+hitungDiskon());
    }

    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan harga barang: ");
        double harga = scanner.nextDouble();
        System.out.print("masukkan jumlah persenan: ");
        double persen = scanner.nextDouble();

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        KalkulatorDiskon k1 = new KalkulatorDiskon();
        KalkulatorDiskon k2 = new KalkulatorDiskon(harga, persen);
        
        System.out.println("object K1");
        k1.display();
        System.out.println("");
        System.out.println("Object K2");
        k2.display();

        scanner.close();
    }
}
