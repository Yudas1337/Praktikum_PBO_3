package Tugas.Soal6;

import java.util.Scanner;

/*
|--------------------------------------------------------------------------
| TestKoperasi
|--------------------------------------------------------------------------
|
| Create TestKoperasi Class.
| @author Yudas Malabi
|
*/
public class TestKoperasi {

    public static void main(String[] args) {
        int jumlahPinjaman, angsuran;
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Dony", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.print("Masukkan jumlah pinjaman: ");
        jumlahPinjaman = sc.nextInt();
        System.out.println("\nMeminjam uang " + jumlahPinjaman);
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("Masukan angsuran: ");
        angsuran = sc.nextInt();
        System.out.println("\nMembayar angsuran " + angsuran);
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        sc.close();

    }

}
