package Biletomat;

abstract public class Bilet {


    RodzajBiletu rodzaj;
    String okres;
    int cena;

    protected Bilet(RodzajBiletu rodzaj) {
        if (rodzaj == RodzajBiletu.ulgowy || rodzaj == RodzajBiletu.normalny) {
            this.rodzaj = rodzaj;
        } else {
            throw new IllegalArgumentException("Podałeś zły rodzaj biletu!");
        }
    }
}
