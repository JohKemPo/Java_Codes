package OperacoesPackage;

public class Subtracao extends Operacoes {
    public Subtracao(String a, String b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    public Subtracao(){
        this(" "," ",' ');
    }

    public String toString(){
        return String.valueOf(operacao(getA(), getB(), getOp()));
    }
    public double operacao(String a, String b, char op){
        return convertAdoub(getA()) - convertBdoub(getB());
    }
}
