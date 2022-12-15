package Main.Console;


public abstract class Operacao{
    private double a, b;
    // double ad, bd;
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
    
    // public double convertAd(String a){
    //     this.ad = Double.valueOf(a).doubleValue();
    //     return this.ad;
    // }
    // public double convertBd(String b){
    //     this.bd = Double.valueOf(b).doubleValue();
    //     return this.bd;
    // }
    
    public abstract String toString();
    public abstract double operacao(double a, double b);

}
