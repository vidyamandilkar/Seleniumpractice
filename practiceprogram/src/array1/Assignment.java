package array1;

public class Assignment {

	public static void main(String[] args) 
	{
		int ctr=0;
	int a[]= {4,5,3,1};
	int b[];
	b=a;
	System.out.println("copy element of one array into second");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(b[i]);
	}
	System.out.println("frequency of each element in array");
	for(int i=0;i<b.length;i++)
	{
		for(int j=1;j<b.length;j++)
		{
			if(b[i]==b[j])
			{
			ctr++;
			}
			
		}
		System.out.println(ctr);
	}
	System.out.println("decending order");
	int temp=0;
	for(int i=0;i<b.length-1;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]>b[j])
			{
				temp=b[j];
				b[j]=b[i];
				b[i]=temp;
			}
		}
	}//int a[]= {1,5,3,8};
	System.out.println("Assending order sorted array");
	for(int i=0;i<b.length;i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println("Dcending order");
	int temp1=0;
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]<b[j])
			{
				temp1=b[j];
				b[j]=b[i];
				b[i]=temp1;
			}
		}
	}
	System.out.println("sorted array");
	for(int i=0;i<b.length;i++)
	{
		System.out.println(a[i]);
	}
	
	
}

}
