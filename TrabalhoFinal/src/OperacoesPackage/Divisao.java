package OperacoesPackage;

public class Divisao extends Operacoes {
    public Divisao(String a, String b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    public Divisao(){
        this(" "," ",' ');
    }

    public String toString(){
        return String.valueOf(operacao(getA(), getB(), getOp()));
    }
    public double operacao(String a, String b, char op){
        return convertAdoub(getA()) / convertBdoub(getB());
    }
}
