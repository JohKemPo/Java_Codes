package OperacoesPackage;

public class Multiplicacao extends Operacoes {
    public Multiplicacao(String a, String b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    public Multiplicacao(){
        this(" "," ",' ');
    }

    public String toString(){
        return String.valueOf(operacao(getA(), getB(), getOp()));
    }
    public double operacao(String a, String b, char op){
        return convertAdoub(getA()) * convertBdoub(getB());
    }
}
