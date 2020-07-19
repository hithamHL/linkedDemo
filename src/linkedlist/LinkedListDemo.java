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
public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        LinkedList linkedListdList=new LinkedList(new Node<String>("hitham",null));
        
        linkedListdList.add(new Node<String>("mohammed",null));
         linkedListdList.add(new Node<String>("AAA",null));
          linkedListdList.add(new Node<String>("sss",null));
          linkedListdList.display();
          System.out.println("after delete");
          
          linkedListdList.delete();
          linkedListdList.display();
        
        
    }
    
    
}
