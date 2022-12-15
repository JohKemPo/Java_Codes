package OperacoesPackage;

public abstract class Operacoes {
    private String a, b;
    private double adoub, bdoub;
    private char op;

    public String getA() {
        return this.a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return this.b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public char getOp() {
        return this.op;
    }

    public void setOp(char op) {
        this.op = op;
    }
    
    public double convertAdoub(String a){
    this.adoub = Double.valueOf(a).doubleValue();
        return this.adoub;
    }
    public double convertBdoub(String b){
        this.bdoub = Double.valueOf(b).doubleValue();
        return this.bdoub;
    }

    public abstract String toString();
    public abstract double operacao(String a, String b, char op);
}
