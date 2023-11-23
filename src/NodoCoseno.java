public class NodoCoseno extends NodoOperador {

    /**
     *
     * @param izq
     * @param der
     */
    public NodoCoseno(CompositeEA izq, CompositeEA der) {
        super(null, der);
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
        double d = Math.cos(der.evalua());
        return d;

    }
}
