import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pila<T> {
    private List<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = elementos.size() - 1;
        T elemento = elementos.get(lastIndex);
        elementos.remove(lastIndex);
        return elemento;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = elementos.size() - 1;
        return elementos.get(lastIndex);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }

    public void imprimirPila() {
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }
}
