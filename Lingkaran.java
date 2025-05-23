/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lingkaran;

/**
 *
 * @author Asus
 */
public class Lingkaran {
    double phi = 3.141592;

    void hitungLuas(double r) {
        double luas = phi * r * r;

        // bilangan pecahan
        System.out.println("Luas Lingkaran Bilangan Pecahan: " + luas);

        // bilangan bulat (type-casting)
        System.out.println("Luas Lingkaran Bilangan Bulat: " + (int)luas);

        // bilangan pembulatan (rounding)
        System.out.println("Luas Lingkaran Pembulatan: " + Math.round(luas));
    }
}