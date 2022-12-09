package MODUL2_AZKA.src;

public class TransportasiAir {
    protected int jumlahKursi, biaya;
    
    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi Air Jenis Tidak Diketahui Dengan Kursi Berjumlah" + jumlahKursi + "Ditetapkan Dengan Biaya Sebesar Rp." + biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air Dengan Jenis Yang Tidak Diketahui Sedang Berlayar");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air Dengan Jenis Yang Tidak Diketahui Berlabuh Di Pantai");
    }
}
