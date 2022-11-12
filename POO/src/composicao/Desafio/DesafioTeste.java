package composicao.Desafio;

public class DesafioTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria");

        Compra c1 = new Compra();
        c1.addItem("Alta", 9.1, 20);
        c1.addItem(new Produto("note",1000), 2);

        cliente.compras.add(c1);

        System.out.println(cliente.getTotalCompras());
    }
}
