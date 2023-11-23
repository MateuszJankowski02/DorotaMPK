package Biletomat;

import java.time.LocalDate;

public class Bilet20min extends Bilet {

    protected Bilet20min(RodzajBiletu rodzaj, LocalDate dataWydaniaBiletu){
        super(rodzaj, dataWydaniaBiletu);
        this.okres = "20 min";
        if (rodzaj == RodzajBiletu.ulgowy) {
            this.cena = 2;
        } else if (rodzaj == RodzajBiletu.normalny) {
            this.cena = 4;
        }
    }
}
