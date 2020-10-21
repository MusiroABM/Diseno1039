package Armas;

import Enums.TipoArma;
import Implementaciones.ImpIArma;

public class Desarmado extends ImpIArma {
    private final int DMG = 5;

    public Desarmado(){
        this.tipo = TipoArma.DESARMADO;
        this.dmgpoints = DMG;
    }
}
