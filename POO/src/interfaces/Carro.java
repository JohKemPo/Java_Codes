package interfaces;

public class Carro {
    public final int VELOCIDADE_MAXIMA;// final - constante endereço // public - qualquer metodo pode ver
    protected int velocidadeAtual;// somente herdeiros veem
    private int delta = 5;// privada a Carro


    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }//Construtor

    public void acelerar(){
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
    }

    public void frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual += getDelta();
        }
    }

    // public int getVELOCIDADE_MAXIMA() {
    //     return this.VELOCIDADE_MAXIMA;
    // }


    // public int getVelocidadeAtual() {
    //     return this.velocidadeAtual;
    // }

    // public void setVelocidadeAtual(int velocidadeAtual) {
    //     this.velocidadeAtual = velocidadeAtual;
    // }

    public int getDelta() {
        return this.delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h.";
	}

}
