package this_keyword;
class student88
{
	int rollno;
	float fees;
	student88(int rollno)
	{
		this.rollno=rollno;
	}
	student88(float fees)
	{
		this(40);
		this.fees=fees;
	}
	void disp()
	{
		System.out.println("rollno anf fees "+rollno+"and"+fees);
	}
}

public class constructorthis {

	public static void main(String[] args) 
	{
		student88 s1=new student88(66.3f);
		s1.disp();

	}

}
