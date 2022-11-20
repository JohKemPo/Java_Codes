package Q20;

public class Contato {
    private final String nome;
    private int id;
    private int num;

    Contato(String nome, int id, int num){
        this.nome = nome;
        this.id = id;
        this.num = num;
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String toString() {
		return ("Nome: " + nome + " id: " + id + " Contato: " + num);
	}
    
}
