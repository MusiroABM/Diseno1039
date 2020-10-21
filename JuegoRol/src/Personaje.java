import Enums.Direccion;
import Enums.TipoPersonaje;
import Interfaces.IArma;
import Interfaces.IMontura;

public class Personaje {
    private String nombre;
    private TipoPersonaje tipoPersonaje;

    public Personaje(String nombre){
        this.nombre=nombre;
    }
    public void eligeArma(IArma arma){

    }
    public void utilizaArma(){

    }
    public void eligeMontura(IMontura montura){

    }
    public void utilizaMontura(int distancia, Direccion direccion){

    }
    public void info(){

    }
}
