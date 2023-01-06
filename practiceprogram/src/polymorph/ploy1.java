package polymorph;
 class ploygoan
{
	public void draw()
	{
		System.out.println("polygoan");
	}
	public void size1()
	{
		System.out.println("polygoan size");
	}
}
 class circle extends ploygoan
{
	public void draw()
	{
		System.out.println("circle");
	}
}
class sequre
{
	public void draw()
	{
		System.out.println("sequre");
	}
}
public class ploy1 
{

	public static void main(String[] args)
	{
		System.out.println("simple pymorphism");
		circle c=new circle();
		c.draw();
		sequre s=new sequre();
		s.draw();
		ploygoan p=new ploygoan();
		p.draw();
		System.out.println("method ovveriden pymorphism");
		ploygoan p1= new circle();
		p1.draw();
	
		
		
	}

}
