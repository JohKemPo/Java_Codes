package composicao.Desafio;
import java.util.*;

public class Cliente {
    //Um cliente tem muiras compras, uma compra so tem um cliente ( 1T1 )
    final List<Compra> compras = new ArrayList<>();
    final String nome;

    Cliente(String nome){
        this.nome = nome;
    }

    double getTotalCompras(){
        double totalAll = 0;
        for(Compra compra: compras){
            totalAll += compra.getTotal();
        }
        return totalAll;
    }
}
