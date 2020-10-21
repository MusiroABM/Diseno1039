package Personajes;

import Enums.Direccion;
import Enums.TipoPersonaje;
import Interfaces.IArma;
import Interfaces.IMontura;

public class Personaje {
    private String nombre;
    protected TipoPersonaje tipoPersonaje;
    protected IArma arma;
    protected IMontura montura;

    public Personaje(String nombre){
        this.nombre=nombre;
    }

    public void eligeArma(IArma arma){
        this.arma=arma;
    }
    public void utilizaArma(){
        System.out.println("Se ha utilizado "+arma.getTipo()+ " realizando "+arma.puntosDaño()+" puntos de daño");
    }

    public void eligeMontura(IMontura montura){
        this.montura=montura;
    }

    public void utilizaMontura(int distancia, Direccion direccion){
        float duracion = montura.duracionViaje(distancia);
        System.out.println("Se ha viajado en "+montura.getTipo()+" en dirección "+direccion+" con una duracción de "+duracion+" horas.");
    }
    public void info(){
        System.out.println("Te encuentras ante un "+tipoPersonaje
                +" de nombre "+nombre+", con "+arma.getTipo()+" que golpea con "+arma.puntosDaño()
                +" puntos de daño y posee "+montura.getTipo()+" como montura.");
    }
}
