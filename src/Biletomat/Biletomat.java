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

    public Bilet kupBilet20min(RodzajBiletu rodzaj, Pieniadz pieniadz){
        Bilet nowyBilet = new Bilet20min(rodzaj, LocalDate.now());
        this.sprzedaneBilety.add(nowyBilet);
        return nowyBilet;
    }
    public Bilet kupBilet60min(RodzajBiletu rodzaj, Pieniadz pieniadz){
        Bilet nowyBilet = new Bilet60min(rodzaj, LocalDate.now());
        this.sprzedaneBilety.add(nowyBilet);
        return nowyBilet;
    }

    public Serwis createSerwis(){
        return new Serwis(this);
    }

    public void wypiszSprzedaneBilety() {
        System.out.println("\n\nSprzedane bilety:");

        for (Bilet bilet : sprzedaneBilety) {
            System.out.println("Data: " + bilet.getDataWydaniaBiletu() +
                    ", Rodzaj: " + bilet.getRodzaj() +
                    ", Cena: " + bilet.getCena() +
                    ", Okres: " + bilet.getOkres());
        }
    }
}
