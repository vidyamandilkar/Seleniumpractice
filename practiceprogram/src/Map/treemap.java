package Map;

import java.util.*;
import java.util.TreeMap;

public class treemap {

	//private static String getKey;
	//private static String getValue;

	public static void main(String[] args)
	{
		TreeMap<Integer,String> m1=new TreeMap<Integer,String>();
		m1.put(1,"s1");
		m1.put(4,"s4");
		m1.put(3,"s3");
		m1.put(2,"s2");
		m1.put(5,"s7");
		m1.put(2,"s10");//it replace 2 as 10
		m1.replace(4, "vidya");
		System.out.println("showows in sorted format Map 1"+m1);
		System.out.println("create second map");
		TreeMap<Integer,String> m2=new TreeMap<Integer,String>();
		m2.put(6,"s6");
		m2.put(7,"s7");
		m2.put(8,"s8");
		m2.put(9,"s9");
		System.out.println("showows in sorted format map2"+m2);
		//System.out.println("marge m1 and m2"+m1.merge(4, "vidya", "ee"));
		System.out.println("entery set method"+m1.entrySet());
		System.out.println(" size="+m1.size());//+" "+m.getValue()
		System.out.println("using Entey set");
		System.out.println(" Contains key="+m1.containsKey(2));
		System.out.println(" Contains value="+m1.containsValue("s7"));;
		System.out.println("clone"+m1.clone());
		
		for(Map.Entry m:m1.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
		//System.out.println("entry set"+m1.entrySet());
		

	}

}
