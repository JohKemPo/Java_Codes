package Heranca.Enum;

public class Heroi extends Jogador {
    boolean atacar(Jogador opoten){ // SObreescreve os atributos da classe pai
        int deltaX = Math.abs(x - opoten.x);
        int deltaY = Math.abs(y - opoten.y);

        if(deltaX == 0 && deltaY == 1){
            opoten.vida -= 20;
            return true;
        }else if(deltaY == 1 && deltaX == 0){
            opoten.vida -= 20;
            return true;
        }else{
            
            return false;
        }
    }
}
