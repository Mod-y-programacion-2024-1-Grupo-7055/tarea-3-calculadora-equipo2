import java.util.StringTokenizer;

public class NodoRaizC extends NodoOperador {
    
    public NodoRaizC(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence=2;
    }

    /**
     * La evaluación del nodo, saca la raiz la evaluación de los hijos izquierdo y
     * derecho.
     *
     * @return la división del hijo izquierdo entre el hijo derecho.
     */
    @Override
    public double evalua() {
        double d = Math.sqrt(der.evalua());
        if (d < 0) {
            throw new ArithmeticException("No puedes sacar la raiz de un numero negativo");
        }
        return d;

    }
}
