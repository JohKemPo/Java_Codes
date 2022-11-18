package Heranca.ModificadoresDeAcesso.encapsulamento.CasaA;

public class Paulo {
    Ana esposa = new Ana();
    void testeAcessos(){
        //System.out.println(esposa.segredo);// erro por ser privado
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }

    
}
