/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

public class Mahasiswa {
    // Atribut
    private final String nama;
    private final String npm;
    private final double nilai;

    // Constructor
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Method untuk mengecek kelulusan
    public boolean lulus() {
        return this.nilai >= 60;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }
}
