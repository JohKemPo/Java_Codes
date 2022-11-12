package Collections;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        /*
         * Porde ser heterogeneo
         * Pode ser homogen
         * Aceita obj duplicados
         * é ordenado
         * é indexado
         */
        ArrayList<User> lista = new ArrayList<>();

        User u2 = new User("Alfa");
        lista.add(u2);
        lista.add(new User("Car"));

        for(User u: lista)System.out.println(u.nome);
        System.out.println(lista.get(1).nome);
    }
}
