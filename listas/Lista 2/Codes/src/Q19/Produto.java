package Q19;
import java.util.*;
public class Produto {
    final String nome;
    public int quantEstoque;
    private double preco;

    Produto(String nome, int qtEstoquq, double preco){
        this.nome = nome;
        this.quantEstoque = qtEstoquq;
        this.preco = preco;
    }

    public int getQuantEstoque() {
        return this.quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && quantEstoque == produto.quantEstoque && preco == produto.preco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantEstoque, preco);
    }
    
}
