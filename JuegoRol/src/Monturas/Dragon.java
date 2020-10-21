package Monturas;

import Enums.TipoMontura;
import Implementaciones.ImpIMontura;

public class Dragon extends ImpIMontura {
    private final int VELOCIDAD = 150;

    public Dragon(){
        this.tipoMontura = TipoMontura.DRAGON;
        this.velocidad = VELOCIDAD;
    }
}
