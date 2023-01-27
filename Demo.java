import java.util.Scanner;

public class Demo{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Thumb (1) or Oompa Loompa (2)?: ");
		int input = sc.nextInt();
		if (input == 1)
		{
			WillyWonka newThumb = new Thumb();
			newThumb.speak();
			newThumb.eat();
		}
		else if (input == 2)
		{
			WillyWonka newOompaLoompa = new OompaLoompa();
			newOompaLoompa.speak();
			newOompaLoompa.eat();
		}
		else
		{
			System.out.println("That was not an option.");
		}
		
	
	}
}
