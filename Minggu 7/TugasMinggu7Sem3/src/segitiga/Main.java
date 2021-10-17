/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author Dio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        s.totalSudut(30);
        s.totalSudut(45, 30);
        s.keliling(5, 7);
        s.keliling(4, 7, 5);
    }

}
