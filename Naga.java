public class Naga extends Musuh implements BisaTerbang{
    public Naga() {
        super("Naga Hitam", 500);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " menyemburkan nafas api dari udara! Player -50 HP");
    }

    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh + " ROAAAAARRRR!!!");
    }

    @Override
    public void lepasLandas() {
        System.out.println(this.namaMusuh + " terbang tinggi! Sulit diserang.");
    }

    @Override
    public void seranganUdara() {
        System.out.println(this.namaMusuh + " menyemburkan badai api! Pemain -80 HP.");
    }
}
 