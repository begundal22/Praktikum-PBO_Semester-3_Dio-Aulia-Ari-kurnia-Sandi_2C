/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu2;

/**
 *
 * @author Dio
 */
public class TokoVideoGame {

    public int id;
    public String nm, ng;
    public int h;

    public int totalBayar(int ls) {
        int tb = h * ls;
        return tb;
    }

    public void tampilData() {
        System.out.println("Id :" + id);
        System.out.println("Nama Member :" + nm);
        System.out.println("Nama Game :" + ng);
        System.out.println("Harga Sewa :" + h);
    }

}
