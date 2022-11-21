package L2Q1;

public class Arvore {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(23, "Lupin");
        Pessoa p2 = new Pessoa(40, "Baltin");
        Pessoa p3 = new Pessoa(38, "Luna");
        Pessoa p4 = new Pessoa(30, "Clau");

        p1.setPai(p2);
        p1.setMae(p3);
        p4.setPai(p1);
        System.out.println(p1);
        System.out.println(p4.pai.pai.getNome());
        System.out.println();

    } 
}
