package Interface;

import java.util.Scanner;
import java.util.concurrent.Flow;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.undo.StateEditable;
import java.awt.*;
import java.awt.event.*;

public class Interface extends Calcula{

    public Interface(){
        JFrame tela= new JFrame("Calculadora");
    
        tela.setSize(640,600);
        tela.setResizable(false);
        
        JPanel robervalt = new JPanel();
        robervalt.setBackground(Color.white);

        JTextField input = new JTextField( 40);
        JTextField results = new JTextField(40);


        // Acao de leitura e input na interface
        class ClickNum implements ActionListener{
            public void actionPerformed(ActionEvent e){
                if (e.getActionCommand() == "_")
                    input.setText(input.getText() + " ");
                else if (e.getActionCommand() == "C")
                    input.setText("");
                else
                    input.setText(input.getText() + e.getActionCommand());
            
                if(e.getActionCommand() == "ENTER"){
                    results.setText(results.getText() + input.getText());
                    input.setText(Calc(input.getText()));
                    results.setText(results.getText() + " = " + input.getText());
                }
            }
        }

        JLabel pulaLinha[] = new JLabel[100];
        for (int i=0; i<100;i++){
            pulaLinha[i] = new JLabel("                                                                                                                                 ");
        }


        JButton zero = new JButton ("0");
        JButton um = new JButton ("1");
        JButton dois = new JButton ("2");
        JButton tres = new JButton ("3");
        JButton quatro = new JButton ("4");
        JButton cinco = new JButton ("5");
        JButton seis = new JButton ("6");
        JButton sete = new JButton ("7");
        JButton oito = new JButton ("8");
        JButton nove = new JButton ("9");
        JButton mais = new JButton ("+");
        JButton menos = new JButton ("-");
        JButton mult = new JButton ("*");
        JButton div = new JButton ("/");
        JButton complex = new JButton ("i");
        JButton espaco = new JButton ("_");
        JButton exec = new JButton ("ENTER");
        

        zero.addActionListener(new ClickNum());
        um.addActionListener(new ClickNum());
        dois.addActionListener(new ClickNum());
        tres.addActionListener(new ClickNum());
        quatro.addActionListener(new ClickNum());
        cinco.addActionListener(new ClickNum());
        seis.addActionListener(new ClickNum());
        sete.addActionListener(new ClickNum());
        oito.addActionListener(new ClickNum());
        nove.addActionListener(new ClickNum());
        mais.addActionListener(new ClickNum());
        menos.addActionListener(new ClickNum());
        mult.addActionListener(new ClickNum());
        div.addActionListener(new ClickNum());
        complex.addActionListener(new ClickNum());
        espaco.addActionListener(new ClickNum());
        exec.addActionListener(new ClickNum());

        robervalt.setLayout(new FlowLayout());

        robervalt.add(pulaLinha[0]);
        robervalt.add(input);
        robervalt.add(pulaLinha[1]);
        robervalt.add(results);
        robervalt.add(pulaLinha[2]);
        robervalt.add(sete);
        robervalt.add(oito);
        robervalt.add(nove);
        robervalt.add(div);
        robervalt.add(pulaLinha[3]);
        robervalt.add(quatro);
        robervalt.add(cinco);
        robervalt.add(seis);
        robervalt.add(mult);
        robervalt.add(pulaLinha[4]);
        robervalt.add(um);
        robervalt.add(dois);
        robervalt.add(tres);
        robervalt.add(menos);
        robervalt.add(pulaLinha[5]);
        robervalt.add(zero);
        robervalt.add(mais);
        robervalt.add(exec);
        robervalt.add(espaco);

        tela.getContentPane().add(robervalt);
        tela.setVisible(true);
    }
}

