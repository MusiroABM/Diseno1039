package Personajes;


import Enums.TipoPersonaje;

public class Soldado extends Personaje{
    public Soldado(String nombre) {
        super(nombre);
        this.tipoPersonaje= TipoPersonaje.SOLDADO;
    }
}
