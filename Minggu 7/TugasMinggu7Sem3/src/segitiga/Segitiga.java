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
public class Segitiga {

    public int sudut, keliling;
    public double c;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println(sudut);
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println(sudut);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        keliling = sisiA + sisiB + sisiC;
        System.out.println(keliling);
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        System.out.println(c);
        return c;
    }

}
