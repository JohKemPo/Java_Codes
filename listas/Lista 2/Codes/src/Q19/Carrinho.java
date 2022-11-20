package Q19;

import java.util.ArrayList;

public class Carrinho extends Pedido{
    ArrayList<Pedido> listaPedido = new ArrayList<>(); 
    double total;
    String forma;

    boolean addPedido(Pedido pedido){
        listaPedido.add(pedido);
        return true;
    }

    String getFormaPagamento(ArrayList<Pedido> list){
        for(Pedido info: listaPedido){
            switch(info.formaPag){
                case 1:
                   return "Cartao de crédito";
                case 2:
                    return "Cartao de débito";
                case 3:
                    return "Pix";
            }
        }
        return forma;
    }

    public double getTotalPreco(){
        for(Pedido list: listaPedido){
            for(int i = 0; i < list.listProdutos.size(); i++){
                total += list.listProdutos.get(i).getPreco();
            }
        }
        return total;
    }
}
