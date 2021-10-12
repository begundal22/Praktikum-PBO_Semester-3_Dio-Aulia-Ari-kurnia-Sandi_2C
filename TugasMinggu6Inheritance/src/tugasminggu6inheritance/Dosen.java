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

    public int jumlahSKS;
    public int Tarif_SKS;

    Dosen(int Tarif_SKS, String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.Tarif_SKS = Tarif_SKS;
    }

    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        int gaji = jumlahSKS * Tarif_SKS;
        System.out.println("Gaji Dosen : " + gaji);
        return gaji;
    }
}
