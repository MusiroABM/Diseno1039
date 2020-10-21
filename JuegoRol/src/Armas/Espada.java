package Armas;

import Enums.TipoArma;
import Implementaciones.ImpIArma;

public class Espada extends ImpIArma {
    private final int DMG = 20;

    public Espada(){
        this.tipo = TipoArma.ESPADA;
        this.dmgpoints = DMG;
    }
}
