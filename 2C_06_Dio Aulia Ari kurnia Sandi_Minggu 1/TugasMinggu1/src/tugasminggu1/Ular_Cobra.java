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
public class Ular_Cobra extends Hewan {

    private String ap, cbg;

    public void alatPertahanan(String newValue) {
        ap = newValue;
    }

    public void caraBergerak(String newValue) {
        cbg = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Alat Pertahanan Diri: " + ap);
        System.out.println("Cara Bergerak: " + cbg);
    }
}
