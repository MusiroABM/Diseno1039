package Personajes;


import Enums.TipoPersonaje;

public class Soldado extends Personaje{
    Soldado(String nombre) {
        super(nombre);
        this.tipoPersonaje= TipoPersonaje.SOLDADO;
    }
}
