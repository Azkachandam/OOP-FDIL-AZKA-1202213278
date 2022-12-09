package MODUL2_AZKA.src;

public class Kapal extends TransportasiAir{
 protected String mesin;
 
 public Kapal(int jumlahKursi, int biaya, String mesin){
    super(jumlahKursi, biaya);
    this.mesin = mesin;
 }

 @Override
 public void informasi(){
    System.out.println("Transportasi Air Dengan Jenis Kapal Dengan Kursi Berjumlah" + jumlahKursi + "Ditetapkan Dengan Biaya Sebesar Rp." + biaya);
 }

 @Override
 public void berlayar(){
    System.out.println("Transportasi Air Dengan Jenis Kapal Sedang Berlayar Dengan Menggunakan Mesin" + mesin + "Dengan Kecepatan Yang Tidak Stabil");
 }

 public void berlayar(int kecepatan){
    System.out.println("Transportasi Air Dengan Jenis Kapal Sedang Berlayar Dengan Menggunakan Mesin" + mesin + "Dengan Kecepatan Yang Stabil Di Kisaran" + kecepatan + "Knot");
 }

 @Override
 public void berlabuh(){
    System.out.println("Transportasi Air Dengan Jenis Kapal Berlabuh Di Pantai");
 }
}
