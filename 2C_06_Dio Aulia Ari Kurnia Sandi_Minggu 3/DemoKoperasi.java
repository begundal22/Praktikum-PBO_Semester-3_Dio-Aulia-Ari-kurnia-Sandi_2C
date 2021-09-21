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
public class DemoKoperasi {

    private String Nama;
    int noKtp;
    private int LimitPinjaman, JumlahPinjam;

    DemoKoperasi(int noKtp, String Nama, int LimitPinjaman) {
        this.noKtp = noKtp;
        this.Nama = Nama;
        this.LimitPinjaman = LimitPinjaman;

    }

    public String getNama() {
        return Nama;
    }

    public int getLimitPinjaman() {
        return LimitPinjaman;
    }

    public int getJumlahPinjam() {
        return JumlahPinjam;
    }

    public void setJumlahPinjam(int JumlahPinjam) {
        this.JumlahPinjam = JumlahPinjam;
        if (this.JumlahPinjam > LimitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
            this.JumlahPinjam = 0;
        } else {
            this.JumlahPinjam = JumlahPinjam;
        }
    }

    public void angsuran(int a) {
        int min = (int) (this.JumlahPinjam * 0.1);
        if (min <= a) {
            this.JumlahPinjam -= a;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }

}
