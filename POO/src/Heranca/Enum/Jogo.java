package Heranca.Enum;

public class Jogo {
    public static void main(String[] args) {
        Jogador j = new Heroi();// apartir de herança Heroi herda os atributos de Jogador
        j.x = 10;
        j.y = 10;

        Jogador j2 = new Monstro();
        j2.x = 10;
        j2.y = 11;

        System.out.println(j.vida);
        System.out.println(j2.vida);

        j.atacar(j2);
        j2.atacar(j);

        System.out.println(j.vida);
        System.out.println(j2.vida);
    }
}
