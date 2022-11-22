import java.util.Random;
import java.util.Scanner;

public class RockPaperScissiorsGame{
    public static void main(String [] args) {
        mainMenu();
    }
    public static void mainMenu(){
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        Scanner choice = new Scanner(System.in);
        System.out.print("Do you want to play? [ 'y' or 'n' ]  :  ");
        String userChoice = choice.nextLine();
        if (userChoice.contentEquals("y")){
            game();
        }
        if (userChoice.contentEquals("n")){
            System.out.println("Thanks for your interesting ...");
        }
    }
    public static void choiceMenu(){
        Scanner choice = new Scanner(System.in);
        System.out.print("Do you want another round? [ 'y' or 'n' ]  :  ");
        String userChoice = choice.nextLine();
        if (userChoice.contentEquals("y")){
            game();
        }
        if (userChoice.contentEquals("n")){
            System.out.println("Thanks for playing ... ");
        }
    }
    public static void game(){
        System.out.print("Please choose [ 'r', 'p', 's' ]  :  ");
        Scanner scanner = new Scanner(System.in);
        String myChoice = scanner.nextLine();
        Random random = new Random();
        int computerChoice = random.nextInt(3);
        System.out.println("You choice " + myChoice + " and the computer choice is " + computerChoice);
        if (
                computerChoice == 0 && myChoice.contentEquals("r")
                        || computerChoice == 1 && myChoice.contentEquals("p")
                        || computerChoice == 2 && myChoice.contentEquals("s")
        )
        {
            System.out.println("Draw Match ...");
            choiceMenu();
        }
        else if (
                computerChoice == 0 && myChoice.contentEquals("p")
                        || computerChoice == 1 && myChoice.contentEquals("s")
                        || computerChoice == 2 && myChoice.contentEquals("r")
        ){
            System.out.println("Congratulation! You win the Game!!");
            choiceMenu();
        }
        else {
            System.out.println("The computer wins!");
            choiceMenu();
        }
    }
}
