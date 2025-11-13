package ifma.web2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Map<String, Integer> MapaProdutos = new HashMap<>();
        MapaProdutos.put("Placa de Video", 5);
        MapaProdutos.put("Procesador", 10);
        MapaProdutos.put("memoria RAM", 3);
        MapaProdutos.put("HD SSD", 5);

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja: ");
        String termoDeBusca = input.nextLine();

        if (MapaProdutos.containsKey(termoDeBusca)) {
            System.out.println("Produto encontrado: " + termoDeBusca + " qtd: " + MapaProdutos.get(termoDeBusca));
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}