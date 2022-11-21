package L2Q2;

import java.util.ArrayList;

public abstract class Forma extends Pontos{
    ArrayList<Pontos> coordenadas = new ArrayList<>();

    public void addCoord(int x, int y){
        Pontos novo = new Pontos();
        novo.setX(x);
        novo.setY(y);
        coordenadas.add(novo);
    }
    
    int getArrayX(int i){
        return coordenadas.get(i).getX();
    }
    int getArrayY(int i){
        return coordenadas.get(i).getY();
    }
    public abstract double area();
}
