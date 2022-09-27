import java.util.Scanner;

public class ATM {

    private int mainBalance = 200;
    private int addAmount;
    private int reduceAmount;
    private int newMainBalance = mainBalance + addAmount;
    private String currency = " USD";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Welcome page => Message
        System.out.println("\nWelcome to ATM\nPlease login to your account . . .");
        // Login Obj
        ATM instantAtm = new ATM();
        instantAtm.login();

    }
    public void login(){
        String username = null;
        String password = null;
        boolean isTrue = true;
        while(isTrue){
            Scanner input = new Scanner(System.in);
            if(username == null){
                System.out.println("\nUsername");
                String inputUsername = String.valueOf(input.nextLine());
                if(inputUsername.contentEquals("admin")){
                    username = inputUsername;
                }
            }
            else {
                System.out.println("Password");
                String inputPassword = String.valueOf(input.nextLine());
                if(inputPassword .contentEquals("admin")){
                    password = inputPassword;
                    System.out.println("\nWelcome to dash ATM\n");
                    home();
                    isTrue = false;
                }
            }
        }
    }
    public void home(){
        System.out.println("\nYour main balance is : " + mainBalance + currency);
        option();

    }
    public void option(){
        System.out.println("\nPlease select your options\n");
        int optOne = 1;
        int optTwo = 2;
        int goHome = 0;
        boolean goToHome = true;
        System.out.println("0. Home page\n1. Cash-in\n2. Cash-out\nPlease select (0) or (1) or (2).");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        while(goToHome){
            if (option == goHome){
                home();
                break;
            }
            if (option == optOne){
                cashIn();
                break;
            }
            if (option == optTwo){
                cashOut();
                break;
            }
        }
    }
    public void cashIn(){
        System.out.println("Please iuput any amount to add money to your account ...");
        Scanner input = new Scanner(System.in);
        int addAmount = input.nextInt();
        System.out.println("Successfully added " + addAmount + currency + " to your account!");
        int newMainBalance = mainBalance + addAmount;
        System.out.println("Your new main balance is " + newMainBalance);
        option();
    }
    public void cashOut(){
        System.out.println("Please iuput any amount to widthdrwal.");
        Scanner input = new Scanner(System.in);
        int reduceAmount = input.nextInt();
        System.out.println("Successfully widthdrawl " + reduceAmount + currency + " from your account!");
        int newMainBalance = mainBalance - reduceAmount;
        System.out.println("Your new main balance is " + newMainBalance);
        option();
    }

}
