package OperacoesPackage;

public class Soma extends Operacoes{
    public Soma(String a, String b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    public Soma(){
        this(" "," ",' ');
    }

    public String toString(){
        return String.valueOf(operacao(getA(), getB(), getOp()));
    }
    public double operacao(String a, String b, char op){
        return convertAdoub(getA()) + convertBdoub(getB());
    }
}
