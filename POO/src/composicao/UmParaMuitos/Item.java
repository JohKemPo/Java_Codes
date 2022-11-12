package composicao.UmParaMuitos;

public class Item {
    String nome;
    int quant;
    double preco;
    Compra compra;

    Item(String nome, int quant, double preco){
        this.nome = nome;
        this.quant = quant;
        this.preco = preco;
    }
}
