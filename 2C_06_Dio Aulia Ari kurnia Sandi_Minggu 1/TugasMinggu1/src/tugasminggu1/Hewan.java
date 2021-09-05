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
public class Hewan {

    private String nh;
    private String jh;
    private String cb;

    public void namaHewan(String newValue) {
        nh = newValue;
    }

    public void jenisHewan(String newValue) {
        jh = newValue;
    }

    public void caraBernafas(String newValue) {
        cb = newValue;
    }

    public void cetakStatus() {
        System.out.println("Nama Hewan: " + nh);
        System.out.println("Jenis Hewan: " + jh);
        System.out.println("Cara Bernafas: " + cb);

    }
}
