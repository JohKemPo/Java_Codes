package Heranca.Desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro car = new Carro();
        Carro ferrari = new Ferrari();

        car.acelerar();
        car.acelerar();
        car.acelerar();

        System.out.printf("\nCarro velocida Maxima: %d", car.VELOCIDADE_MAXIMA);
        System.out.printf("\nFerrari velocida Maxima: %d", ferrari.VELOCIDADE_MAXIMA);
        System.out.printf("\nCarro velocida: %d", car.vel);
        System.out.printf("\nFerrari velocida: %d", ferrari.vel);

        car.frear();
        car.frear();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        

        System.out.printf("\nCarro velocida: %d", car.vel);
        System.out.printf("\nFerrari velocida: %d", ferrari.vel);

        ferrari.frear();
        ferrari.frear();

        System.out.printf("\nCarro velocida: %d", car.vel);
        System.out.printf("\nFerrari velocida: %d", ferrari.vel);
    }
}
