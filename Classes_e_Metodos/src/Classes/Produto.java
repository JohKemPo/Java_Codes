package Classes;

public class Produto {

    String nome;
    double preco;
    double desconto;
    double PrecoFinal;

    double precoDesconto(double preco, double desconto){
        return preco * (1 - desconto);
    }
    
}
