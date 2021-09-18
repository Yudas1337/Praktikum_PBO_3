package Tugas.Soal4;

/*
|--------------------------------------------------------------------------
| Anggota
|--------------------------------------------------------------------------
|
| Create Anggota Class.
| @author Yudas Malabi
|
*/
public class Anggota {

    public int limitPinjam, jumlahPinjam;
    public String nama, noKtp;

    public Anggota(String noKtp, String nama, int limitPinjam) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }

    public String getNama() {
        return this.nama;
    }

    public int getLimitPinjaman() {
        return this.limitPinjam;
    }

    public int pinjam(int jumlahPinjam) {
        if (jumlahPinjam > this.limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            return this.jumlahPinjam;
        } else {
            return this.jumlahPinjam += jumlahPinjam;
        }
    }

    public int getJumlahPinjaman() {
        return this.jumlahPinjam;
    }

    public int angsur(int angsuran) {
        return this.jumlahPinjam -= angsuran;
    }

}
