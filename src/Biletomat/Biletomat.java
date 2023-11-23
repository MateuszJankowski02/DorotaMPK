package Biletomat;

import java.util.ArrayList;
import java.util.List;

public class Biletomat {

    private List<Bilet> sprzedaneBilety;  // Nowa lista do przechowywania sprzedanych biletów

    public Biletomat() {
        this.sprzedaneBilety = new ArrayList<>();
        Biletomat biletomat = new Biletomat();

// Tworzenie biletów
        Bilet bilet1 = biletomat.createBilet20min(RodzajBiletu.normalny);
        Bilet bilet2 = biletomat.createBilet60min(RodzajBiletu.ulgowy);

// Dodawanie do listy sprzedanych biletów
        biletomat.dodajSprzedanyBilet(bilet1);
        biletomat.dodajSprzedanyBilet(bilet2);

// Wydruk wszystkich sprzedanych biletów
        biletomat.wydrukujSprzedaneBilety();
    }

    public Bilet createBilet20min(RodzajBiletu rodzaj) {
        return new Bilet20min(rodzaj);
    }

    public Bilet createBilet60min(RodzajBiletu rodzaj) {
        return new Bilet60min(rodzaj);
    }

    // Metoda do dodawania sprzedanego biletu do listy
    public void dodajSprzedanyBilet(Bilet bilet) {
        sprzedaneBilety.add(bilet);
    }

    // Metoda do wydruku wszystkich sprzedanych biletów
    public void wydrukujSprzedaneBilety() {
        for (Bilet bilet : sprzedaneBilety) {
            System.out.println(bilet);
        }
    }
    Biletomat biletomat = new Biletomat();

    // Tworzenie biletów
    Bilet bilet1 = biletomat.createBilet20min(RodzajBiletu.normalny);
    Bilet bilet2 = biletomat.createBilet60min(RodzajBiletu.ulgowy);



}