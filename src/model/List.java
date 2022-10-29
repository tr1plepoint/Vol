
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
public abstract  class List {

    Node head;

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

    public abstract void pop();
    public abstract int get();

    public  void push(List list, int n) {
        Node h = new Node(n, null);
        if (list.head == null)
            list.head = h;
        else {
            Node help;
            for (help = list.head; help.next != null; help = help.next);
            help.next = h;
        }

    }
    
    
    @Override
    public String toString() {
        String res = this.getClass().getSimpleName() + ": ";;
        for(Node h = head; h != null; h = h.next){
            res += h.info + "->";
        }
        return res;
    }

}