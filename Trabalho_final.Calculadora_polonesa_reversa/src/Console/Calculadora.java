package Console;

import java.util.Scanner;

// import Interface.Interface;

public class Calculadora {
    public static void main(String[] args) {
        // Interface Interface = new Interface();
    
        
        
        int validador = 0;
        Operacao teste = new Base();
        Scanner in = new Scanner(System.in);

        // Operacao teste = new Operacao(1.0,2.5,'+');// ERROR
        // Operacao teste = new Soma(2,2,'+');
        
        
        
        
        // System.out.println(teste.getA());
        // System.out.println(teste.getB());
        // System.out.println(teste.getOp());
        
        
        // System.out.println(teste.Operacao(teste.getA(), teste.getB()));

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
