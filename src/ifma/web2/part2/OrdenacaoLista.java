package ifma.web2.part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoLista {
    public static void main(String[] args) {
        List<Integer> numerroAleatoriio = new ArrayList<>();
        numerroAleatoriio.add(10);
        numerroAleatoriio.add(22);
        numerroAleatoriio.add(6);
        numerroAleatoriio.add(90);
        numerroAleatoriio.add(-8);
        numerroAleatoriio.add(48);
        numerroAleatoriio.add(78);
        numerroAleatoriio.add(55);
        numerroAleatoriio.add(81);
        numerroAleatoriio.add(10);

       Utils.imprimir(numerroAleatoriio);

        Collections.sort(numerroAleatoriio);
        Utils.imprimir(numerroAleatoriio);

        Collections.reverse(numerroAleatoriio);
        Utils.imprimir(numerroAleatoriio);
    }
}
