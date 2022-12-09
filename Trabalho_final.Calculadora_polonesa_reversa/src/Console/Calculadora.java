package Console;

// import Interface.Interface;

public class Calculadora {
    public static void main(String[] args) {
        // Interface Interface = new Interface();
    
        // Operacao teste = new Operacao(1.0,2.5,'+');// ERROR
        // Operacao teste = new Soma(2,2,'+');
        Operacao teste = new Base();
        teste.setA(2);
        teste.setB(2);
        teste.setOp('+');

        
        System.out.println(teste.getA());
        System.out.println(teste.getB());
        System.out.println(teste.getOp());
        // System.out.println(teste.Operacao(teste.getA(), teste.getB()));


        teste = new Multiplicacao(teste.getA(), teste.getB(), teste.getOp());
        System.out.println(teste.toString());;
    }
    
    
}
