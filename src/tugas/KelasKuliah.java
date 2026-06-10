/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan koleksi objek Mahasiswa
    private final ArrayList<Mahasiswa> daftarMahasiswa;

    // Constructor
    public KelasKuliah() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    // Method untuk menambahkan mahasiswa ke dalam ArrayList
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method untuk menghitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method untuk menghitung jumlah mahasiswa yang lulus (nilai >= 60)
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                count++;
            }
        }
        return count;
    }

    // Method untuk menampilkan semua data mahasiswa saat ini
    public void tampilkanSemua() {
        System.out.println("---------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("---------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.printf("%-15s %-15s %-10.2f %-10s\n", mhs.getNpm(), mhs.getNama(), mhs.getNilai(), status);
        }
        System.out.println("---------------------------------------------");
    }

    // Method pembantu untuk mengambil total data mahasiswa terupdate
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }
}