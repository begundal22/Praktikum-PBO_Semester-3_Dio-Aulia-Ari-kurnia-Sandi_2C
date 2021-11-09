/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author Dio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singa s = new Singa("hrrrrrr", "Pirang", "Singa", 4);
        Keledai k = new Keledai("hffffttt", "Abu-abu", "Keledai", 4);
        Gorilla g = new Gorilla("rrhhhhaaaa", "Hitam", "Gorilla", 4);

        s.displayData();
        System.out.println();
        k.displayData();
        System.out.println();
        g.displayData();
    }

}
