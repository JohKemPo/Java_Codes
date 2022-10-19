import java.util.Scanner;

class L1Q17_2 {
    public static int leia(Scanner teclado){
        System.out.println("\nDigite um numero: ");
        int n = teclado.nextInt();
        
        return n;
    }

    public static void trad(int info, Scanner teclado){
        int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        while(info >= 0 && info <= 3999){
            if (info == 0) return;
            System.out.printf("%d ", info);
            int i = 0;
            while (info > 0) {
                if (info >= vaNum[i]) {
                    System.out.print(vaRom[i]);
                    info -= vaNum[i];
                } else {
                    i++;
                }
            }
            trad(leia(teclado), teclado);
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        trad(leia(teclado), teclado);
        
        teclado.close();
    }
}
