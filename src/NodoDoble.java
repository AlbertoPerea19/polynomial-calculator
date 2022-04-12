//Cada Nododoble representa un termino de la expresion

public class NodoDoble {
    protected int numero; //Representa el numero del termino por ejemplo en 3x^2, numero representa 3
    protected int exponente; //Representa el exponente del termino por ejemplo en 3x^2, exponente representa 2
    private NodoDoble siguiente; //Guarda la direccion de memoria del nodo siguiente
    private NodoDoble anterior; //Guarda la direccion de memoria del nodo anterior



// ----- CONSTRUCTORES------
    public NodoDoble(){}

    public NodoDoble(int numero, int exponente){
        this.numero = numero;
        this.exponente = exponente;
        siguiente =anterior = null;
    }

    public NodoDoble(int numero, int exponente, NodoDoble siguiente, NodoDoble anterior) {
        this.numero = numero;
        this.exponente = exponente;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }



// ----- SETTTERS Y GETTERS ------

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}
