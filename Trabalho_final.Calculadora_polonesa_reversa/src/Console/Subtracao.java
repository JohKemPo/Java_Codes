package Console;

public class Subtracao extends Operacao{

    Subtracao(double a, double b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    Subtracao(){
        this(0,0,' ');
    }

    public double Operacao(double a, double b){
        return a - b;
    }
}
