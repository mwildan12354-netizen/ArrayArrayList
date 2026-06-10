/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class LatihanMandiri {

    public static void main(String[] args) {

        // Soal 1
        System.out.println("=== Soal 1 ===");
        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        belanja.remove(1);

        System.out.println("Isi list : " + belanja);
        System.out.println("Jumlah : " + belanja.size());

        // Soal 2
        System.out.println("\n=== Soal 2 ===");
        ArrayList<Integer> nilai = new ArrayList<>();

        nilai.add(70);
        nilai.add(95);
        nilai.add(60);
        nilai.add(88);
        nilai.add(75);

        int max = nilai.get(0);

        for (int n : nilai) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Nilai terbesar : " + max);

        // Soal 3
        System.out.println("\n=== Soal 3 ===");
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Adit");
        nama.add("Doni");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }    
}
