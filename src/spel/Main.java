import kamer.*;
import spel.*;

public class Main {
    public static void main(String[] args) {
        Kamer kamer = new SprintPlanning();  // polymorfisme toegepast
        kamer.betreed();
        kamer.actieUitvoeren();
    }
}