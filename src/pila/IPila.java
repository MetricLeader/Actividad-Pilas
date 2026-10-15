package pila;
public interface IPila<T> {
    public void push (T elemento);
    public T pop() throws PilaExcepcion;
    public T peek() throws PilaExcepcion;
    public boolean empty();
}
