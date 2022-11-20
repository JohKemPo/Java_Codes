package Q20;

// import java.util.List;
import java.util.ArrayList;
//import java.util.Collections;

public class Agenda {
    public static void main(String[] args) {
        ArrayList<Contato> amarelinho = new ArrayList<>();

        Contato c1 = new Contato("Joao", 2, 123456);
        Contato c2 = new Contato("Lucas", 3, 567891);
        Contato c3 = new Contato("Anabda", 4, 7894561);

        amarelinho.add(c1);
        amarelinho.add(c2);
        amarelinho.add(c3);

        for(Contato list: amarelinho){
            System.out.println(list);
        }
        //Collections.sort(amarelinho);
    }
}
