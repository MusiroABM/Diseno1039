package Interfaces;

import Enums.TipoMontura;

public interface IMontura {
    public TipoMontura getTipo();
    public float duracionViaje(int distanciaRecorrida);
}
