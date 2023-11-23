package Biletomat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biletomat {

    private List<Bilet> sprzedaneBilety = new ArrayList<>();
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
        Bilet nowyBilet = new Bilet20min(rodzaj, LocalDate.now());
        this.sprzedaneBilety.add(nowyBilet);
        return nowyBilet;
    }
    public Bilet createBilet60min(RodzajBiletu rodzaj ){
        Bilet nowyBilet = new Bilet60min(rodzaj, LocalDate.now());
        this.sprzedaneBilety.add(nowyBilet);
        return nowyBilet;
    }

    public Serwis createSerwis(){
        return new Serwis();
    }
}
