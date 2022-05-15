package nodebaseproblem;

//Linked list implementation in Java

class LinkedList {
// Creating a node
Node head;

static class Node {
 int value;
 Node next;

 Node(int d) {
   value = d;
   next = null;
 }
}

public static void main(String[] args) {
 LinkedList linkedList = new LinkedList();

 // Assign value values
 linkedList.head = new Node(1);
 Node second = new Node(2);
 Node third = new Node(3);
 Node third1 = new Node(4);
 Node third2 = new Node(5);
 Node third3= new Node(6);
 Node third4= new Node(0);


 // Connect nodess
 linkedList.head.next = second;
 second.next = third;
 third.next=third1;
 third1.next=third2;
 third2.next=third3;
 third3.next=third4;
//third4.next=null;

 // printing node-value
 while (linkedList.head != null) {
   System.out.print(linkedList.head.value + " ");
   linkedList.head = linkedList.head.next;
 }
}
}
