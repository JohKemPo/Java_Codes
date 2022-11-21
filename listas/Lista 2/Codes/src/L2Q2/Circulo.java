package L2Q2;

public class Circulo extends Forma{
    
    public double area(){

        return Math.pow(Math.pow((getArrayX(1) - getArrayX(0)), 2) + 
                Math.pow((getArrayY(1) - getArrayY(0)), 2),1/2f) * 3.14;
    }
}
