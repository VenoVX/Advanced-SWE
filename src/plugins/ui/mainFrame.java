package plugins.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame extends JFrame {
    public mainFrame(){
        this.setTitle("Lagerverwaltung");
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());
        this.setUi();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void setUi(){
        JButton schraubendreherb = new JButton("Schraubendreher");
        schraubendreherb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton bohrmaschineb = new JButton("Bohrmaschine");
        JButton hammerb = new JButton("Hammer");
        JButton holzschraubeb = new JButton("Holzschraube");
        JButton metallschraubeb = new JButton("Metallschraube");
        JButton mutterb = new JButton("Mutter");
        JButton reinigungsmittelb = new JButton("Reinigungsmittel");
        JButton treibstoffb = new JButton("Treibstoff");
        this.add(schraubendreherb);
        this.add(bohrmaschineb);
        this.add(hammerb);
        this.add(holzschraubeb);
        this.add(metallschraubeb);
        this.add(mutterb);
        this.add(reinigungsmittelb);
        this.add(treibstoffb);



    }
}
