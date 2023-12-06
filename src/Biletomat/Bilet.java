package Biletomat;

import java.time.LocalDate;

interface BiletInterface{
    String getOkres();
    int getCena();
    RodzajBiletu getRodzaj();
    LocalDate getDataWydaniaBiletu();

}

public abstract class Bilet implements BiletInterface {

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
    public String getOkres() {
        return okres;
    }

    @Override
    public int getCena() {
        return cena;
    }

    @Override
    public RodzajBiletu getRodzaj() {
        return rodzaj;
    }

    @Override
    public LocalDate getDataWydaniaBiletu() {
        return dataWydaniaBiletu;
    }

    @Override
    public String toString() {
        return rodzaj + " - " + cena+"-"+okres;
    }
}
