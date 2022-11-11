package Collections;

import java.util.HashSet;
import java.util.Set;

public class set2 {
    public static void main(String[] args) {
        
        Set<String> lista = new HashSet<String>(); // Set de strings
        lista.add("null");
        lista.add("Alfa");
        //lista.add(12); // ERROR
        System.err.println(lista);

        for(String info: lista)System.out.println(info);
    }
}
