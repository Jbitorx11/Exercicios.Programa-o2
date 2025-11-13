package ifma.web2.part2;

import java.util.Collection;

public class Utils {
    public static void imprimir(Collection Lista) {
        System.out.println("lista: ");
        for (Object elemento : Lista) ;
        System.out.println("Elementos: \n" + Lista);
    }
}