package Percobaan3;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota agt = new Anggota("Setiawan", "Jl. Veteran No. 9 Malang");

        agt.setNama("Iwan");
        agt.setAlamat("Jl Soekarno Hatta No. 9 Malang");
        agt.setor(100000);
        System.out.println("Simpanan dari anggota bernama " + agt.getNama() + "yang beralamatkan di" + agt.getAlamat()
                + " sejumlah Rp " + agt.getSimpanan() + "\n");

        agt.pinjam(5000);
        System.out
                .println("Simpanan dari anggota bernama " + agt.getNama() + " sejumlah Rp " + agt.getSimpanan() + "\n");
    }
}
