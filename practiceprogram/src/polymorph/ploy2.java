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
		class sequre extends circle
		{
			public void draw()
			{
				System.out.println("sequre");
			}
		}
		public class ploy2 {

			public static void main(String[] args) 
			{
				circle c=new circle();
				c.draw();//circle
				circle c1=new sequre();//upcasting child hide 
				c.draw();//circle
				sequre s=(sequre)c1;
				s.draw();//sequre
				//.draw();
				
				
			}

}
