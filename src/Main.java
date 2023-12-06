import Biletomat.*;

public class Main {

    public static void main(String[] args){

        Biletomat biletomat = new Biletomat(10,40,"Krowodrza Górka");

        Bilet bilet1 = biletomat.kupBilet60min(RodzajBiletu.ulgowy,new Karta(10));
        Bilet bilet2 = biletomat.kupBilet20min(RodzajBiletu.normalny, new Gotowka(5, 5));
        Bilet bilet3 = biletomat.kupBilet20min(RodzajBiletu.normalny,new Gotowka(10,1));
        Bilet bilet4 = biletomat.kupBilet60min(RodzajBiletu.ulgowy, new Karta(6));
        Bilet bilet5 = biletomat.kupBilet20min(RodzajBiletu.normalny, new Karta(6));

        Serwis serwis =biletomat.createSerwis();
        System.out.print(serwis.toString());
        biletomat.wypiszSprzedaneBilety();
        serwis.setIloscBlankietow(13);
        serwis.setIloscMonet(5274);
        serwis.setLokalizacja("Rondo Mogilskie");
        serwis.setBilet(bilet3,17,RodzajBiletu.ulgowy);
        System.out.print(serwis.toString());
    }

}


