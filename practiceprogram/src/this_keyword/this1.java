package this_keyword;

public class this1
{int rn=50;
int age=90;

float a;
float b;
this1(int rn,int age)
{
	System.out.println("local="+rn);
	System.out.println("local="+age);
	//this.rn=rn;
	//this.age=age;
	System.out.println("glocal="+this.rn);
	System.out.println("glocal="+this.age);
}
this1(float a,float b)
{
	System.out.println("local="+rn);
	System.out.println("local="+age);
	//this.rn=rn;
	//this.age=age;
	System.out.println("glocal="+this.rn);
	System.out.println("glocal="+this.age);
}
void disp()
{
	System.out.println("i am in disp method"+rn+""+age);
}
	public static void main(String[] args)
	{
		this1 t1=new this1(10,50);
		t1.disp();

	}

}
