package Console;


public abstract class Operacao{
    private double a, b;
    private char op;

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public char getOp() {
        return this.op;
    }

    public void setOp(char op) {
        this.op = op;
    }


    public String toString() {
		return "Resultado da operação: " + (Operacao(a, b));
	}
    public abstract double Operacao(double a, double b);

}
