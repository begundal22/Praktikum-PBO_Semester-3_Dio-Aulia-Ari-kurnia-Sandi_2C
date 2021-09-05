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
public class Air_Conditioner {

    private String mode, merek;
    private int suhu = 18;

    public void merek(String newValue) {
        merek = newValue;
    }

    public void naik(int s) {
        suhu += s;
    }

    public void turun(int s) {
        suhu -= s;
    }

    public void mode(String newValue) {
        mode = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Mode: " + mode);
        System.out.println("Suhu: " + suhu);
    }
}
