import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args) {
        int attempt=1;
        int noOfGuess=0;
        int score=10;
        int originalNo=(int)(Math.random()*99+1);
        System.out.println("\t+--------------------------------+");
        System.out.println("\t| Welcome to Number Guessing Game|");
        System.out.println("\t+--------------------------------+\n");
        System.out.println("Guess a Number between 1 to 100\n");
        Scanner a=new Scanner(System.in);
        while(true) {
            if(a.hasNextInt()) {
                noOfGuess=a.nextInt();
                if(noOfGuess==originalNo) {
                    System.out.println("Congratulation! You Won The game..");
                    System.out.println("Your score is "+score);
                    System.out.println("You Guessed it in "+attempt+" attempts!");
                    break;
                }
                else if(noOfGuess<originalNo) {
                    System.out.println("Your Guess is too Small!");
                    System.out.println("-------------Keep Trying-------------");
                    System.out.println((10-attempt)+" Attempts left");
                    score--;
                }
                else if(noOfGuess>originalNo) {
                    System.out.println("Your Guess is too High!");
                    System.out.println("-------------Keep Trying-------------");
                    System.out.println((10-attempt) +" Attempts left");
                    score--;
                }
                if(attempt==10) {
                    System.out.println("You have Exceed the Maximum number of attempts!!");
                    System.out.println("Better Luck Next Time!");
                    break;
                }
                attempt++;
            }
            else {
                System.out.println("Enter a Valid Number!");
            }
        }
    }
}