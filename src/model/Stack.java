
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author Netbeans
 */
public class Stack extends List{

    @Override
    public void pop() {
        Node help;
        for(help = head; help.next.next != null; help = help.next);
        help.next = null;

    }

    @Override
    public int get() {
        if (head != null) {
            Node h;
            for(h = head; h.next != null; h = h.next);
            return h.info;
        }
        else{
            return 0;
        }
    }

}