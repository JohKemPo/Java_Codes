import java.util.Scanner;

public class L1Q18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        String[] l = {"Duzentos","Cem","Noventa","Oitenta","Setenta","Sessenta","Cinquenta","Quarenta","Trinta","Vinte","Dez","Nove","Oito","Sete","Seis","Cinco","Quatro","Três","Dois","Um"};
        int[] nuns = { 200, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //"Bilhão","Milhões","Milhão","Mil","Cem","Duzentos","Trezentos","Quatrocentos","Quinhentos","Seiscentos","Oitocentos","Setecentos","Novecentos",
        //1000000000, 1000000, 1000

        do{
            System.out.println("Digite um número de até 3 digitos: ");
            n = teclado.nextInt();
            int i = 0;

            while(n>0){
                if(n >= nuns[i] && n <= 100){
                    System.out.printf("%s ",l[i]);
                    n -= nuns[i];
                } else if(n >= 100){
                    System.out.printf("%s ",l[i]);
                    n -= nuns[i];
                }else{
                    i++;
                }
            }
            System.out.println("\n");
        }while(n != -1);
        
        teclado.close();
    }
}