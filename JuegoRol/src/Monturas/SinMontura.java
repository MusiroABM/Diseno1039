package Monturas;

import Enums.TipoMontura;
import Implementaciones.ImpIMontura;

public class SinMontura extends ImpIMontura{
    private final int VELOCIDAD = 10;

    public SinMontura(){
        this.tipoMontura = TipoMontura.SINMONTURA;
        this.velocidad = VELOCIDAD;
    }
}
