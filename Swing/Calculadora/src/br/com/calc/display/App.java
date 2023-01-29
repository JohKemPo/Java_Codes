package br.com.calc.display;
import javax.swing.JFrame;

import Interface.Calcula;

import javax.swing.JFrame;


public class App extends JFrame{
    public App(){
        
        setSize(332,422);// tamanho da tela
        setDefaultCloseOperation(EXIT_ON_CLOSE);// fecha o programa quando janela é fechada
        setLocationRelativeTo(null);// inicia janela no centro
        setVisible(true);// visibilidade inicial da janela, msm q vazia ela é visiv.
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
