package com.prak1;
import java.util.Scanner;

class DaftarTugas {
    String[] tugas;
    int jumlahTugas;

    DaftarTugas() {
        this.tugas = new String[100];
        this.jumlahTugas = 0;
    }

    void tambahTugas(String tugasBaru) {
        if (jumlahTugas < tugas.length) {
            tugas[jumlahTugas] = tugasBaru;
            jumlahTugas++;
            System.out.println("Tugas \"" + tugasBaru + "\" ditambahkan.");
        } else {
            
        }
    }

    void hapusTugas(int indeksTugas) {
        if (jumlahTugas > 0) {
            if (indeksTugas >= 0 && indeksTugas < jumlahTugas) {
                System.out.println("Tugas \"" + tugas[indeksTugas] + "\" dihapus.");
                for (int i = indeksTugas; i < jumlahTugas - 1; i++) {
                    tugas[i] = tugas[i + 1];
                }
                tugas[jumlahTugas - 1] = null;
                jumlahTugas--;
            } else {
                System.out.println("Indeks tugas tidak ada.");
            }
        } else {
            System.out.println("Tidak ada tugas untuk dihapus.");
        }
    }

    void tampilkanTugas() {
        System.out.println("Daftar Tugas:");
        for (int i = 0; i < jumlahTugas; i++) {
            System.out.println(i + ". " + tugas[i]);
        }
    }

    public static void main(String[] args) {
        DaftarTugas daftarTugas = new DaftarTugas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDaftar Tugas");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Tampilkan Tugas");

            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan tugas: ");
                String tugasBaru = scanner.nextLine();
                daftarTugas.tambahTugas(tugasBaru);
            } else if (pilihan == 2) {
                System.out.print("Masukkan indeks tugas yang ingin dihapus: ");
                int indeksTugas = scanner.nextInt();
                scanner.nextLine();
                daftarTugas.hapusTugas(indeksTugas);
            } else if (pilihan == 3) {
                daftarTugas.tampilkanTugas();
            } else {
                System.out.println("Pilihan tidak ada");
            }
        }
    }
}
