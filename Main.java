import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int i;
		double d;
		float f;
		char c;
		
		System.out.println("Enter Any Int:");
		i =Integer.parseInt(s.nextLine());
		
		System.out.println("Enter Any float: ");
		f = Float.parseFloat(s.nextLine());
	
		System.out.println("Enter Any Char: ");
		c =s.nextLine().charAt(0);
		
		System.out.println("Enter Any Double");
		d = Double.parseDouble(s.nextLine());
		
		System.out.println("Int: "+i);
		System.out.println("Float: "+f);
		System.out.println("Char: "+c);
		System.out.println("Double: "+d);
		
		
		
	}

}
