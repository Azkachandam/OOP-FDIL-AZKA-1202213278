package TPMODUL2_AZKA.src;
public class MainApp {
    public static void main(String [] args) throws Exception {
        Perangkat spec = new Perangkat("Intel", 9, 3.5f);
        spec.informasi();

        System.out.println();

        HandPhone hape = new HandPhone(false, "Samsung", 16,  3.5f);
        hape.informasi();
        hape.telfon( 628122122);
        hape.kirimSMS( 62852112);
        hape.kirimSMS( 628121212, 629292211);

        System.out.println();

        Laptop pc = new Laptop( "NVIDIA", 8,  3.5f,  true);
        pc.informasi();
        pc.bukaGame( "Valorant");
        pc.kirimEmail( "asepdadang@gmail.com");
        pc.kirimEmail( "asepdadang@gmail.com",  "dadangasep@mail.com");
    }
}