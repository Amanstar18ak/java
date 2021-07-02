class Square
{
  int length;
  Square(int x)
  {
        length=x;
	System.out.println("this is constructor ");
  }
  
  int area()
  {
	return length * length;
   }
   public static void main(String a[])
   {
	Square s1=new Square(12);
	System.out.println("Area is "+s1.area() );
    }
}