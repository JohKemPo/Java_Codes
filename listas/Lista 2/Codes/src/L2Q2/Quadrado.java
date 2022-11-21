package L2Q2;

public class Quadrado extends Forma{
    /*
     * A = l² 
     * diag² / 2 = l²
     */

    public double area(){
        return (Math.pow((getArrayX(1) - getArrayX(0)), 2) + 
                Math.pow((getArrayY(1) - getArrayY(0)), 2)) / 2;
    }
}
