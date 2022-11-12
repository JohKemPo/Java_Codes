package composicao;

public class CompreTeste {
    public static void main(String[] args) {
        
        Compra c = new Compra();
        c.cliente = "Lol";
        c.addItem(new Item("Caneta", 2, 3.20));

        for(Item u: c.itens){
            System.out.println(u.nome);
            System.out.println(u.preco);
            System.out.println(u.quant);
        }
    }   
}
