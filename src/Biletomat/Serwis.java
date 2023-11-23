package Biletomat;

import java.time.LocalDate;

public class Serwis {

    int licznikCzynnosciSerwisowych;
    Biletomat biletomat;

    protected Serwis(Biletomat biletomat){
        this.biletomat = biletomat;
    }


    public void setDate(LocalDate data){
        this.biletomat.data = data;
    }

    public void setLokalizacja(String lokalizacja){
        this.biletomat.lokalizacja = lokalizacja;
    }
    public void setIloscBlankietow(int iloscBlankietow){
        this.biletomat.iloscBlankietow = iloscBlankietow;
    }
    public void setIloscMonet(int iloscMonet){
        this.biletomat.iloscMonet = iloscMonet;
    }

    public void setBilet(Bilet bilet, int cena, RodzajBiletu rodzaj){
        bilet.cena = cena;
        bilet.rodzaj = rodzaj;
    }
}