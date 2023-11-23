import Biletomat.*;

public class Main {

    public static void main(String[] args){

        Biletomat biletomat = new Biletomat(10,40,"Politechnika");

        Bilet normalnybilet = biletomat.kupBilet60min(RodzajBiletu.normalny,new Gotowka(10,1));
        Bilet normalnybilet1 = biletomat.kupBilet20min(RodzajBiletu.normalny, new Karta(5));
        Bilet ulgowybilet1 = biletomat.kupBilet20min(RodzajBiletu.ulgowy,new Gotowka(10,1));
        Bilet ulgowybilet = biletomat.kupBilet60min(RodzajBiletu.ulgowy, new Karta(6));

        Serwis serwis1=biletomat.createSerwis();
        System.out.print(serwis1.toString());
        biletomat.wypiszSprzedaneBilety();
        serwis1.setIloscBlankietow(23);
        serwis1.setIloscMonet(8000);
        serwis1.setBilet(ulgowybilet1,30,RodzajBiletu.normalny);
        System.out.print(serwis1.toString());
    }

}


