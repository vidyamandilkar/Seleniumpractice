package arraylist;

import java.util.Vector;

public class vector1
{

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add(12);
		v.add("vidya");
		v.add(new vector1());
		v.add(12);
		v.add("vidya");
		v.add(new vector1());
		v.add(12);
		v.add("vidya");
		v.add(new vector1());
		v.add("vidya");
		v.add("vidya");
		
		System.out.println(v);
		System.out.println("vector capacity="+v.capacity());
		System.out.println("vector size="+v.size());
		
		v.add("sasa");
		System.out.println(v);
		v.addElement("priya");
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		System.out.println("second vecor v2");
		Vector v2=new Vector();
		v2.add("rani");
		v2.add("pani");
		v2.add("billi");
		System.out.println(v2);
		v.addAll(v2);
		System.out.println(v);
		v.add(2, "suraj");
		System.out.println(v);
		System.out.println("generic vector");
		Vector<Integer> v3= new Vector<Integer>();
		v3.add(5);
		v3.add(6);
		v3.add(88);
		v3.add(44);
		System.out.println(v3);
		v2.addAll(v3);
		
		System.out.println(v2);
		System.out.println("Capacity of v3="+v3.capacity());
		System.out.println("size of v3="+v3.size());
		v3.remove(2);
		System.out.println(v2);
		System.out.println("Capacity of v3="+v3.capacity());
		System.out.println("size of v3="+v3.size());
		
		
		
		

	}

}
