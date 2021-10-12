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
public class Pegawai {

    public String nip;
    public String nama;
    public String alamat;
    public int gaji;

    Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}
