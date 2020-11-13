import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<AsciiArt> cosas	=	new ArrayList<AsciiArt>();
        //cosas.add(new	Cuadrado(3,	'o'));
        //cosas.add(new	Triangulo(5,	't'));
        //for	(AsciiArt	cosa	:	cosas)
            ////Dibuja(new Marco(cosa,'.'));
        //    Dibuja(new	Marco(new	DuplicaHorizontal(cosa),	'·'));
        List<StringArt> animales = new ArrayList<StringArt>();
        animales.add(new Rana());
        animales.add(new Murcielago());
        for (StringArt animal : animales) {
          Dibuja(new Marco(new DuplicaHorizontal(new StringArt2AsciiArt(animal)), '#'));
        }
    }

    public static void Dibuja(AsciiArt asciiArt){
        String[] lineas=asciiArt.getLineas();
        for(String linea: lineas){
            System.out.println(linea);
        }
    }
}
