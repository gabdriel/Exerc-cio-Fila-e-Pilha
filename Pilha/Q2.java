import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {

        String palavra1 = "arara";
        vfPalindromo(palavra1);
        String palavra2 = "casa";
        vfPalindromo(palavra2);
    }

    public static void vfPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        String invertida = "";
        while (!pilha.isEmpty()) {
            invertida += pilha.pop();
        }

        System.out.println("Palavra: " + palavra);

        if (palavra.equals(invertida)) {
            System.out.println("É um palíndromo\n");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }
}