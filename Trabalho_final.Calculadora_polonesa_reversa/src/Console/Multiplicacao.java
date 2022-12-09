package Console;

public class Multiplicacao extends Operacao{

    Multiplicacao(double a, double b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    Multiplicacao(){
        this(0,0,' ');
    }

    public double operacao(double a, double b){
        return a * b;
    }
}
