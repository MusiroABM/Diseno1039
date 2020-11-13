public class DuplicaHorizontal extends AsciiArtDecorator{

    public DuplicaHorizontal(AsciiArt asciiArt){
        String[] nlineas = new String[asciiArt.getAlto()];
        int maximaAnchura=asciiArt.getAncho();
        for(int i=0; i<asciiArt.getAlto(); i++){
            if(asciiArt.lineas[i].length()!=maximaAnchura){
                nlineas[i] = asciiArt.lineas[i]+" ".repeat(maximaAnchura-asciiArt.lineas[i].length())+asciiArt.lineas[i];
            }else {
                nlineas[i] = asciiArt.lineas[i].repeat(2);
            }
        }
        lineas=nlineas;
    }
}
