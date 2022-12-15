package Main.Console;

import java.util.*;

// import Interface.Interface;

public class Calculadora {
    public static void main(String[] args) {
        // Interface Interface = new Interface();
    
        
        
        int validador = 0;
        Operacao teste = new Base(); //Polimorfismo
        Scanner in = new Scanner(System.in);

        Stack<String> pilha = new Stack<>();
        

        do{
            

            teste.setA(in.nextDouble());
            teste.setB(in.nextDouble());
            teste.setOp(in.next().charAt(0));
            

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
    
            System.out.println(teste.toString());
            
            System.out.println("DIgite -1 para sair.");
            validador = in.nextInt();
        }while(validador != -1);


        // teste = new Divisao(teste.getA(), teste.getB(), teste.getOp());

        in.close();
    }
    
    
}
