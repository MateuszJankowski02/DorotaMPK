package Biletomat;

import java.time.LocalDate;

interface SerwisInterfrace{
    void setDate(LocalDate data);
    void setLokalizacja(String lokalizacja);
    void setIloscBlankietow(int iloscBlankietow);
    void setIloscMonet(int iloscMonet);
    void setBilet(Bilet bilet, int cena, RodzajBiletu rodzaj);
}

public class Serwis implements SerwisInterfrace{

    int licznikCzynnosciSerwisowych;
    Biletomat biletomat;

    //Poniżej możemy zaobserwować przykład kompozycji
    protected Serwis(Biletomat biletomat) {
        this.biletomat = biletomat;
    }

    @Override
    public void setDate(LocalDate data) {
        this.biletomat.data = data;
        this.licznikCzynnosciSerwisowych++;
    }

    @Override
    public void setLokalizacja(String lokalizacja) {
        this.biletomat.lokalizacja = lokalizacja;
        this.licznikCzynnosciSerwisowych++;
    }

    @Override
    public void setIloscBlankietow(int iloscBlankietow) {
        this.biletomat.iloscBlankietow = iloscBlankietow;
        this.licznikCzynnosciSerwisowych++;
    }

    @Override
    public void setIloscMonet(int iloscMonet) {
        this.biletomat.iloscMonet = iloscMonet;
        this.licznikCzynnosciSerwisowych++;
    }

    @Override
    public void setBilet(Bilet bilet, int cena, RodzajBiletu rodzaj) {
        bilet.cena = cena;
        bilet.rodzaj = rodzaj;
        this.licznikCzynnosciSerwisowych++;
    }
    @Override
    public String toString() {
        return "Licznik czynnosci serwisowych: " +licznikCzynnosciSerwisowych+ "\n" + "Lokalizacja: " + this.biletomat.lokalizacja +"\n"+
       "Data postawienia: "+ this.biletomat.data+"\n"+"Ilosc blankietow: "+ this.biletomat.iloscBlankietow+"\n"+"Ilosc monet: "+ this.biletomat.iloscMonet;
    }
}

