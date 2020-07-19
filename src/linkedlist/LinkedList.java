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
public class LinkedList {
//this node is head >>first item in linked list
   Node head;

    
   
   public LinkedList(Node head){
       this.head=head;
   }
   //add new node to list in first linkedlist
   public void add(Node newNode){
       newNode.next=head;//the new node will pointer in old node(head-first)
       head=newNode;
   }
   
   //delete the head only
   public void delete(){
       head=head.next;//the start will pointer to next node
   }
   //display all linked node
   public void display(){
       Node n=head; //start with first node
       while(n !=null){
           System.out.println(n.value);
           n=n.next;
                 
       }
   }
   
   
   
   
   
       
    
}
