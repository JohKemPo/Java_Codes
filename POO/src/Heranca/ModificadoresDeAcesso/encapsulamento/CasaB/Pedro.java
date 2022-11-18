package Heranca.ModificadoresDeAcesso.encapsulamento.CasaB;

import Heranca.ModificadoresDeAcesso.encapsulamento.CasaA.Ana;// necessario o impor por estar em outro pacote

public class Pedro extends Ana {
    Ana mae = new Ana();
    
   
    void testeAcesso(){
        //System.out.println(mae.segredo);// erro por ser privado
        //System.out.println(mae.facoDentroDeCasa);//
        //System.out.println(mae.formaDeFalar); // Erro dado ao fato de estar acessa via instância, como pedro herda atributos/metodos de ana basta acessar.
        System.out.println(formaDeFalar); 
        System.out.println(mae.todosSabem);
        System.out.println(todosSabem);
    }

}   
