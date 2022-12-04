package TPMODUL2_AZKA.src;
public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        System.out.println("Laptopp Ini Memiliki Drive Tipe" + drive + "Dengan Ram Sebesar " + ram + "GB Dan Processor Secepat" + processor + "Ghz. Selain Itu Laptop Ini " + (webcam == false ? "TIDAK Memiliki " : "Memiliki ") + "Webcam");
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop Berhasil Membuka Game " + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop Berhasil Mengirim Email Ke " + email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop Berhasil Mengirim Email Ke " + email1 + "Dan Ke " + email2);
    }
}