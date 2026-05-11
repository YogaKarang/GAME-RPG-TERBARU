public class Slime extends Musuh implements BisaLoot{
    public Slime() {
        super("Slime Asam", 50);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " melompat dan menyiram cairan asam! Player -15 HP");
    }

    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh + " BLUBUBBBBBBUBUBUUBUB");
    }

    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh + " menjatuhkan 1x potion.");
    }
}