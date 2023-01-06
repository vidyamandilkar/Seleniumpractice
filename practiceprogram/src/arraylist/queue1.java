package arraylist;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//import javax.jws.soap.SOAPBinding;

public class queue1 {

	public static void main(String[] args) 
	{
	// creating generic queue
		Queue<String> q= new PriorityQueue<String>();
		q.add("vidya");
		q.add("vishal");
		q.add("Nisha");
		q.add("mainal");
		System.out.println("elements of que="+q);//tostring -values
		System.out.println("size of que="+q.size());
		
		System.out.println("Add ccc=");
		q.add("ccc");
		System.out.println("elements of que="+q);
		System.out.println("Add DDD");
		q.add("DDD");
		System.out.println("elements of que="+q);
		System.out.println("remove DDD");
		q.remove("DDD");
		System.out.println("elements of que="+q);
		System.out.println("remove vishal");
		q.remove("vishal");
		System.out.println("elements of que="+q);
		
		System.out.println("using iterator");
		Iterator i=q.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("head element of que="+q.peek());//head element
		System.out.println("elements of que="+q);
		System.out.println("remove head element of que="+q.poll());
		System.out.println("elements of que="+q);
		
		System.out.println("creating new quqe");
		Queue q2=new PriorityQueue();
		q2.add(10);
		q2.add(5);
		q2.add(20);
		q2.add(2);
		q2.add(40);
		q2.add(null);
		System.out.println(q2);
		Iterator r=q2.iterator();
		while(r.hasNext())
		{
			System.out.println(r.next());
			
		}
		
		System.out.println("remove 20");
		q2.poll();
		System.out.println("elements of que="+q2);
		System.out.println("remove 10 using pool");
		//q.remove("DDD");
		System.out.println("elements of que="+q2.poll());
		System.out.println("elements of que="+q2);
		System.out.println("elements of que="+q2.poll());
		System.out.println("elements of que="+q2);
		System.out.println("queue elements 2"+q2.element());

	}

}
