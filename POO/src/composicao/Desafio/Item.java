package composicao.Desafio;

public class Item {
    //Item - Produto ( 1T1 )
    final Produto produto;
    final int quant;
    
    Item(Produto produto, int quant){
        this.produto = produto;
        this.quant = quant;
    }
}
