import javax.swing.JOptionPane;

public class ListaDoble extends ListaD {
    private ListaDoble expresion3;

    @Override
    /**
     * Inserta los terminos de manera ordenada, de mayor a menor exponente
     * 
     * @param numero    coeficiente de la expresion
     * @param exponente exponente de la funcion
     */
    public void insertarTermino(int numero, int exponente) {
        /** Checa que la lista no esté vacia */
        if (vacio()) {
            insertarInicio(numero, exponente);
        } else {
            /** Checa si la lista solo tiene un termino */
            if (inicio == ultimo) {
                if (exponente > inicio.getExponente())
                    insertarInicio(numero, exponente);
                else
                    insertarFinal(numero, exponente);
            }
            /** Inserta adentro de la lista */
            else {
                NodoDoble antes = null;
                NodoDoble despues = inicio;
                while (despues != null && exponente < despues.getExponente()) {
                    antes = despues;
                    despues = despues.getSiguiente();

                }
                if (antes == null) {
                    insertarInicio(numero, exponente);
                } else {
                    if (despues == null) {
                        insertarFinal(numero, exponente);
                    } else {
                        NodoDoble nuevo = new NodoDoble(numero, exponente, despues, antes);
                        antes.setSiguiente(nuevo);
                        despues.setAnterior(nuevo);
                    }
                }
            }
        }

    }

    /**
     * Esta funcion inserta un nodo al principio de la lista
     * Recibe datos numero y exponente los cuales son enteros
     * 
     * @param numero    coeficiente de la expresion
     * @param exponente exponente de la funcion
     */
    @Override
    public void insertarInicio(int numero, int exponente) {
        if (vacio()) {
            inicio = ultimo = new NodoDoble(numero, exponente);
        } else {
            NodoDoble nuevo = new NodoDoble(numero, exponente, inicio, null);
            inicio.setAnterior(nuevo);
            inicio = nuevo;

        }
    }

    /**
     * Esta funcion inserta un nodo al final de la lista
     * Recibe datos numero y exponente los cuales son enteros
     * 
     * @param numero    coeficiente de la expresion
     * @param exponente exponente de la funcion
     */
    @Override
    public void insertarFinal(int numero, int exponente) {
        if (vacio()) {
            inicio = ultimo = new NodoDoble(numero, exponente);
        } else {
            NodoDoble nuevo = new NodoDoble(numero, exponente, null, ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;

        }
    }

    /**
     * Suma 2 expresiones y al final imprime el resultado
     * 
     * @param expresion1 primera expresion a sumar
     * @param expresion2 segunda expresion a sumar
     */
    public static void sumar(ListaDoble expresion1, ListaDoble expresion2) {
        ListaDoble resultado = new ListaDoble();

        for (int i = 6; i >= 0; i--) {
            NodoDoble actual1 = expresion1.getInicio();
            NodoDoble actual2 = expresion2.getInicio();
            int var = 0;
            while (actual1 != null) {
                if (actual1.exponente == i) {
                    var = actual1.getNumero();
                }
                actual1 = actual1.getSiguiente();
            }
            while (actual2 != null) {
                if (actual2.exponente == i) {
                    var += actual2.getNumero();
                }
                actual2 = actual2.getSiguiente();
            }
            resultado.insertarFinal(var, i);
        }
        resultado.imprimir();
        JOptionPane.showMessageDialog(null, resultado.imprimir(), "Resultado SUMAR", JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * Resta 2 expresiones y al final imprime el resultado
     * 
     * @param expresion1 primera expresion a restar
     * @param expresion2 segunda expresion a restar
     */
    public static void restar(ListaDoble expresion1, ListaDoble expresion2) {
        ListaDoble resultado = new ListaDoble();

        for (int i = 6; i >= 0; i--) {
            NodoDoble actual1 = expresion1.getInicio();
            NodoDoble actual2 = expresion2.getInicio();
            int var = 0;
            while (actual1 != null) {
                if (actual1.exponente == i) {
                    var = actual1.getNumero();
                }
                actual1 = actual1.getSiguiente();
            }
            while (actual2 != null) {
                if (actual2.exponente == i) {
                    var -= actual2.getNumero();
                }
                actual2 = actual2.getSiguiente();
            }
            resultado.insertarFinal(var, i);
        }
        resultado.imprimir();
        JOptionPane.showMessageDialog(null, resultado.imprimir(), "Resultado RESTAR", JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * multiplica 2 expresiones y al final imprime el resultado
     * 
     * @param expresion1 primera expresion a multiplicar
     * @param expresion2 segunda expresion a multiplicar
     */
    public void multiplicar(ListaDoble expresion1, ListaDoble expresion2) {
        NodoDoble actual1 = expresion1.getInicio();
        NodoDoble actual2 = expresion2.getInicio();
        expresion3 = new ListaDoble();
        // ListaDoble resultado = new ListaDoble();
        int num = 0;
        int expo = 0;

        while (actual1 != null) {
            while (actual2 != null) {
                num = actual1.getNumero() * actual2.getNumero();
                // System.out.println(num);
                expo = actual1.getExponente() + actual2.getExponente();
                // System.out.println(expo);
                expresion3.insertarTermino(num, expo);
                // System.out.println("\n");
                // expresion3.imprimir();

                actual2 = actual2.getSiguiente();

            }
            // expresion3.insertarTermino(300, 500);

            actual2 = expresion2.getInicio();
            actual1 = actual1.getSiguiente();
        }
        simplificar();

    }

    /**
     * multiplica 2 expresiones y al final imprime el resultado
     * 
     * @param expresion1 expresion a multiplicar por el escalar
     * @param escalar    numero por el que se multiplica toda la expresion
     */
    public void multiplicarEscalar(ListaDoble expresion, int escalar) {
        ListaDoble expresion2 = new ListaDoble();
        NodoDoble actual = expresion.getInicio();
        while (actual != null) {
            int num = actual.getNumero() * escalar;
            expresion2.insertarTermino(num, actual.exponente);
            actual = actual.getSiguiente();
        }

        JOptionPane.showMessageDialog(null, expresion2.imprimir(), "Resultado ESCALAR",
                JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Simplifica la expresion suma los terminos con exponentes iguales
     */
    public void simplificar() {
        ListaDoble resultado = new ListaDoble();

        for (int i = 12; i >= 0; i--) {
            NodoDoble actual = expresion3.getInicio();

            int var = 0;
            while (actual != null) {
                if (actual.exponente == i) {
                    var += actual.numero;
                }
                actual = actual.getSiguiente();
            }
            resultado.insertarFinal(var, i);
        }

        resultado.imprimir();
        JOptionPane.showMessageDialog(null, resultado.imprimir(), "Resultado MULTIPLICACION",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
