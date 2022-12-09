package Console;

import java.util.Scanner;

// import Interface.Interface;

public class Calculadora {
    public static void main(String[] args) {
        // Interface Interface = new Interface();
    
        // Operacao teste = new Operacao(1.0,2.5,'+');// ERROR
        // Operacao teste = new Soma(2,2,'+');


        Operacao teste = new Base();
        Scanner in = new Scanner(System.in);

        teste.setA(in.nextDouble());
        teste.setB(in.nextDouble());
        teste.setOp(in.next().charAt(0));

        
        // System.out.println(teste.getA());
        // System.out.println(teste.getB());
        // System.out.println(teste.getOp());


        // System.out.println(teste.Operacao(teste.getA(), teste.getB()));


        switch(teste.getOp()){
            case '+':
                teste = new Soma(teste.getA(), teste.getB(), teste.getOp());
                break;
            case '-':
                teste = new Subtracao(teste.getA(), teste.getB(), teste.getOp());
                break;
            case '*':
                teste = new Multiplicacao(teste.getA(), teste.getB(), teste.getOp());
                break;
            case '/':
                teste = new Divisao(teste.getA(), teste.getB(), teste.getOp());
                break;
            default:
                System.out.println("ERROR OPERAÇÃO");
        }


        // teste = new Divisao(teste.getA(), teste.getB(), teste.getOp());
        System.out.println(teste.toString());

        in.close();
    }
    
    
}
