import java.util.Scanner;


public class MovieDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tryAgain = "y"; 
		
		String title;
		String rating;
		int soldTickets;
		
		while(tryAgain.equals("y")){
		tryAgain = "y";
		System.out.println("Enter the name of a movie");
		title = scanner.nextLine();
		
		System.out.println("Enter the rating of a movie");
		rating = scanner.nextLine();
		
		System.out.println("Enter the number of tickets sold for this movie");
		soldTickets = scanner.nextInt();
		
		
		System.out.println(title.toString() + " (" + rating.toString() + ")" + ": " 
		+  Integer.toString(soldTickets));
		
		System.out.println("Do you want to enter another? (y or n)");
		tryAgain = scanner.nextLine();
		tryAgain = scanner.nextLine();
		
		}
			
		scanner.close();
		System.out.println("Goodbye");
		
	}
	
}
