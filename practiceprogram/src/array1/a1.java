package array1;

public class a1
	{
		public static void main(String args[])
		{
		 int a[]= {10,20,30,40};
		 int sum=0;
		// int min=a[0];
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(a[2]); 
		 System.out.println(a[3]);
		 System.out.println(a.length);
		 a[1]=90;
		 System.out.println(a[1]); 
		 System.out.println("using for lop");
		 for (int x:a)
		 {
			 System.out.println(x);
		 }
		 System.out.println("addition of array element=");
		 for (int x:a)
		 {
			 sum=sum+x;
		 }
		 System.out.println("addition of array element="+sum);
		 System.out.println("mainimam from array");
		 int min=a[0];
		 for(int x:a)
		 {
			 if(min>x)
			 {
				 min=x;
			 }
			 
		 }
		 System.out.println("minimum of array="+min);
		 System.out.println("mainimam from array");
		 int max=a[0];
		 for(int x:a)
		 {
			 if(max<x)
			 {
				 max=x;
			 }
			 
		 }
		 System.out.println("minimum of array="+max);
		 System.out.println("accept character array");
		 String name[]= {"vidya","pallavi","sandhya","radha"};
		 for(String x:name)
		 {
			 System.out.println(x);
		 }
		 System.out.println("find sandhya name in array");
		 for(int i=0;i<name.length;i++)
		 {	
			 if(name[i]=="sandhya")
			 {
				 System.out.println(name[i]);
				 break;
			 }	
			 else
		 	{
			 System.out.println("sandhya not availabe");	 
		 	}
		 } 
		}
	}

	


