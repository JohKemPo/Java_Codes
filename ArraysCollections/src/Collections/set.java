package Collections;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        /*
         * Pode ser heterogeneno
         * pode ser homogeneo
         * nao aceita objetos duplicados
         * pode ser ordenado
         * nao é indexado
         * 
         * 
         * HASHSET ->
         * 
         * 
         * POLIMOFIRMISMO
         */

        HashSet conjunto = new HashSet<>();
        conjunto.add(1.2);
        conjunto.add(1);
        conjunto.add("Teste");
        conjunto.add("Teste");// n sera contabilizado por ser repetido
        conjunto.add("teste");// string diferente
        conjunto.add('X');
        conjunto.add(true);

        System.out.println(conjunto.size());
        conjunto.remove("Teste");
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains("teste"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.err.println(nums);

        //conjunto.addAll(nums); // union
        
        conjunto.retainAll(nums); // intersec
        System.out.println(conjunto);
    }    
}
