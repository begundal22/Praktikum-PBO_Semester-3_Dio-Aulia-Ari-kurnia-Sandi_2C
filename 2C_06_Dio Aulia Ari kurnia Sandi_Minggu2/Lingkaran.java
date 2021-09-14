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
public class Lingkaran {

    public double phi, r;

    public Double hitungLuas(Double phi) {
        Double l = phi * r * r;
        return l;
    }

    public Double hitungKeliling(Double phi) {
        Double k = 2 * phi * r;
        return k;
    }

}
