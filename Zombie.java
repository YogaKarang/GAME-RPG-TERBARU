public class Zombie extends Musuh implements BisaLoot {
    public Zombie() {
        super("Zombie Merangkak", 150);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " mencabik-cabik kamu! Player -20 HP");
    }

    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh + " RAAWRRRRRRRRR");
    }

    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh + " menjatuhkan 1x daging busuk.");
    }
}