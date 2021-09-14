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
public class TokoVideoGameDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TokoVideoGame tg = new TokoVideoGame();

        tg.id = 01;
        tg.nm = "Dio";
        tg.ng = "GTA V";
        tg.h = 3000;
        tg.tampilData();
        System.out.println("---------------------");
        System.out.println("Total Bayar" + tg.totalBayar(6));
    }

}
