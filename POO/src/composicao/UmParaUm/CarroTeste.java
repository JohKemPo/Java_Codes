package composicao.UmParaUm;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();

        System.out.println(c.estaLigado());

        System.out.println(c.motor.giros());

        c.ligar();
        System.out.println(c.estaLigado());
        System.out.println(c.motor.giros());

        c.acelera();

        System.out.println(c.motor.giros());

        c.frear();
        c.frear();
        c.frear();

        // necessario trabalhar o encapsulamento
        // c.motor.fatorInjecao = 20;// Nao pode acontecer

        System.out.println(c.motor.giros());

    }
}
