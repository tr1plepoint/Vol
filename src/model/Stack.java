
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
public class Stack extends List implements Type{

    @Override
    public void pop(List list) {
        Node help;
        for(help = head; help.next.next != null; help = help.next);
        help.next = null;

    }

    @Override
    public int get(List list) {
        if (head != null) {
            Node h;
            for(h = head; h.next != null; h = h.next);
            return h.info;
        }
        else{
            return 0;
        }
    }

    @Override
    public void push(List list, int info) {
        Node h = new Node(info, null);
        h.next = list.head;
        list.head = h;
    }

    @Override
    public String toString(List list) {
        String res = this.getClass().getSimpleName() + ": ";;
        for(List.Node h = list.head; h != null; h = h.next){
            res += h.info + "->";
        }
        return res;

    }
}