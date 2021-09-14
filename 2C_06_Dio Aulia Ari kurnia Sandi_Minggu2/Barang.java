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
public class Barang {

    public String kode, nb;
    public int hd;
    public float diskon;

    public int hitungHargaJual(float diskon, int hd) {
        diskon = (diskon / 100) * hd;
        float hj = hd - diskon;

        return (int) hj;
    }

    public void tampilData() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama barang : " + nb);
        System.out.println("Harga Dasar : " + hd);
        System.out.println("Diskon : " + diskon);
        System.out.println("                             -");
        System.out.println("==============================");
        System.out.println("Total Bayar : " + hitungHargaJual(diskon, hd));

    }
}
