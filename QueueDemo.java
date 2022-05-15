
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args)
	{
		
	  Queue<String> str_queue = new LinkedList<>();
	    //initialize the queue with values
	    str_queue.add("one");
	    str_queue.add("two");
	    str_queue.add("three");
	    str_queue.add("four");
	    //print the Queue
	    System.out.println("The Queue contents:" + str_queue);
	    System.out.println("now print the Queue of Integer Type:");
	    Queue<Integer> queue=new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
	System.out.println(queue);
	System.out.println("now delete the elements using remove:");
	queue.remove();
	System.out.println(queue);
	System.out.println("now read the front elements using peek:");
	//queue.peek();
	System.out.println(queue.peek());
	System.out.println(queue);
	System.out.println("now delete and return the front elements using poll:");
	//queue.peek();
	System.out.println(queue.poll());
	System.out.println(queue);
	
	
	}

}
