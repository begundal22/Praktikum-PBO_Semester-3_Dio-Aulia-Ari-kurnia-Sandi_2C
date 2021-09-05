/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu1;

/**
 *
 * @author Dio
 */
public class Truk {

    private String jenis, merek;
    private int gear;
    private int kecepatan = 0;

    public void merek(String newValue) {
        merek = newValue;
    }

    public void jenis(String newValue) {
        jenis = newValue;
    }

    public void gear(int g) {
        gear = g;
    }

    public void gas(int gas) {
        kecepatan += gas;
    }

    public void rem(int rem) {
        kecepatan -= rem;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Jenis: " + jenis);
        System.out.println("Gear: " + gear);
        System.out.println("Kecepatan: " + kecepatan);

    }
}
