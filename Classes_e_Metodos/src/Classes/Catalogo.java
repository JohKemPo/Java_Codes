package Classes;

public class Catalogo {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Celular";
        p1.preco = 5000.00;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Note";
        p2.preco = 1230.00;
        p2.desconto = 0.5;

        System.out.println(p1.nome);
        System.out.println("R$ " + p1.precoDesconto(p1.preco, p1.desconto));
        System.out.println("\n" + p2.nome);

    }   
}
