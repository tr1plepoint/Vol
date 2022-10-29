
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.List;
import model.Queue;
import model.Stack;
import view.MyFrame;
import view.MyPanel;



/**
 *
 * @author ddromanov
 */
public class Controller {

    MyPanel myPanel;
    MyFrame frame;

    public Controller() {
        myPanel = new MyPanel(this);
        frame = new MyFrame(myPanel);   
    }

}