package Biletomat;

import java.time.LocalDate;

//Przykład dziedziczenia po klasie Bilet
public class Bilet60min extends Bilet {

    protected Bilet60min(RodzajBiletu rodzaj, LocalDate dataWydaniaBiletu){
        super(rodzaj, dataWydaniaBiletu);
        this.okres = "60 min";
        if (rodzaj == RodzajBiletu.ulgowy) {
            this.cena = 3;
        } else if (rodzaj == RodzajBiletu.normalny) {
            this.cena = 6;
        }
    }
}
