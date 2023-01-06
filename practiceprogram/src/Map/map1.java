package Map;

import java.util.HashMap;
import java.util.Map;

public class map1 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "vidya");
		h.put(2, "rani");
		h.put(3,"priya");
		System.out.println(h.keySet());
		System.out.println("val"+h.values());
		for(Map.Entry m:h.entrySet())
				{
			System.out.println(m.getKey()+""+m.getValue());
				}
		System.out.println(h);
		System.err.println("clone of h"+h.clone());
	
		System.out.println("******is absent***********");
		System.out.println("is absent radha then put it at 5th index="+h.putIfAbsent(5, "radha"));
		System.out.println("is absent rani="+h.putIfAbsent(2,"rani"));
	    System.out.println(h);
	    System.out.println("contaains="+h.containsValue("vidya"));
	    System.out.println("contaains sonu="+h.containsValue("sonu"));
	    System.out.println("contaains with vidya="+h.containsValue("vidya"));
	    System.out.println(" h isEmpty="+h.isEmpty());
	    System.out.println("contains key with 3=="+h.containsKey(3));
	    System.out.println("hash set codeof h"+h.hashCode());
	    System.out.println("to string method "+h.toString());
	    HashMap<String,Integer> h1=new HashMap<String,Integer>();
	    h1.put("a1",5);
	    System.out.println(h1);
	    h1.put("a2",6);
	    h1.put("a3",5);
	    System.out.println(h1);
	    System.out.println("****************3 rs hashmap***********");
	    HashMap<String,Integer> h2=new HashMap<String,Integer>();
	    h2.put("s1",10);
	    h2.put("s2",46);
	    h2.put("s3",90);
	    System.out.println(h2);
	    System.out.println("after replave with old value with new ");
	    h2.replace("s3", 90, 140);
	    h1.putAll(h2);
	    System.out.println(h1);
	    System.out.println("get values og h2"+h2.remove("s2",46));
	    System.out.println("after deleting 46"+h2);
	    h1.putAll(h2);
	    h2.containsValue(h2);
	    System.out.println("containsvalue "+h2.containsValue(140));
	    
	    	    

		
		

	}

}
