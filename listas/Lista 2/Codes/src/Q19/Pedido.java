package Q19;

import java.util.ArrayList;

public class Pedido {
    int iten;
    public int formaPag;
    ArrayList<Produto> listProdutos = new ArrayList<>();

    boolean getFormaPag(FormaDePagamento forma){
    switch(forma){
        case CARTAO_CREDITO:
            formaPag = 1;
            break;
        case CARTAO_DEBITO:
            formaPag = 2;
            break;
        case PIX:
            formaPag = 3; 
            break;
        default:
            return false;
        }
        return true;
    }

    boolean addProduto(Produto prod){
        listProdutos.add(prod);
        return true;
    }
}
