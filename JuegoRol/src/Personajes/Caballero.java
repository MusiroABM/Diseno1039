package Personajes;

import Enums.TipoPersonaje;

public class Caballero extends Personaje{
    public Caballero(String nombre) {
        super(nombre);
        this.tipoPersonaje = TipoPersonaje.CABALLERO;
    }
}
