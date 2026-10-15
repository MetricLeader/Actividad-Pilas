package pila;
public class PilaPruebas {
    public static void main(String[] args) {
        Pila Stack = new Pila<>();
        
        System.out.println("Metodo push: ");
        
        Stack.push("Juan");
        Stack.push("Zayuri");
        Stack.push("Daniel");
        Stack.push("Angel");
        
        System.out.println(Stack.toString());
        
        System.out.println("Metodo pop: ");
        System.out.println(Stack.pop());
        System.out.println(Stack.toString());
        
        System.out.println("Metodo peek: ");
        System.out.println(Stack.peek());
        
        
        System.out.println("Metodo empty: ");
        System.out.println(Stack.empty());
    }
    
}
