package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        //"Dicio"

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Rob");
        usuarios.put(2,"Last");

        System.out.println(usuarios);
    }
}
