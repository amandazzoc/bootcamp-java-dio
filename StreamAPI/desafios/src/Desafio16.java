import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosImpares = numeros.stream()
        .filter(n -> n % 2 == 1)
        .toList();

        List<Integer> numerosPares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .toList();

        System.out.println("Lista de números Impares da lista: " + numerosImpares);
        System.out.println("Lista de números Pares da lista: " + numerosPares);
    }
}
