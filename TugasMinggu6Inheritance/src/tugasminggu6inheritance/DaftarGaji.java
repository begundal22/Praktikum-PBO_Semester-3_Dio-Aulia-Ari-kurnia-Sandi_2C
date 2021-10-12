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
public class DaftarGaji {

    public Pegawai listPegawai[];
    public int g;

    public DaftarGaji(int g) {
        listPegawai = new Pegawai[g];
    }

    public void addPegawai(Pegawai pegawai) {
        listPegawai[g] = pegawai;
        g++;
    }

    public void printSemuaGaji() {
        for (int i = 0; i < g; i++) {
            System.out.println("Nama : " + listPegawai[i].getNama());
            System.out.println("NIP : " + listPegawai[i].nip);
            System.out.println("Alamat : " + listPegawai[i].alamat);
            System.out.println("Gaji : " + listPegawai[i].getGaji());
            System.out.println();
        }
    }
}
