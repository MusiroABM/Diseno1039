public class Circulo extends FormaComponent{

    private int x1,y1;
    private float radio;
    private int pos_x, pos_y;

    public Circulo(int x1, int y1, float radio){
        this.x1=x1;
        this.y1=y1;
        this.radio=radio;
        pos_x=0;
        pos_y=0;
    }

    @Override
    protected void dibuja() {
        System.out.println("Soy un "+ this.getClass()+" formado por los puntos x1: "+this.x1+
                " y1: "+this.y1+
                " y un radio de +"+radio+"cm. "+
                " Me encuentro en la posición (x,y)=("+pos_x+","+pos_y+").");
    }

    @Override
    protected void desplazaRelativo(int x, int y) {
        pos_x = pos_x+x;
        pos_y = pos_y+y;
    }


}
