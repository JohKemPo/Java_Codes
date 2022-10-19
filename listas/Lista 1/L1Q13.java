import java.util.Random;

public class L1Q13 {
    public static void main(String[] args) {
        
        Random gerador = new Random();
        int aux, n = 10;
        int v[] = new int[n];

        for(int i = 0; i < n; i++){
            v[i] = gerador.nextInt(n);
            System.out.printf("%d ", v[i]);
        }
        

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(v[i] < v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        System.out.println("\n");
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", v[i]);
        }
    }
}
