/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author ACER
 */
public class LatihanSuhu {

    public static void main(String[] args) {
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};

        double max = suhu[0];
        double min = suhu[0];

        for (double s : suhu) {
            if (s > max) {
                max = s;
            }

            if (s < min) {
                min = s;
            }
        }

        System.out.println("Suhu tertinggi : " + max);
        System.out.println("Suhu terendah  : " + min);
    }
}
