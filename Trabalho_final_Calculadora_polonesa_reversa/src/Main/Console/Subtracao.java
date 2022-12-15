package Main.Console;

public class Subtracao extends Operacao{

    Subtracao(double a, double b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    Subtracao(){
        this(0,0,' ');
    }

    public double operacao(double a, double b){
        return a - b;
    }

    public String toString() {
		return "Resultado da operação: " + (operacao(getA(), getB()));
	}
}
