import java.util.Scanner;

public class L1Q11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        float sqrt;

        System.out.println("Digite a qnt de casa decimais");
        n = teclado.nextInt();
        
        System.out.println("Digite a raiz a ser calc");
        sqrt = teclado.nextFloat();

        System.err.printf("Raiz qua de %.1f = %f", sqrt, Math.sqrt(sqrt));
        
        teclado.close();
    }
}
