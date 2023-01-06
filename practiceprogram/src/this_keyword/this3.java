package this_keyword;
class A12
{
	A12()
	{
		this(5);
		System.out.println("hello not para");
	}
	A12(int x)
	{
		
		System.out.println(x);
	}
}
public class this3 {

	public static void main(String[] args) {
	A12 a1=new A12();
	System.out.println("*************");
	A12 a2=new A12(12);

	}

}
