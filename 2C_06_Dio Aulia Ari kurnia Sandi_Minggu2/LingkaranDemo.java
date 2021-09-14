/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu2;

/**
 *
 * @author Dio
 */
public class LingkaranDemo {

    public static void main(String[] args) {
        Lingkaran L = new Lingkaran();

        L.r = 8;
        System.out.println("Jari-jari = " + L.r);
        System.out.println("Keliling Lingkaran = " + L.hitungKeliling(3.14));
        System.out.println("Luas Lingkaran = " + L.hitungLuas(3.14));

    }
}
