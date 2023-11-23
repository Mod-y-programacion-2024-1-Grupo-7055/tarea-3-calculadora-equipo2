
import java.util.StringTokenizer;



/**
 *
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
public class Calculadora {
    static Compilador comp;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ErrorDeSintaxisException {
        
        
        String cadena = "t(45a)";
        comp = new Compilador();
        
        private  Operar(){

        }
        
        try {
        
            StringTokenizer lexemas = comp.analisisLexico(cadena);
            CompositeEA nodo = comp.arbolDeAnalisisSintactico(lexemas);
            System.out.println(cadena);
            System.out.println(nodo);
            System.out.println(nodo.evalua());
        } catch (Exception ErrorDeSintaxisException) {
            System.err.println(ErrorDeSintaxisException.getMessage());
        }
        
    }
}