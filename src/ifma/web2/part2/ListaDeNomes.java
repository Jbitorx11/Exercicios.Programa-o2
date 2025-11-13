package ifma.web2.part2;

import java.util.ArrayList;
import java.util.Collection;

public class ListaDeNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("JUh");
        nomes.add("João");
        nomes.add("Eduh");
        nomes.add("Helen");
        nomes.add("Doritos");



        System.out.println("Lista de Nomes: ");
        for (String nome : nomes) {
            System.out.println(nome);

        }
    }
    }
