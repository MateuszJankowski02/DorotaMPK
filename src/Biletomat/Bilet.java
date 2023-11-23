package Biletomat;

public abstract class Bilet {

    protected RodzajBiletu rodzaj;
    protected String okres;
    protected int cena;

    protected Bilet(RodzajBiletu rodzaj) {
        if (rodzaj == RodzajBiletu.ulgowy || rodzaj == RodzajBiletu.normalny) {
            this.rodzaj = rodzaj;
        } else {
            throw new IllegalArgumentException("Podałeś zły rodzaj biletu!");
        }
    }
    @Override
    public String toString() {
        return rodzaj + " - " + cena+"-"+okres;
    }
}
