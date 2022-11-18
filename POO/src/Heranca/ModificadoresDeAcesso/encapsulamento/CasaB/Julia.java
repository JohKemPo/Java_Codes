package Heranca.ModificadoresDeAcesso.encapsulamento.CasaB;

import Heranca.ModificadoresDeAcesso.encapsulamento.CasaA.Ana;// necessario o impor por estar em outro pacote


public class Julia{
    Ana sogra = new Ana();
    Pedro namorado = new Pedro();
    
    
    void testeAcesso(){
        //System.out.println(sogra.segredo);// erro por ser privado
        //System.out.println(sogra.facoDentroDeCasa);//
        //System.out.println(sogra.formaDeFalar); // Erro dado ao fato de estar acessa via instância, como pedro herda atributos/metodos de ana basta acessar.
        //System.out.println(formaDeFalar); 
        System.out.println(sogra.todosSabem);
        //System.out.println(todosSabem);


        //System.out.println(namorado.formaDeFalar); // N funciona!!
    }
}
