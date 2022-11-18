package Heranca.ModificadoresDeAcesso.Desafio;


public class Carro {
    int vel = 0;
    final int VELOCIDADE_MAXIMA;
    
    protected Carro(){
        this(100);
    }
    protected Carro(int velMax){
        VELOCIDADE_MAXIMA = velMax;
    }
     
    public void acelerar(){
        
        if(vel+5 >= VELOCIDADE_MAXIMA && vel >= 0){
            vel = VELOCIDADE_MAXIMA;
        }else{
            vel += 5;
        }
    }
    public void frear(){
        
        if(vel >= 0){
            vel -= 5;
        }
        
    }
}
