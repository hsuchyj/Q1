
import java.util.Scanner;
public class QB 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Touchdowns?");
		double TD = scan.nextDouble();
		System.out.println("Yards?");
		double Yards = scan.nextDouble();
		System.out.println("Interceptions?");
		double INT = scan.nextDouble();
		System.out.println("Completions?");
		double comp = scan.nextDouble();
		System.out.println("Attempted passes?");
		double ATT = scan.nextDouble();
		
		double a = ((comp/ATT)-.3)*5;
		double b = ((Yards/ATT)-3)*.25;
		double c = ((TD/ATT)*20);
		double d = 2.375-((INT/ATT)*25);
		
		double rating = ((a+b+c+d)/6)*100;
		//if rating is over 158.3, set to max value
		if (rating > 158.3)
			rating = 158.3;
		
		System.out.println(rating);
	}
	

}
