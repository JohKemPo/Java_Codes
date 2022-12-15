package OperacoesPackage;

public class Base extends Operacoes {
    public Base(String a, String b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    public Base(){
        this(" "," ",' ');
    }

    public String toString(){
        return "NULL";
    }
    public double operacao(String a, String b, char op){
        return 1;
    }
}
