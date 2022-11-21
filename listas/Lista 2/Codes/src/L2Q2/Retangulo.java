package L2Q2;

public class Retangulo extends Forma {
    /*
     *  0 - ( 0 , 0)
     *  1 - ( 1 , 1)
     */
    public double area(){

        return (getArrayX(1) - getArrayX(0)) * (getArrayY(1) - getArrayY(0));
    }
    
}
