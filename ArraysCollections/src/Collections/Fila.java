package Collections;
import java.util.*;

public class Fila {
    public static void main(String[] args) {
        /*
         * QUEUE
         * 
         */

         Queue<String> fila = new LinkedList<>();

         fila.add("ANA");
         fila.add("ANA");
         fila.add("ANA");
         fila.add("ANA");
         fila.add("ANA");
         fila.add("ANA");

         fila.offer("Bia"); // usado para filas limitadas
         for(String i: fila)System.out.println(i);  

         //fila.peek(); Retorna null se vazia ( retorna elemento )
         //fila.element(); Da error se fila vazia ( retorna elemento )

    }
}
