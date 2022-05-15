package linkedList;


class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
			next=null;
		}
	}
	public void show()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.head=new Node(1);
		Node second=new Node(0);
		Node third=new Node(5);
		list.head.next=second;
		second.next=third;
		list.show();

	}

}
