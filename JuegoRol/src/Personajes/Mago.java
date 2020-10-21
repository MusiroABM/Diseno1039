package Personajes;

import Enums.TipoPersonaje;

public class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre);
        this.tipoPersonaje= TipoPersonaje.MAGO;
    }
}
