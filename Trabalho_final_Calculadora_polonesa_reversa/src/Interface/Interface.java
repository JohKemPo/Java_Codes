package Interface;

import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;

public class Interface {
    public Interface(){
        JFrame frame = new JFrame("Calculadora");
        frame.setResizable(false);
        frame.setLocation(600,200);
        frame.setSize(1280,720);

        JPanel painel = new JPanel();
        painel.setBackground(Color.white);

        frame.setVisible(true);
    }
}
