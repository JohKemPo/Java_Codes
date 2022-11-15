package Heranca.Desafio;

public class Ferrari extends Carro {
    Ferrari(int vel){
        super(vel);
    }
    Ferrari(){
        super(300);
    }

    void acelerar(){
        vel += 15;
    }
    void frear(){
        vel -= 10;
    }
}
