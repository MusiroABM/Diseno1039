public class Cuadrado extends AsciiArt{

    public Cuadrado(int longitud, char relleno){
        lineas = new String[longitud];
        for (int i=0; i<longitud; i++){
            String clonar = Character.toString(relleno);
            this.lineas[i]=clonar.repeat(longitud);
        }
    }
}
