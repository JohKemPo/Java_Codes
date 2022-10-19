import java.util.Random;

public class L1Q14 {
    public static void ordena(int[] v,int n){
        int aux = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                if(v[i] <= v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        Random gerador = new Random();
        int aux = 0, n = 5;
        int v[] = new int[n];
        int r[] = new int[n];
        int s[] = new int[2*n];
        
        for(int i = 0; i < n; i++){
            v[i] = gerador.nextInt(n);
            r[i] = gerador.nextInt(n);
       }
       ordena(v,n);
       ordena(r,n);

        
        for(int i = 0; i < n*2; i++){
            for(int j = 0; j < n; j++){
                if(v[j] < r[j]){
                    aux = v[j]; 
                }                
                s[i] = aux;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", v[i]);
        }
        System.out.println("\n");
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", r[i]);
        }
        System.out.println("\n");
        for(int i = 0; i < n*2; i++){
            System.out.printf("%d ", s[i]);
        }
    }
}
