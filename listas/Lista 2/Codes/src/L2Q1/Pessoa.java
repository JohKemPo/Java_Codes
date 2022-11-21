package L2Q1;

public class Pessoa {
    private int idade;
    private String nome;
    public Pessoa pai;
    public Pessoa mae;
    
    // Pessoa(){
    //     this(0, "");
    // }
    
    Pessoa(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public Pessoa getPai() {
        return this.pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return this.mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }


    public String toString() {
		return "___________________\n\n" + "Nome: "+ getNome() + "\nIdade: "+ getIdade() + "\nPai: "+ pai.getNome() + "\nMãe: " + mae.getNome() + "\n___________________\n";
	}
}
