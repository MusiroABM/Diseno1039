public class StringArt2AsciiArt extends AsciiArt {

    StringArt stringArt;

    public StringArt2AsciiArt(StringArt stringArt){
        this.stringArt = stringArt;
        lineas=this.getLineas();
    }
    @Override
    public int getAncho() {
        return super.getAncho();
    }

    @Override
    public int getAlto() {
        return super.getAlto();
    }

    @Override
    public String[] getLineas() {
        String[] lineas = stringArt.Dibujo().split("\\r\\n|\\n|\\r");
        return lineas;
    }
}
