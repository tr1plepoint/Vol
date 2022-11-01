
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
public class List{

    Node head;
    Type tp;

    class  Node {
        int info;
        Node next;

        Node(int info) {
            this.info = info;
        }

        public Node() {
        }

        public Node(int info, Node next) {
            this.info = info;
            this.next = next;
        }
    }

    @Override
    public String toString() {
        return tp.toString(this);
    }

    public void setTp(Type tp) {
        this.tp = tp;
    }

    public void pop(List list) {
        tp.pop(list);
    }

    public int get(List list) {
        return tp.get(list);
    }

    public void push(List list, int info) {
        tp.push(list, info);
    }

}