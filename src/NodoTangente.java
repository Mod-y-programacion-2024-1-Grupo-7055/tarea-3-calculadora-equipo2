public class NodoTangente extends NodoOperador {

    /**
     *
     * @param izq
     * @param der
     */
    public NodoTangente(CompositeEA izq, CompositeEA der) {
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
        if (Double.compare(0, d) == 0) {
            throw new ArithmeticException("No puedes dividir entre cero");
        }
        return izq.evalua() / d;
    }
}
