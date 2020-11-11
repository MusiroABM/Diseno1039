public class Rectangulo extends  FormaComponent{

    private int x1,y1,x2,y2;

    public Rectangulo(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    @Override
    protected void dibuja() {
        System.out.println("Soy un "+ this.getClass().getName()+" formado por los puntos x1="+this.x1+
                                                                             " y1="+this.y1+
                                                                             " x2="+this.x2+
                                                                             " y2="+this.y2);
    }

    @Override
    protected void desplazaRelativo(int x, int y) {
        x1+=x;
        x2+=x;
        y1+=y;
        y2+=y;
    }
}
