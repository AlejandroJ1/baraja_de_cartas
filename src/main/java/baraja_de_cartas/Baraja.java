package baraja_de_cartas;

public class Baraja {
    private Carta[] Carta;

    public Baraja(){
        
    }

    public Baraja(String figura, String palo) {
    }

    public Baraja(baraja_de_cartas.Carta[] carta) {
        Carta = carta;
    }

    public Carta[] getCarta() {
        return Carta;
    }

    public void setCarta(Carta[] carta) {
        Carta = carta;
    }

    public void barajarse(){

    }
    public void robar(){

    }


}
