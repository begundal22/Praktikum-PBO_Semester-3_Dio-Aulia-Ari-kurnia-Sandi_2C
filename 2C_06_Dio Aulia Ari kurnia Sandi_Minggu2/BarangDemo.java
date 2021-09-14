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
public class BarangDemo {

    public static void main(String[] args) {
        Barang B = new Barang();

        B.kode = "20F";
        B.nb = "Sabun";
        B.hd = 5000;
        B.diskon = 20;
        B.hitungHargaJual(20, 5000);
        B.tampilData();

    }
}
