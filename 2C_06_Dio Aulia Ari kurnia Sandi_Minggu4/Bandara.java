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
public class Bandara {

    private String asal, tujuan;

    public Bandara(String asal, String tujuan) {
        this.asal = asal;
        this.tujuan = tujuan;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String info() {
        String info = "";
        info += "Keberangkatan: " + asal + "\n";
        info += "Kedatangan: " + tujuan + "\n";
        return info;
    }
}
