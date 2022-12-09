package Console;

public class Soma extends Operacao{
    
    Soma(double a, double b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    Soma(){
        this(0,0,' ');
    }

    public double Operacao(double a, double b){
        return a + b;
    }
}
