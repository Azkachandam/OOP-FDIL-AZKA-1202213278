package MODUL2_AZKA.src;

public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int Kursi, int layar){
        super(jumlahKursi, Kursi);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air Dengan Jenis Sampan Dengan Kursi Berjumlah" + jumlahKursi + "Ditetapkan Dengan Biaya Sebesar Rp." + biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air Dengan Jenis Sampan Berlayar Menggunakan" + layar + "layar");
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air Dengan Jenis Sampan Di Pantai Tanpa Layar");
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air Dengan Jenis Sampan Berlabuh DI Pantai Dengan Menggunakan" + jangkar + "Jangkar");
    }
}
