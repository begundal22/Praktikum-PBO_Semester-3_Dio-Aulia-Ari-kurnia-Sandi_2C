/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu6inheritance;

/**
 *
 * @author Dio
 */
public class Dosen extends Pegawai {

    protected int jumlahSKS;
    protected int TARIF_SKS;

    Dosen(int TarifSKS, String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.TARIF_SKS = TarifSKS;
    }

    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        int gaji = jumlahSKS * TARIF_SKS;
        System.out.println("Gaji Dosen : " + gaji);
        return gaji;
    }
}
