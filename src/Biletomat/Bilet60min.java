package Biletomat;

public class Bilet60min extends Bilet {

    protected Bilet60min(RodzajBiletu rodzaj){
        super(rodzaj);
        this.okres = "60 min";
        if (rodzaj == RodzajBiletu.ulgowy) {
            this.cena = 3;
        } else if (rodzaj == RodzajBiletu.normalny) {
            this.cena = 6;
        }
    }
}
