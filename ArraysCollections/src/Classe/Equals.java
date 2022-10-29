package Classe;
public class Equals {

    public static void main(String[] args) {
        // objetos "seguem a mesma logica" de ponteiros em C, 
        //um ponteiro aponta para um endereço de memoria que contem uma informação
        /*
         * igualar objeto pq e p2 dara False
        */
        Produto p1 = new Produto();
        p1.nome = "Caneta";

        Produto p2 = new Produto();
        p2.nome = "Caneta";

        System.out.println(p1==p2);
        System.out.println(p1.nome == p2.nome);
        System.out.println(p1.equals(p2));
    }
}
