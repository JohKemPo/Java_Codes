import java.util.Scanner;

public class L1Q6 {
    public static void main(String[] args) {
        String num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o número: ");

        num = teclado.nextLine();

        System.out.println(num.length());
        teclado.close();
    }
}