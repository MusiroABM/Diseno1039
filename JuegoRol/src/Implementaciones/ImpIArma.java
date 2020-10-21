package Implementaciones;

import Enums.TipoArma;
import Interfaces.IArma;

public class ImpIArma implements IArma {
    protected TipoArma tipo;
    protected int dmgpoints;

    @Override
    public TipoArma getTipo() {
        return null;
    }

    @Override
    public int puntosDaño() {
        return 0;
    }
}
