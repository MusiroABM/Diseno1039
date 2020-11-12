import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AsciiArt> cosas	=	new ArrayList<AsciiArt>();
        cosas.add(new	Cuadrado(3,	'o'));
        cosas.add(new	Triangulo(5,	't'));
        for	(AsciiArt	cosa	:	cosas)
            //Dibuja(new Marco(cosa,'.'));
            Dibuja(new	Marco(new	DuplicaHorizontal(cosa),	'·'));
    }

    public static void Dibuja(AsciiArt asciiArt){
        String[] lineas=asciiArt.getLineas();
        for(String linea: lineas){
            System.out.println(linea);
        }
    }
}
