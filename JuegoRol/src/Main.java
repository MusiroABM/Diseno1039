import Armas.Espada;
import Enums.Direccion;
import Monturas.Caballo;
import Personajes.Caballero;

public class Main {
    public static void main(String[] args) {
        Caballo caballo = new Caballo();
        Espada espada = new Espada();
        Caballero caballero = new Caballero("Tomás");
        caballero.eligeArma(espada);
        caballero.eligeMontura(caballo);
        caballero.info();
        caballero.utilizaMontura(100, Direccion.NORTE);
    }
}
