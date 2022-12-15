package OperacoesPackage;
import java.util.Arrays;

public class Complexos extends Operacoes {
    private double inteira, real;
    public String toString(){
        if(getOp() == '+' || getOp() == '-' || getOp() == '*' || getOp() == '/'){
            operacao(getA(), getB(), getOp());
            return (inteira + "r" + real +"i");
        }
        return " ERROR ";
    }

    public Complexos(String a, String b, char op){
        setA(a);
        setB(b);
        setOp(op);
    }
    
    public Complexos(){
        this(" "," ",' ');
    }

    public double operacao(String a, String b, char op){
        String[] separada_complex_real_a;
        String[] separada_complex_real_b;
        String[] separadas_complex_img_a;
        String[] separadas_complex_img_b;
        String a_real, a_img, b_real, b_img;
        double adoub_int_complex, bdoub_int_complex, adoub_complex, bdoub_complex;

        //pega a parte real
        separada_complex_real_a = a.split("r");
        // System.out.println(Arrays.toString(separada_complex_real_a));

        separada_complex_real_b = b.split("r");
        // System.out.println(Arrays.toString(separada_complex_real_b));

        //pega imaginaria
        a_real = separada_complex_real_a[0];
        a_img = separada_complex_real_a[1];
        
        separadas_complex_img_a = a_img.split("i");
        a_img = separadas_complex_img_a[0];

        b_real = separada_complex_real_b[0];
        b_img = separada_complex_real_b[1];
        
        separadas_complex_img_b = b_img.split("i");
        b_img = separadas_complex_img_b[0];


        //convertendo strings

        adoub_int_complex = convertAdoub(a_real);
        bdoub_int_complex = convertAdoub(b_real);

        adoub_complex = convertAdoub(a_img);
        bdoub_complex = convertAdoub(b_img);

        if(op == '+'){
            inteira = adoub_int_complex + bdoub_int_complex;
            real = adoub_complex + bdoub_complex;
        }else if(op == '-'){
            inteira = adoub_int_complex - bdoub_int_complex;
            real = adoub_complex - bdoub_complex;
        }else if(op == '*' ){
            inteira = adoub_int_complex * bdoub_int_complex + ( adoub_complex * bdoub_complex)*(-1);
            real = adoub_int_complex * bdoub_complex +adoub_complex * bdoub_int_complex;
        }else if(op == '/'){
            inteira = ((adoub_int_complex * bdoub_int_complex) + (adoub_complex * bdoub_complex))/ (Math.pow(adoub_int_complex,2) + Math.pow(adoub_complex,2));
            real = ((adoub_complex * bdoub_int_complex) - (adoub_int_complex * bdoub_complex))/ (Math.pow(adoub_int_complex,2) + Math.pow(adoub_complex,2));
        }

        
        return 0;
    }

}
