package inheritance1;
 class A
{
	 A()
	 {
		 System.out.println("i am A con");
	 }
	 
	static int a=102;
	int b=202;
	
}
class B extends A
{
//	B()
//	 {
//		//by default super() constructor is there in every constructor
//		 System.out.println("i am B con");
//	 }
	static int x=101;
	int y=201;
	
}
class c extends B
{
	c()
	 {
		 System.out.println("i am c con");
	 }
	static int p=100;
	int q=200;
	
}
public class Inheritance1 {

	public static void main(String[] args)
	{
		c c1=new c();
		System.out.println("nonstatic ");
		System.out.println(c1.b);
		System.out.println(c1.y);
		System.out.println(c1.q);
		System.out.println("static ");
		System.out.println(c.a);
		System.out.println(c.x);
		System.out.println(c.p);
	}
}
