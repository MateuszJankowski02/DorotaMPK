package Biletomat;

import java.time.LocalDate;

public class Serwis {

    int licznikCzynnosciSerwisowych;
    Biletomat biletomat;

    protected Serwis(Biletomat biletomat) {
        this.biletomat = biletomat;
    }

    public void setDate(LocalDate data) {
        this.biletomat.data = data;
        this.licznikCzynnosciSerwisowych++;
    }
    public void setLokalizacja(String lokalizacja) {
        this.biletomat.lokalizacja = lokalizacja;
        this.licznikCzynnosciSerwisowych++;
    }
    public void setIloscBlankietow(int iloscBlankietow) {
        this.biletomat.iloscBlankietow = iloscBlankietow;
        this.licznikCzynnosciSerwisowych++;
    }
    public void setIloscMonet(int iloscMonet) {
        this.biletomat.iloscMonet = iloscMonet;
        this.licznikCzynnosciSerwisowych++;
    }
    public void setBilet(Bilet bilet, int cena, RodzajBiletu rodzaj) {
        bilet.cena = cena;
        bilet.rodzaj = rodzaj;
        this.licznikCzynnosciSerwisowych++;
    }
    @Override
    public String toString() {

        return "Licznik czynnosci serwisowych: " +licznikCzynnosciSerwisowych+ "\n" + "Lokazlizacja: " + this.biletomat.lokalizacja +"\n"+
       "Data: "+ this.biletomat.data+"\n"+"Ilosc blaniketow: "+ this.biletomat.iloscBlankietow+"\n"+"Ilosc monet: "+ this.biletomat.iloscMonet;
    }
}

