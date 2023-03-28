package baraja_de_cartas;

public class Carta {
    private String Figura;
    private String Palo;
    
    public Carta(String figura, String palo) {
        Figura = figura;
        Palo = palo;
    }

    public String getFigura() {
        return Figura;
    }

    public void setFigura(String figura) {
        Figura = figura;
    }

    public String getPalo() {
        return Palo;
    }

    public void setPalo(String palo) {
        Palo = palo;
    }

    
}