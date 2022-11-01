
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
public class Queue extends List implements Type{

    @Override
    public void push(List list, int info) {
        Node h = new Node(info, null);
        if (list.head == null)
            list.head = h;
        else {
            Node help;
            for (help = list.head; help.next != null; help = help.next);
            help.next = h;
        }
    }

    @Override
    public void pop(List list) {
        if (head != null) {
            head = head.next;
        }
    }

    @Override
    public int get(List list) {
        if (head != null)
            return head.info;
        return 0;
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