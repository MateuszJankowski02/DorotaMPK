package Biletomat;

public class Biletomat {

    public Bilet createBilet20min(RodzajBiletu rodzaj){
        return new Bilet20min(rodzaj);
    }
    public Bilet createBilet60min(RodzajBiletu rodzaj ){
        return new Bilet60min(rodzaj);
    }
}
