package bagian3.perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Perpustakaan {
    private final ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanSemuaBuku() {
        for (Buku buku : daftarBuku) {
            buku.info();
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.pinjam();
                System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    // Soal No. 1
    public void kembalikanBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.kembalikan();
                System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    // Soal No. 3
    public void cariPenulis(String penulis) {
        System.out.println("Daftar buku karya " + penulis + ":");

        boolean ditemukan = false;

        for (Buku buku : daftarBuku) {
            if (buku.getPenulis().equalsIgnoreCase(penulis)) {
                buku.info();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada buku dari penulis tersebut.");
        }
    }
}