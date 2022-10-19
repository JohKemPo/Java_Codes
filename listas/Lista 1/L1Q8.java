import java.util.Scanner;

public class L1Q8 {
    public static void main(String[] args) {
        int f_ant = 1, f_atu = 0, f = 0;
        int var;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite:");
        var = teclado.nextInt();

        for(int i = 0; i <= var; i++){
            System.out.printf("%d ",f_atu );
            f = f_ant + f_atu;
            f_ant = f_atu;
            f_atu = f;
        }
        
        teclado.close();
    }
}
