public class Rectangulo extends  FormaComponent{

    private int x1,y1,x2,y2;
    private int pos_x, pos_y;

    public Rectangulo(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        pos_x=0;
        pos_y=0;
    }

    @Override
    protected void dibuja() {
        System.out.println("Soy un "+ this.getClass()+" formado por los puntos x1: "+this.x1+
                                                                             " y1: "+this.y1+
                                                                             " x2: "+this.x2+
                                                                             " y2: "+this.y2+
                " y en la posición (x,y)=("+pos_x+","+pos_y+").");
    }

    @Override
    protected void desplazaRelativo(int x, int y) {
        pos_x = pos_x+x;
        pos_y = pos_y+y;
    }
}
