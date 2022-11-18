package Q19;

public class Supermercado {
    /*
     * Class: 
     * Supermercado ( main )
     * Cliente ( Carrinho ( Pedido ( Itens ( produto , quantidade ))))
     * Produtos ( preço, quantEstoque )
     * Pedido ( itens ( produtos, quantidade ))
     * FormaDePagamento
     * 
     */

    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Joao");
        
        Produto fritas = new Produto("fritas",1, 2.0);
        Produto djanho = new Produto("djanho",3, 3.0);
        Produto vodka = new Produto("vodka",10, 10.0);
        Produto finni = new Produto("finni", 2, 5.0);
        
        Carrinho c1 = new Carrinho();
        Pedido p1 = new Pedido();

        cliente1.setCarrinho(c1);
        
        p1.addProduto(fritas);
        p1.addProduto(finni);
        p1.addProduto(vodka);
        p1.addProduto(djanho);
        p1.getFormaPag(FormaDePagamento.CARTAO_CREDITO);
        c1.addPedido(p1);

        //System.out.println("Nome produto: " + p1.listProdutos.get(1).nome);
        //System.out.println("Nome produto: " + p1.listProdutos.get(1).getPreco());

        System.out.printf("COMPRAS DO CLIENTE %s:", cliente1.getNome());
        System.out.println("\n\n");
        
        for(Pedido list: cliente1.carrinho.listaPedido){
            for(int i = 0; i < list.listProdutos.size(); i ++){
                System.out.printf("Nome do produto: %s.\nPreço do produto: %.2f\n\n", list.listProdutos.get(i).nome, list.listProdutos.get(i).getPreco());
            }
        }
        System.out.println("----------------TOTAL: R$ " + c1.getTotalPreco());
        System.out.println("Forma de pagamento: " + cliente1.carrinho.getFormaPagamento(cliente1.carrinho.listaPedido).toUpperCase());
        


    }
}
