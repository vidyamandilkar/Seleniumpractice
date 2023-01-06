package xpath;

public class mock {

	public static void main(String[] args)
	{
		int num=121;
		int result=0;
		int rem=0;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			result=result*10+rem;
			num=num/10;
		}
		System.out.println(result);
		if(result==temp)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}













