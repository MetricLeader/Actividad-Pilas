package pila;
public class PilaExcepcion extends RuntimeException{
    public PilaExcepcion() {
        super();
    }
    public PilaExcepcion(String msg) {
        super(msg);
    }
}
