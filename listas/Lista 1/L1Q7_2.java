import java.util.Scanner;
public class L1Q7_2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int codigo;
        System.out.println("Informe o código: ");
        codigo = teclado.nextInt();

        while (codigo != -1) {
            System.out.println("Código: " + codigo);
            System.out.println("Informe o código: ");
            codigo = teclado.nextInt();
        }
    teclado.close();
    }
}
