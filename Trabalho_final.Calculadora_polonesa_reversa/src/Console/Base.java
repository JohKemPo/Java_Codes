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

    public double operacao(double a, double b){
        return 0;
    }
}
