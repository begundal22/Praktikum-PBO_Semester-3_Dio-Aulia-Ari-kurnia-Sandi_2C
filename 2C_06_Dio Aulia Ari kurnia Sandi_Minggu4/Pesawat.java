/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu4;

/**
 *
 * @author Dio
 */
public class Pesawat {

    private String maskapai, boeing;
    private Petugas pilot;
    private Petugas pramugari;
    private Penumpang penumpang;
    private Bandara bandara;

    public Pesawat(String maskapai, String boeing, Petugas pilot, Petugas pramugari, Penumpang penumpang, Bandara bandara) {
        this.maskapai = maskapai;
        this.boeing = boeing;
        this.pilot = pilot;
        this.pramugari = pramugari;
        this.penumpang = penumpang;
        this.bandara = bandara;
    }

    public Bandara getBandara() {
        return bandara;
    }

    public void setBandara(Bandara bandara) {
        this.bandara = bandara;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getBoeing() {
        return boeing;
    }

    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }

    public Petugas getPilot() {
        return pilot;
    }

    public void setPilot(Petugas pilot) {
        this.pilot = pilot;
    }

    public Petugas getPramugari() {
        return pramugari;
    }

    public void setPramugari(Petugas pramugari) {
        this.pramugari = pramugari;
    }

    public String info() {
        String info = "";
        info += "Nama Maskapai: " + this.maskapai + "\n";
        info += "Boeing: " + this.boeing + "\n";
        info += "Pilot: " + this.pilot.info() + "\n";
        info += "Pramugari: " + this.pramugari.info() + "\n";
        info += "Penumpang: " + this.penumpang.info() + "\n";
        info += "Bandara : " + this.bandara.info() + "\n";

        return info;
    }
}
