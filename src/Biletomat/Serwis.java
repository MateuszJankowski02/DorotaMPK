package Biletomat;

import java.time.LocalDate;

public class Serwis {

    int licznikCzynnosciSerwisowych;
    Biletomat biletomat;

    protected Serwis(Biletomat biletomat){
        this.biletomat = biletomat;
        this.licznikCzynnosciSerwisowych++;
    }


    public void setDate(LocalDate data){
        this.biletomat.data = data;
        this.licznikCzynnosciSerwisowych++;
    }

    public void setLokalizacja(String lokalizacja){
        this.biletomat.lokalizacja = lokalizacja;
        this.licznikCzynnosciSerwisowych++;
    }
    public void setIloscBlankietow(int iloscBlankietow){
        this.biletomat.iloscBlankietow = iloscBlankietow;
        this.licznikCzynnosciSerwisowych++;
    }
    public void setIloscMonet(int iloscMonet){
        this.biletomat.iloscMonet = iloscMonet;
        this.licznikCzynnosciSerwisowych++;
    }

    public void setBilet(Bilet bilet, int cena, RodzajBiletu rodzaj){
        bilet.cena = cena;
        bilet.rodzaj = rodzaj;
        this.licznikCzynnosciSerwisowych++;
    }
}