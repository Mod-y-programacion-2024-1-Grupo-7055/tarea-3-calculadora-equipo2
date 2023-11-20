public class NodoSeno extends NodoOperador {

    /**
     *
     * @param izq
     * @param der
     */
    public NodoSeno(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence=2;
    }

    /**
     * La evaluación del nodo, divide la evaluación de los hijos izquierdo y
     * derecho.
     *
     * @return la división del hijo izquierdo entre el hijo derecho.
     */
    @Override
    public double evalua() {
        double d = der.evalua();
        
        return Math.sin(d);
    }
}