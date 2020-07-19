/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Dream Tech
 */
public class Node<T> {
    T value;
    Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
    
    
}
