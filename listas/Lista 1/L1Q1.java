import java.util.Scanner;
/*
Determine as raízes de uma equação de 2o grau: ax2 + bx + c = 0 (recordar que o
discriminante Δ = b2 – 4ac, e que a raiz r = (–b ± √Δ)/2a).
*/
public class L1Q1 {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        float delta, r1, r2;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o A:");
        a = input.nextInt();
        System.out.println("Digite o B:");
        b = input.nextInt();
        System.out.println("Digite o C:");
        c = input.nextInt();
        
        delta = (int)Math.pow(b,2) -4*a*c;
        System.out.println(delta);
        
        if(delta < 0){
            System.out.println("Sem raizes reais");
        }else if(delta > 0){
            r1 = (float)(-b + Math.sqrt(delta))/2*a;
            r2 = (float)(-b - Math.sqrt(delta))/2*a;
            System.out.println("Duas raizes reaais r1 = " + r1 + "r2 = " + r2);

        }else{
            r1 = (float)(-b + Math.sqrt(delta))/2*a;
            r1 = (float)(-b - Math.sqrt(delta))/2*a;
            System.out.println("Somente uma raiz real = " + r1);
        }

        input.close();

    }
}
