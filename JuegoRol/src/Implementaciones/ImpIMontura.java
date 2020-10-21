package Implementaciones;

import Enums.TipoMontura;
import Interfaces.IMontura;

public class ImpIMontura implements IMontura {
    protected TipoMontura tipoMontura;
    protected int velocidad;

    @Override
    public TipoMontura getTipo() {
        return null;
    }

    @Override
    public float duracionViaje(int distanciaRecorrida) {
        return 0;
    }
}
