package L2Q2;

public class Pontos {
    private int x;
    private int y;

    Pontos(){
        this(0,0);
    }

    Pontos(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
