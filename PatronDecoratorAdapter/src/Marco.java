public class Marco extends AsciiArtDecorator{

    public Marco(AsciiArt asciiArt, char relleno){
        int nuevoAncho = asciiArt.getAncho()+2;
        int nuevoAlto = asciiArt.getAlto()+2;

        String[] nlineas = new String[nuevoAlto];
        String borde=Character.toString(relleno);

        for (int i=0; i<nuevoAlto; i++){
            if(i==0 || i==nuevoAlto-1)
                nlineas[i]=borde.repeat(nuevoAncho);
            else {
                nlineas[i]=borde+asciiArt.lineas[i-1]+" ".repeat(asciiArt.getAncho()-asciiArt.lineas[i-1].length())+borde;
            }
        }
        lineas=nlineas;
    }
}
