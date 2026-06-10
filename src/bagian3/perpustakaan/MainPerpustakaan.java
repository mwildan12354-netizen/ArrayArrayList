package bagian3.perpustakaan;

/**
 *
 * @author ACER
 */
public class MainPerpustakaan {
    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku b2 = new Buku("Sang Pemimpi", "Andrea Hirata", 2006);
        Buku b3 = new Buku("Bumi", "Tere Liye", 2014);

        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.tambahBuku(b3);

        System.out.println("=== DATA BUKU ===");
        perpus.tampilkanSemuaBuku();

        System.out.println("=== PINJAM BUKU ===");
        perpus.pinjamBuku("Bumi");

        System.out.println("\n=== SETELAH DIPINJAM ===");
        perpus.tampilkanSemuaBuku();

        System.out.println("=== KEMBALIKAN BUKU ===");
        perpus.kembalikanBuku("Bumi");

        System.out.println("\n=== SETELAH DIKEMBALIKAN ===");
        perpus.tampilkanSemuaBuku();

        System.out.println("=== CARI PENULIS ===");
        perpus.cariPenulis("Andrea Hirata");
    }
}