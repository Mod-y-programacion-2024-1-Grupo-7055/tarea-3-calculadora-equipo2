import java.util.Scanner;
import java.util.StringTokenizer;



/**
 *
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
public class Calculadora {
    static Compilador comp;

    static String cadena;

    public static void hazOperacion(String cadena) throws ErrorDeSintaxisException  {
            StringTokenizer lexemas = comp.analisisLexico(cadena);
            CompositeEA nodo = comp.arbolDeAnalisisSintactico(lexemas);
            System.out.println(cadena);
            double resultado = nodo.evalua();
            System.out.println("El resultado es " + resultado);
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ErrorDeSintaxisException {
        
        String respuesta="";
        comp = new Compilador();
        Scanner scanner = new Scanner(System.in);
        while (!respuesta.equals("N")&&!respuesta.equals("n")) {
            // Menú de la calculadora
            System.out.println("------Calculadora Terminal------");
            System.out.println("+. Suma");
            System.out.println("-. Resta");
            System.out.println("*. Multiplicación");
            System.out.println("/. División");
            System.out.println("r. Raiz");
            System.out.println("s. Seno");
            System.out.println("c. Coseno");
            System.out.println("t. Tangente");
            System.out.print("Digite la operacion deseada: ");
            cadena = scanner.nextLine();
            

            try {
            hazOperacion(cadena);
        } catch (Exception ErrorDeSintaxisException) {
            System.err.println(ErrorDeSintaxisException.getMessage());
        }
            System.out.println("Quiere continuar? S/N");
            respuesta = scanner.nextLine();
            if(respuesta.equals("n")||respuesta.equals("N"))
            System.out.println("Vuelva pronto :)");
        }
        
        
        
    }
}