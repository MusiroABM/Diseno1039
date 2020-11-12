public class Triangulo extends AsciiArt{

    public Triangulo(int longitud, char relleno){
        lineas = new String[longitud];
        for (int i=0; i<longitud; i++){
            String clonar = Character.toString(relleno);
            lineas[i]=clonar.repeat(i+1)+" ".repeat(longitud-i-1);
        }
    }
}
