import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        Queue<Character> fila = new LinkedList<>();
        fila.add('A');
        fila.add('E');
        fila.add('I');
        fila.add('O');
        fila.add('U');

        System.out.println("Fila Original: " + fila);

        Stack<Character> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        System.out.println("Fila invertida: " + fila);
    }
}