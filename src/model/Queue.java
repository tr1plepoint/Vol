
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
public class Queue extends List{
    @Override
    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    @Override
    public int get() {
        if (head != null)
            return head.info;
        return 0;
    }
}