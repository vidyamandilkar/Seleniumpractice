package SELFINVENTION;

 class BASIC1 
{	//final variable  
	 final static int rollno;
	 final int mobile;
	 final double pincode;
	 BASIC1(double a)
	 {
		 pincode=a;
	 }
	 static
	 {
		 rollno=10;
	 }
	 {
		 mobile=565655;
	 }
	 //constructor overloading
	 BASIC1()
	 {
	 System.out.println("hi am in const");
	 }
	 BASIC1(int a)
	 {
		 this();
		 
	 System.out.println("hi am in 1st parametrise const");
	 }
	 BASIC1(int a,int b)
	 {
		 this(10);
	 System.out.println("hi am in 2nd parametrise const");
	 }
	 BASIC1(int a,int b,int c)
	 {
		 this(10,20);
	 System.out.println("hi am in 3nd parametrise const");
	 }
	 
	 //***************************************
	static int age=20;
	double salary=3000.5;
	 static int add(int a,int b)
	{
		int res=a+b;
		return res;
	}
	 public   int sub(int a,int b)
	{
			int res=a-b;
			return res;
	}
	 public  double sub(float a,int b)
		{
			 double res=a-b;
			return res;
		}
	 public  double sub(float a,int b,int c)
		{
			 double res=a*b-c;
			return res;
		}
	 
	public static void main(String[] args) 
	{
		String s1="vidya";
		System.out.println("age="+age);
		
		BASIC1 B1=new BASIC1(10,20,30);
		//BASIC1 B2=new BASIC1();
		System.out.println("salary="+B1.salary);
		System.out.println("name="+s1);
		System.out.println("addition="+add(10,50));
		System.out.println("substraction="+B1.sub(50,10));
		System.out.println("substraction ofdecimal="+B1.sub(50.55f,10));
		System.out.println("all function="+B1.sub(50.55f,10,5));
		System.out.println("final ststic rollno="+rollno);
		System.out.println("final nonstatic mobile="+B1.mobile);

	}

}
