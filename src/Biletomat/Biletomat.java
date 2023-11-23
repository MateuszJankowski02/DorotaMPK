package Biletomat;

import java.time.LocalDate;

public class Biletomat {

    int iloscBlankietow, iloscMonet;
    String lokalizacja;
    LocalDate data;

    public Biletomat(int iloscBlankietow, int iloscMonet, String lokalizacja){
        this.iloscBlankietow = iloscBlankietow;
        this.iloscMonet = iloscMonet;
        this.lokalizacja = lokalizacja;
        this.data = LocalDate.now();
    }


    public Bilet createBilet20min(RodzajBiletu rodzaj){
        return new Bilet20min(rodzaj);
    }
    public Bilet createBilet60min(RodzajBiletu rodzaj ){
        return new Bilet60min(rodzaj);
    }

    public Serwis createSerwis(){
        return new Serwis();
    }
}
