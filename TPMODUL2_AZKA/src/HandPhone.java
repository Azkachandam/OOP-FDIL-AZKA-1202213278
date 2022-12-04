package TPMODUL2_AZKA.src;
public class HandPhone extends Perangkat {
    protected boolean fingerprint;

    public HandPhone(boolean fingerprint, String drive, int ram, float processor) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        System.out.println("Handphone Ini Memiliki Drive Tipe" + drive + "Dengan Ram Sebesar " + ram + "GB Dan Processor Secepat" + processor + "Ghz. Selain Itu Handphone Ini"  + (fingerprint == false ? "TIDAK Memiliki " : "Memiliki ") + "Fingeprint");
    }

    public void telfon(int no_hp) {
        System.out.println("Handphone Berhasil Menyambungkan Telfon Ke No " + no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.println("Handphone Berhasil Mengirim SMS Ke No " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone Berhasil Mengirim SMS Ke No " + no_hp1 + "Dan " + no_hp2);
    }
}