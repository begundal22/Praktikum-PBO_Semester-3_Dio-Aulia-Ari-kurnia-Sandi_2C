/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koperasi;

/**
 *
 * @author Dio
 */
import java.util.Scanner;
public class TestKoperasi {

    public static void main(String[] args) {
        Scanner dio = new Scanner(System.in);
        DemoKoperasi donny = new DemoKoperasi(111333444, "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.print("Masukkan Jumlah Pinjaman: ");
        int jp=dio.nextInt();
        donny.setJumlahPinjam(jp);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjam());
        System.out.println();
        System.out.print("Masukkan Jumlah Angsuran: ");
        int ja=dio.nextInt();
        donny.angsuran(ja);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjam());
    }
}
