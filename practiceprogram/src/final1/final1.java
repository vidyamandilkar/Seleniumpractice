package final1;

public class final1 
{
	static {
		System.out.println("ststic1");
	}
	{
		System.out.println("nonstatic block");
		
	}
	final int A;
	final1(int q)
	{
		A=q;
	}
	

	public static void main(String[] args) 
	{
		final1 f=new final1(20);
		final1 f1=new final1(40);
		System.out.println(f.A);
		System.out.println(f1.A);
		

	}

}
