package etoday;
import java.util.*;
/* 
 * First, we need to import java.util package because it contains Random and Scanner classes.
 */
public class RandomNumber {
	public static void main(String[] args){
		Random random_obj = new Random(); //creating a Random object
		int random_number = random_obj.nextInt(100);
		Scanner sc = new Scanner(System.in);
		Boolean loop = true;
		while(loop){
			System.out.print("Enter your guess number between 1 to 100 : ");
			int guess_number = sc.nextInt();
			if(guess_number == random_number){
				System.out.println("Guess number is Correct :" +random_number);
				loop = false;
			}
			else if(guess_number > random_number){
				if(guess_number>100){
					System.out.println(guess_number+" : is not Valid");
				}
				else{
					System.out.println(guess_number+" : is Greater than Guess Number");
				}
			}
			else if(guess_number < random_number){
				if(guess_number<1){
					System.out.println(guess_number+" : is not Valid");
				}
				else{
					System.out.println(guess_number+" : is Smaller than Guess Number");
				}
			}
		}
	}
}
