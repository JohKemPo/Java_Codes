package Main.Console;

public class Complexos extends Operacao {
    //Z = X + YI
    
    /*
     * i = √-1
     * i² = -1
     * 
     * OPERA
     * 
     * 
     * SOMA
     * (a + bi) + (c + di)
     * (a + c) + i(b + d)
     * 
     * SUB
     * (a + bi) + (c + di)
     * (a + c) + i(b + d)
     * 
     * Multiplicação
       Usamos a propriedade distributiva:

       (a + bi) . (c + di) = ac + adi + bci + bdi2 (lembre que i2 = –1)
       (a + bi) . (c + di) = ac + adi + bci – bd

       Juntando as partes reais e imaginárias:
       (a + bi) . (c + di) = (ac – bd) + i (ad + bc)

        DIVISÃO
        Z1/Z2 = Z3
        Z1 = Z2 . Z3

        Na igualdade acima, se Z3 = x + yi, temos:

        Z1 = Z2 . Z3

        a + bi = (c + di) . (x + yi)
        a + bi = (cx – dy) + i (cy + dx)

        Pelo sistema das incógnitas x e y temos:

        cx – dy = a
        dx + cy = b

        Logo,

        x = ac + bd/c2 + d2
        y = bc – ad/c2 + d2                                                                                                                                 
     */

    //convert(getA(),getB());
    public double operacao(String a, String b){
        double ad = Double.valueOf(getA()).doubleValue();
        double bd = Double.valueOf(getB()).doubleValue();
        return ad + bd;
    }

    public String toString() {
		return "Resultado da operação: " + (operacao(getA(), getB()));
	}
}
