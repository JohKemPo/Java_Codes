import java.util.Scanner;

public class L1Q3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;

        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();
        distancia = Math.sqrt(Math.pow((float)(x2-x1), 2) + Math.pow((float)(y2-y1), 2));
        System.out.println("A distância é: " + distancia);
        teclado.close();
    }
}