import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import OperacoesPackage.Operacoes;
import OperacoesPackage.Complexos;
import OperacoesPackage.Base;
import OperacoesPackage.Soma;
import OperacoesPackage.Subtracao;
import OperacoesPackage.Divisao;
import OperacoesPackage.Multiplicacao;



public class App {

    
    public static void main(String[] args) throws Exception {
        String a, b;
        char op;
        ArrayList<String> separadas = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        // String teste = "10 5 9 - *";
        String teste = "20r2i 9 -";
     
        Operacoes base = new Base(); //Polimorfismo

        String[] sep = teste.split("\s");

        for(String elem: sep){
            separadas.add(elem);
        }
        
        base.setA(sep[(sep.length/2)-1]);
        base.setB(sep[(sep.length/2)]);
        base.setOp(sep[(sep.length/2)+1].charAt(0));

        if(teste.toLowerCase().contains("i")){
            String a_real, a_img;
            String b_real, b_img;

            System.out.println("COMPLEXO");
            a_real = separadas.get(0).toString();
            // a_real = a_real.split("r");
            System.out.println();

            a_real = separadas.get((separadas.size()/2)-1);

        }else{
            while(separadas.size() > 1){
                System.out.println("NORMAL");
                System.out.printf("--> %s %s %c\n", base.getA(), base.getB(), base.getOp());
                System.out.println(separadas);

                switch(base.getOp()){
                    case '+':
                        base = new Soma(base.getA(), base.getB(), base.getOp());
                        break;
                    case '-':
                        base = new Subtracao(base.getA(), base.getB(), base.getOp());
                        break;
                    case '*':
                        base = new Multiplicacao(base.getA(), base.getB(), base.getOp());
                        break;
                    case '/':
                        base = new Divisao(base.getA(), base.getB(), base.getOp());
                        break;
                    default:
                        throw new IllegalAccessException("Erro entrada"); 
                }

                separadas.remove(new String(separadas.get(separadas.size()/2)));
                separadas.remove(new String(separadas.get(separadas.size()/2)));
                separadas.remove(new String(separadas.get(separadas.size()/2)));

                //System.out.println("SIZE "  + separadas.size()); 

                if(separadas.size() >= 1){
                   
                    if(separadas.size() <= 3 && separadas.size()%2 == 0){
                        separadas.add((separadas.size()/2), base.toString());
                        

                    }else{
                        separadas.add((separadas.size()/2)-1, base.toString()); 

                    }
                    System.out.println("-> " + base.toString());
                    
                    if(separadas.size() >= 3){
                        base.setA(separadas.get((separadas.size()/2)-1));
                        base.setB(separadas.get((separadas.size()/2)));
                        base.setOp(separadas.get((separadas.size()/2)+1).charAt(0));    
                    }
                }else{
                    separadas.add(base.toString());
                }
           }
        }
        System.out.println(separadas);

        
        
        input.close();  

    }
}
 