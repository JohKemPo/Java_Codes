package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("PppPp");
        livros.add("Aaa");
        livros.push("Pp");// add top
        System.out.println(livros);

        System.out.println(livros.peek());
    }
}
