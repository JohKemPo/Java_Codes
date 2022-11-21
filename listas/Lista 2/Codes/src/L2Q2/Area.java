package L2Q2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Forma quad = new Quadrado();
        quad.addCoord(0,0);
        quad.addCoord(1,1);

        Forma ret = new Retangulo();
        ret.addCoord(0,0);
        ret.addCoord(1,1);

        Forma tri = new Triangulo();
        tri.addCoord(0,0);
        tri.addCoord(1,1);

        Forma circ = new Circulo();
        // circ.addCoord(0,0);
        try {
            circ.addCoord(tec.nextInt(), tec.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Erro");
            System.exit(1);

        }
        circ.addCoord(0,1);

        System.out.println(quad.area());
        System.out.println(ret.area());
        System.out.println(tri.area());
        System.out.println(circ.area());

        try {
            circ.addCoord(tec.nextInt(), tec.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Erro");
        }

        tec.close();
    }
}
