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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan ob1 = new Hewan();
        Cybertooth obt1 = new Cybertooth();
        Ular_Cobra obt2 = new Ular_Cobra();
        Air_Conditioner ob2 = new Air_Conditioner();
        Truk ob3 = new Truk();

        System.out.println("===========Hewan===========");
        ob1.namaHewan("Burung Garuda");
        ob1.jenisHewan("Karnivora");
        ob1.caraBernafas("Menggunakan Paru-paru");
        ob1.cetakStatus();
        System.out.println();

        System.out.println("===========Cybertooth===========");
        obt1.namaHewan("Cybertooth");
        obt1.jenisHewan("Karnivora");
        obt1.caraBernafas("Menggunakan Paru-Paru");
        obt1.jumlahKaki("2");
        obt1.caraBerkembangBiak("Melahirkan");
        obt1.cetakStatus();
        System.out.println();

        System.out.println("===========Ular Cobra===========");
        obt2.namaHewan("Ular Cobra");
        obt2.jenisHewan("Karnivora");
        obt2.caraBernafas("Menggunakan Paru-paru");
        obt2.caraBergerak("Merayap");
        obt2.alatPertahanan("Bisa");
        obt2.cetakStatus();
        System.out.println();

        System.out.println("===========Air Conditioner===========");
        ob2.merek("Samsung");
        ob2.mode("Swing");
        ob2.naik(6);
        ob2.cetakStatus();
        System.out.println("-----------Suhu Turun-----------");
        ob2.turun(2);
        ob2.cetakStatus();
        System.out.println();

        System.out.println("===========Truk===========");
        ob3.jenis("Fuso");
        ob3.merek("Nissan");
        ob3.gear(5);
        ob3.gas(70);
        ob3.cetakStatus();
        System.out.println("-----------Kecepatan Turun-----------");
        ob3.rem(40);
        ob3.gear(3);
        ob3.cetakStatus();
    }

}
