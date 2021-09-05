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
public class Cybertooth extends Hewan {

    private String jk, cbb;

    public void jumlahKaki(String newValue) {
        jk = newValue;
    }

    public void caraBerkembangBiak(String newValue) {
        cbb = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Jumlah Kulit: " + jk);
        System.out.println("Cara Berkembang Biak: " + cbb);
    }
}
