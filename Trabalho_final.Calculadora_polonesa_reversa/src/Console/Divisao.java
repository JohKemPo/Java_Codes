package Console;

public class Divisao extends Operacao{

    Divisao(double a, double b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    Divisao(){
        this(0,0,' ');
    }

    public double Operacao(double a, double b){
        return a / b;
    }
}
