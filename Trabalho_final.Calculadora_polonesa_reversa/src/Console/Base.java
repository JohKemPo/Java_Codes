package Console;

public class Base extends Operacao {
    Base(double a, double b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    Base(){
        this(0,0,' ');
    }

    public double Operacao(double a, double b){
        return a + b;
    }
}