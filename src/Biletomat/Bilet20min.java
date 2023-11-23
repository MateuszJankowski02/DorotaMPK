package Biletomat;

public class Bilet20min extends Bilet {

    protected Bilet20min(RodzajBiletu rodzaj){
        super(rodzaj);
        this.okres = "20 min";
        if (rodzaj == RodzajBiletu.ulgowy) {
            this.cena = 2;
        } else if (rodzaj == RodzajBiletu.normalny) {
            this.cena = 4;
        }
    }
}
