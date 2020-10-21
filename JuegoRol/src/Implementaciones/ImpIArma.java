package Implementaciones;

import Enums.TipoArma;
import Interfaces.IArma;

public class ImpIArma implements IArma {
    protected TipoArma tipo;
    protected int dmgpoints;

    @Override
    public TipoArma getTipo() {
        return tipo;
    }

    @Override
    public int puntosDaño() {
        return dmgpoints;
    }
}
