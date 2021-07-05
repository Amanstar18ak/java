import java.util.Scanner;
public class Sum
{
    public void showMenu()
    {
	    int num1;
	    int num2;
	    int num3;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no :- ");
	    num1=sc.nextInt();
        System.out.print("enter 2nd no :- ");
	    num2=sc.nextInt();
        sc.close();
        num3=num1+num2;
        System.out.println("sum of 1st and 2nd no is  "+num3);
      
    }

    public static void main(String[] args)
    {
	    Sum ca = new Sum();
	    ca.showMenu();

    }
}