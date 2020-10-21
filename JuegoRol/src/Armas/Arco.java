package Armas;

import Enums.TipoArma;
import Implementaciones.ImpIArma;

public class Arco extends ImpIArma {
    private final int DMG = 15;

    public Arco(){
        this.tipo = TipoArma.ARCO;
        this.dmgpoints = DMG;
    }
}
