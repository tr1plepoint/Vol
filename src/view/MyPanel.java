/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.List;
import model.Queue;
import model.Stack;

/**
 *
 * @author Netbeans
 */
public class MyPanel extends JPanel implements Observer{
    
    List list;
    Controller controller;
    JButton button;
    JButton button1;
    JButton button2;
    JTextField text1;
    JTextField text2;

    public MyPanel(Controller c) {
        
        this.controller = c;
        button = new JButton("Add");
        button1 = new JButton("Stack");
        button2 = new JButton("Queue");
        text1 = new JTextField("TextField",15);
        text2 = new JTextField("TextField",15);
        
        this.add(button);
        this.add(button1);
        this.add(button2);
        this.add(text1);
        this.add(text2);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    list.push(list, Integer.parseInt(text1.getText()));
                    text2.setText(list.toString());
                }
                catch (NumberFormatException ex){
                    text2.setText("List is not initialized");
                }
            }

        });
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list = new Stack();  
            }

        });
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list = new Queue();  
            }

        });
        
    }

    @Override
    public void update(Observable o, Object arg) {
        
    }  
    
}
