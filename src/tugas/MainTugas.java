/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Poin 4: Menyimpan daftar nama mata kuliah dalam array String (minimal 3, ukuran tetap) dan menampikannya
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data", "Jaringan Komputer"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Poin 3: Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Poin 3: Menambah minimal 5 objek Mahasiswa di awal
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "23010101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "23010102", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Chandra", "23010103", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Dodi", "23010104", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "23010105", 90.0));

        // Menampilkan data mahasiswa awal
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();

        // Poin 5: Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("=== STATISTIK KELAS ===");
        System.out.printf("Rata-rata Nilai : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Lulus    : " + kelas.jumlahLulus() + " mahasiswa");
        System.out.println("Total Data      : " + kelas.getJumlahData() + " mahasiswa\n");

        // Poin 6: Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println(">>> Menambahkan 1 mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fitri", "23010106", 65.0));

        // Poin 6: Menampilkan kembali jumlah data terbaru beserta data terbarunya
        System.out.println("\n=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
        
        System.out.println("=== STATISTIK TERBARU ===");
        System.out.printf("Rata-rata Nilai : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Lulus    : " + kelas.jumlahLulus() + " mahasiswa");
        System.out.println("Total Data Baru : " + kelas.getJumlahData() + " mahasiswa");
    }
}
