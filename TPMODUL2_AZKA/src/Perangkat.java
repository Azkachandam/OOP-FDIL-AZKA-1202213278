package TPMODUL2_AZKA.src;
public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;

    public Perangkat(String drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi() {
        System.out.println("Perangkat Tidak Diketahui Memiliki Drive Tipe" + drive + "Dengan Ram Sebesar " + ram + "GB Dan Processor Secepat" + processor + "Ghz");
    }
}