import java.util.Random;
import java.util.Scanner;

class Game{
	public int number;
	public int input_number;
	public int noOfGuess=0;
	
	public int getnoOfGuess() {
		return noOfGuess;
	}
	public void setnoOfGuess(int noOfGuess) {
		 this.noOfGuess=noOfGuess;
	}
	
	 Game() {
		Random rand=new Random();
		this.number=rand.nextInt(100);
	}
	void takeUserInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess the no:");
		input_number=sc.nextInt();
	}
	boolean isCorrectNo(){
		noOfGuess++;
		if(input_number==number) {
			System.out.format("yes its a right Guess,\nit was %d and you guessed it"
					+ "  in %d attempts \n",number,noOfGuess);
			return true ;
		}
		else if(input_number<number) {
			System.out.println("Too low");
		}
		else if(input_number>number) {
			System.out.println("Too High");
		}
		return false;
	}
}
public class GuessNo {

	public static void main(String[] args) {
		Game obj=new Game();
		boolean b=false;
		while(!b) {
			obj.takeUserInput();
			b=obj.isCorrectNo();
			System.out.println(b);
		}
	}

}
