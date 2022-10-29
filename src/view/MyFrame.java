/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Netbeans
 */
public class MyFrame extends JFrame{
    
    MyPanel myPanel;
    
    public MyFrame(MyPanel myPanel) {
        this.myPanel = myPanel;
        this.add(myPanel);
        this.setSize(500, 500);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
