import java.util.*;

public class NameGames
{

	public static void main (String[] args)

	{

		Scanner userinput = new Scanner (System.in);

		String startLetter, middleLetter, endLetter;
		int nameLength;
		nameLength = 0;

		System.out.print("Please enter your name: ");
		String Name = userinput.nextLine();

		nameLength = Name.length();
		startLetter = "" + Name.charAt(0);
		middleLetter = "" + Name.charAt(Name.length()/2);
		endLetter = "" + Name.charAt(Name.length()-1);

		System.out.println("Hello " + Name + "!");
		System.out.println("Your name is " + nameLength + " letters long.");
		System.out.println("Your name starts with a " + startLetter + ".");
		System.out.println("The letter " + middleLetter + " is at the center of your name");
		System.out.println("Your name ends with a " + endLetter + ".");
		System.out.println("Goodbye " + Name + "!");


	}
}