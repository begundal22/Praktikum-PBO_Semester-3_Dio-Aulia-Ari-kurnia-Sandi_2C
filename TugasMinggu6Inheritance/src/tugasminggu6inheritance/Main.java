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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pegawai p = new Pegawai("2041720068", "Kurnia Sandi", "Kalimantan Selatan");
        Dosen d = new Dosen(12000, "2041720086", "Dio Aulia", "Kalimantan Selatan");
        DaftarGaji dg = new DaftarGaji(4500000);
        p.gaji = 4500000;
        d.setJumlahSKS(6);
        p.getGaji();
        dg.addPegawai(p);
        dg.addPegawai(d);
        dg.printSemuaGaji();

    }

}
