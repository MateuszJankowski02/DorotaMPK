package Biletomat;

import java.time.LocalDate;

public abstract class Bilet {

    protected LocalDate dataWydaniaBiletu;
    protected RodzajBiletu rodzaj;
    protected String okres;
    protected int cena;

    protected Bilet(RodzajBiletu rodzaj, LocalDate dataWydaniaBiletu) {
        this.dataWydaniaBiletu = dataWydaniaBiletu;
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
