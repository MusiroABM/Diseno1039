public class DuplicaHorizontal extends AsciiArtDecorator{

    public DuplicaHorizontal(AsciiArt asciiArt){
        String[] nlineas = new String[asciiArt.getAlto()];
        for(int i=0; i<asciiArt.getAlto(); i++){
            nlineas[i]=asciiArt.lineas[i].repeat(2);
        }
        lineas=nlineas;
    }
}
