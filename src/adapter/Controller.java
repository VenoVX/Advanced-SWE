package adapter;

import plugins.ui.mainFrame;

import javax.swing.*;

public class Controller {
    private JFrame mainFrame;
    public Controller(){
        loadUI();
    }
    public void loadUI(){
        this.mainFrame = new mainFrame();

    }

}
