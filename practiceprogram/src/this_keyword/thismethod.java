package this_keyword;
class A
{
	void m()
	{
		System.out.println("mhello i am m");
	}
	void n()
	{
		this.m();
		System.out.println("hello i am n");
	
	}
}
public class thismethod {

	public static void main(String[] args) {
		A a1=new A();
		a1.n();
	}

}
