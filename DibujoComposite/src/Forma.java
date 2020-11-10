import java.util.ArrayList;
import java.util.List;

public class Forma extends FormaComponent{

    private String nombre;
    private List<FormaComponent> formas = new ArrayList();
    private int pos_x;
    private int pos_y;

    public Forma(String nombre){
        this.nombre=nombre;
        pos_x=0;
        pos_y=0;
    }

    @Override
    protected void anade(FormaComponent fc) {
        formas.add(fc);
    }

    @Override
    protected void elimina(FormaComponent fc) {
        formas.remove(fc);
    }

    @Override
    protected void desplazaRelativo(int x, int y) {
        pos_x = pos_x+x;
        pos_y = pos_y+y;
        for(FormaComponent elem:formas){
            elem.desplazaRelativo(x,y);
        }
    }

    @Override
    protected void dibuja() {
        System.out.println("Soy una forma, de nombre \""+nombre+"\" y centrada en los puntos (x,y)=("+pos_x+","+pos_y+") y formada por los siguientes elementos:");
        for(FormaComponent elem:formas){
            elem.dibuja();
        }
    }
}
