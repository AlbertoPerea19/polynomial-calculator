import javax.swing.JOptionPane;

//Cada ListaD representa una expresion
public abstract class ListaD {
    protected NodoDoble inicio; // Representa la direccion de memoria del primer nodo
    protected NodoDoble ultimo; // Representa la direccion de memoria del ultimo nodo

    // ------ CONSTRUCTOR -----
    public ListaD() {
        inicio = ultimo = null;
    }

    // ------ DECLARACION DE METODOS -----
    public abstract void insertarTermino(int coeficiente, int exponente);

    public abstract void insertarInicio(int coeficiente, int exponente);

    public abstract void insertarFinal(int coeficiente, int exponente);

    public boolean vacio() {
        return inicio == null;
    } // Checa si hay nodos en la lista

    /**
     * Imprime la expresion de una manera entendible para nosotros
     */
    public String imprimir() {
        NodoDoble actual = inicio;
        String expresion = "", expresionFinal = "";
        while (actual != null) {
            // Dependiendo del numero de exponente se imprimen de manera diferente los
            // terminos
            if (actual.getNumero() != 0) {

                switch (actual.getExponente()) {
                    case 0:
                        expresion = Integer.toString(actual.getNumero());
                        break;
                    case 1:
                        // System.out.print(actual.getNumero() + "x");
                        expresion = Integer.toString(actual.getNumero()) + "x";
                        break;
                    default:
                        // System.out.print(actual.getNumero() + "x^" + actual.getExponente());
                        expresion = Integer.toString(actual.getNumero()) + "x^"
                                + Integer.toString(actual.getExponente());
                        break;

                }
                // System.out.println(expresion);
                if (actual.getNumero() > 0) {
                    expresionFinal = expresionFinal + " + " + expresion;
                } else {
                    expresionFinal = expresionFinal + expresion;
                }
            }

            actual = actual.getSiguiente();

        }
        // System.out.println(expresionFinal);
        // JOptionPane.showMessageDialog(null,expresionFinal, "Resultado",
        // JOptionPane.INFORMATION_MESSAGE);
        return expresionFinal;
    }

    // ----- SETTTERS Y GETTERS ------
    public NodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    public NodoDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }

}
