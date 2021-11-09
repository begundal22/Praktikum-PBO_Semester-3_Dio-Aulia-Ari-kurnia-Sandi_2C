/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author Dio
 */
public class Singa extends Binatang implements Karnivora {

    private String suara, warnaBulu;

    public Singa(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    public void displayMakanan() {
        System.out.println("Makanan Hewan ini adalah: Daging/ Hewani");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Binatang ini bernama: " + super.nama);
        System.out.println("Binatang ini memiliki jumlah kaki sebanyak: " + super.jmlKaki);
    }

    public void displayData() {
        this.displayBinatang();
        System.out.println("Suara dari hewan ini adalah: " + this.suara);
        System.out.println("Warna bulu dari hewan ini adalah: " + this.warnaBulu);
        this.displayMakanan();
    }

}
