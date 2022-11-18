package Heranca.ModificadoresDeAcesso.encapsulamento.GetSet;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(20);
        //Como ler uma var privada?

        //p.inIdade(20);// Get
        p.setIdade(-15);
        System.out.println(p.getIdade());//Set

    }
}
