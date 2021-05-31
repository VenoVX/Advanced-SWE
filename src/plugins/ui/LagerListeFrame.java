package plugins.ui;

import javax.swing.*;
import java.awt.*;

public class LagerListeFrame extends JFrame {
    public LagerListeFrame(){
        this.setTitle("Lagerverwaltung");
        this.setSize(800, 800);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
