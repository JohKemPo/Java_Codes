package L2Q2;

public class Triangulo extends Forma {
    

    public double area(){

        return (getArrayX(1) - getArrayX(0)) * (getArrayY(1) - getArrayY(0)) / 2f;
    }
}
