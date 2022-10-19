import java.util.Scanner;

public class L1Q17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        String[] l = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] nuns = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        

        do{
            System.out.println("Digite um número de até 3 digitos: ");
            n = teclado.nextInt();
            int i = 0;

            while(n>0){
                if(n >= nuns[i]){
                    System.out.printf("%s",l[i]);
                    n -= nuns[i];
                } else{
                    i++;
                }
            }
            System.out.println("\n");
        }while(n > 0 && n <= 1000);
        
        teclado.close();
    }
}
