package Heranca.ModificadoresDeAcesso.encapsulamento.GetSet;

public class Pessoa {
    private int idade;

    public Pessoa(int idade){
        setIdade(idade);
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idadeNova){
        idadeNova = Math.abs(idadeNova);
        if(idadeNova >= 0 && idadeNova <= 110){
            this.idade = idadeNova;
        }
    }
}
