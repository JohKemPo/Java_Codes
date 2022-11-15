package Heranca.Desafio;

public class Carro {
    int vel = 0;
    final int VELOCIDADE_MAXIMA;
    Carro(){
        this(100);
    }
    Carro(int velMax){
        VELOCIDADE_MAXIMA = velMax;
    }
     
    void acelerar(){
        
        if(vel+5 >= VELOCIDADE_MAXIMA && vel >= 0){
            vel = VELOCIDADE_MAXIMA;
        }else{
            vel += 5;
        }
    }
    void frear(){
        
        if(vel >= 0){
            vel -= 5;
        }
        
    }
}
