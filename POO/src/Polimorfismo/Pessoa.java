package Polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
    // public void comer(Feijao arroz){
    //     this.peso += arroz.getPeso();
    // }
    // public void comer(Sorvete arroz){
    //     this.peso += arroz.getPeso();
    // }
}
