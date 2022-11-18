package Heranca.ModificadoresDeAcesso.Desafio;


public class Jogador {
    int x, y, vida = 100;
    Jogador(){
        this(0,0);
    }
    Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }
    boolean atacar(Jogador opoten){
        int deltaX = Math.abs(x - opoten.x);
        int deltaY = Math.abs(y - opoten.y);

        if(deltaX == 0 && deltaY == 1){
            opoten.vida -= 10;
            return true;
        }else if(deltaY == 1 && deltaX == 0){
            opoten.vida -= 10;
            return true;
        }else{
            
            return false;
        }
    }

    boolean andar(Direcao direcao){
        switch(direcao){
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case  OESTE:
                x--;
                break;
        }
        return true;
    }
}
