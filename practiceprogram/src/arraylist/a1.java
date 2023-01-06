package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a1 {

	public static void main(String[] args) {
		ArrayList  ls1=new ArrayList();
		//or
		//List ls1=new ArrayList();
		ls1.add("vidya");
		ls1.add(123);
		ls1.add('c');
		ls1.add(new a1());
		ls1.add(1, "pune");
		ls1.add("");
		ls1.add("aaa");
		System.out.println("elements of array"+ls1);//tostring method override
		ls1.add(1, "pune");
		System.out.println("elements of array"+ls1);
		ls1.add(2,4533);
		
		System.out.println("elements of array"+ls1);
		System.out.println("element of 1 st index"+ls1.get(2));
		System.out.println("sizeol list"+ls1.size());
		System.out.println("*****using foreach**** ");
		for(Object obj:ls1)
		{
			System.out.println(obj);
		}
		//System.out.println("********count*******"+ls1.);
		
		System.out.println();
		System.out.println("new array list pf fruts");
		ArrayList l1=new ArrayList();
		//ArrayList l2=new ArrayList(1000);
		//ArrayList l2=new ArrayList(collnectio c);
		l1.add("Apple");
		l1.add("Grapes");
		l1.add("Banana");
		l1.add("chikku");
		l1.add("jackfruir");
		
		System.out.println("fruit list element="+l1);
		System.out.println("print one by one element");
		for(Object s:l1)
		{
			System.out.println(s);
		}
		l1.set(1, "dates");
		System.out.println("after adding Dates");
		for(Object s:l1)
		{
			System.out.println(s);
		}
		Collections.sort(l1);
		System.out.println("after sorting");
		for(Object s:l1)
		{
			System.out.println(s);
		}
		//for each loop(lamda exprssion
		ls1.forEach(a->
		{
			System.out.println(a);
		});
		System.out.println("***********comparring two Stirngls1 and 1l*********");
		System.out.println(ls1.equals(l1));
		System.out.println(ls1.equals(l1));
		
		System.out.println(l1);
		System.out.println("size"+l1.size());
		l1.remove(2);
		System.out.println("size"+l1.size());
	}
	

}
