package Monturas;

import Enums.TipoMontura;
import Implementaciones.ImpIMontura;

public class Caballo extends ImpIMontura {
    private final int VELOCIDAD = 50;

    public Caballo(){
        this.tipoMontura = TipoMontura.CABALLO;
        this.velocidad = VELOCIDAD;
    }
}