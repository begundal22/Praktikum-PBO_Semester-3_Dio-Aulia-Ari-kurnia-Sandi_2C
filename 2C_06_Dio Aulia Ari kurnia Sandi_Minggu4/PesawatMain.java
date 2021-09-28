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
public class PesawatMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Petugas pilot = new Petugas("A2211", "Kurnia");
        Petugas pramugari = new Petugas("B3456", "Aulia");
        Bandara ban = new Bandara("Banjarmasin", "Balikpapan");
        Penumpang p = new Penumpang("200099768890", "Dio Aulia Ari kurnia Sandi");
        Pesawat pswt = new Pesawat("Sandi Air", "Boeing B061001", pilot, pramugari, p, ban);

        System.out.println(pswt.info());

    }

}
