package composicao.Desafio;

import java.util.ArrayList;

public class Compra {
    //Compra - Item ( 1TN )
    final ArrayList<Item> itens = new ArrayList<>();


    void addItem(Produto p, int quant){
        this.itens.add(new Item(p,quant));
    }
    void addItem(String nome, double preco, int quant){
        this.itens.add(new Item(new Produto(nome, preco),quant));
    }

    double getTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quant * item.produto.preco;
        }
        return total;
    }
}
