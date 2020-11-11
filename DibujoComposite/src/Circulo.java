public class Circulo extends FormaComponent{

    private int x1,y1;
    private float radio;

    public Circulo(int x1, int y1, float radio){
        this.x1=x1;
        this.y1=y1;
        this.radio=radio;
    }

    @Override
    protected void dibuja() {
        System.out.println("Soy un "+ this.getClass().getName()+" formado por los puntos x="+this.x1+
                " y="+this.y1+
                " y un radio de "+radio+"cm");
    }

    @Override
    protected void desplazaRelativo(int x, int y) {
        x1+=x;
        y1+=y;
    }


}
