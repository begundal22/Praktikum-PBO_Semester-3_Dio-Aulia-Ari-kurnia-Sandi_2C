/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author Dio
 */
public class Main {

    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Manusia:");
        manusia.bernafas();
        manusia.makan();
        System.out.println();

        System.out.println("Dosen:");
        manusia.makan();
        dosen.lembur();
        System.out.println();

        System.out.println("Mahasiswa:");
        manusia.makan();
        mahasiswa.tidur();
        System.out.println();
    }
}
