package pila;
public class Pila<T> implements IPila<T> {
    
    protected int nElementos;
    protected NodoSimple<T> cima;
    
    private class NodoSimple<T> {
        private T dato;
        private NodoSimple<T> sig;
        
        public NodoSimple(T dato) {
            this.dato = dato;
        }
    }
        
    public Pila() {
        nElementos = 0;
        cima = null;
    }

    @Override
    public void push(T elemento) {
        NodoSimple<T> NodoNuevo = new NodoSimple<>(elemento);
        NodoNuevo.sig = cima;
        cima = NodoNuevo;
        nElementos++;
    }    

    @Override
    public T pop() throws PilaExcepcion {
        if (empty()) {
            throw new PilaExcepcion("La pila esta vacia");
        }
        
        T eliminado;
        eliminado = cima.dato;
        cima = cima.sig;
        nElementos--;
        return eliminado;
    }

    @Override
    public T peek() throws PilaExcepcion {
        if (empty()) {
            throw new PilaExcepcion("La lista esta vacia");
        }
        return cima.dato;
    }

    @Override
    public boolean empty() {
        return nElementos== 0;
    }   
    
    @Override
    public String toString() {
        String s = "[";
        NodoSimple<T> nodo = cima;
        while(nodo != null) {
           s+=nodo.dato.toString();
           if (nodo.sig != null) {
               s+=", ";
           }
           nodo = nodo.sig;
        }
        s+=" ]";
        return s;
    }
}