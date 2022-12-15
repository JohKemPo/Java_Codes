package Interface;

import OperacoesPackage.*;
import java.util.*;;

public class Calcula extends Operacoes{
    public String Calc(String teste){
         
        ArrayList<String> separadas = new ArrayList<>();

        //String teste = "10 5 9 - *";
        //String teste = "2r3i 4r6i /";
     
        Operacoes base = new Base(); //Polimorfismo

        String[] sep = teste.split("\s");

        for(String elem: sep){
            separadas.add(elem);
        }
        
        base.setA(sep[(sep.length/2)-1]);
        base.setB(sep[(sep.length/2)]);
        base.setOp(sep[(sep.length/2)+1].charAt(0));

        if(teste.toLowerCase().contains("i")){
            base = new Complexos(base.getA(), base.getB(), base.getOp());
        

            System.out.println("COMPLEXO");
            System.out.printf("--> %s %s %c\n", base.getA(), base.getB(), base.getOp());


            while(separadas.size() > 1){

                separadas.remove(new String(separadas.get(separadas.size()/2)));
                separadas.remove(new String(separadas.get(separadas.size()/2)));
                separadas.remove(new String(separadas.get(separadas.size()/2)));

                if(separadas.size() >= 1){
                    
                    if(separadas.size() <= 3 && separadas.size()%2 == 0){
                        separadas.add((separadas.size()/2), base.toString());
                        

                    }else{
                        separadas.add((separadas.size()/2)-1, base.toString()); 

                    }
                    // System.out.println("-> " + base.toString());
                    
                    if(separadas.size() >= 3){
                        base.setA(separadas.get((separadas.size()/2)-1));
                        base.setB(separadas.get((separadas.size()/2)));
                        base.setOp(separadas.get((separadas.size()/2)+1).charAt(0));    
                    }
                }else{
                    separadas.add(base.toString());
                }
            }
            return String.valueOf(separadas);

        }else{
            while(separadas.size() > 1){
                
                

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
                        System.out.println("ERRO");
                }

                separadas.remove(new String(separadas.get(separadas.size()/2)));
                separadas.remove(new String(separadas.get(separadas.size()/2)));
                separadas.remove(new String(separadas.get(separadas.size()/2)));
 

                if(separadas.size() >= 1){
                   
                    if(separadas.size() <= 3 && separadas.size()%2 == 0){
                        separadas.add((separadas.size()/2), base.toString());
                        

                    }else{
                        separadas.add((separadas.size()/2)-1, base.toString()); 

                    }
                    
                    
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
        return String.valueOf(separadas);        
    } 
    
    public String toString(){
        return "NULL";
    }
    public double operacao(String a, String b, char op){
        return 1;
    }  
}
