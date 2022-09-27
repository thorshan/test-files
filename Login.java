import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        String username = null;
        String password = null;
        boolean isTrue = true;
        while(isTrue){
            Scanner input = new Scanner(System.in);
            if(username == null){
                System.out.println("Username");
                String inputUsername = String.valueOf(input.nextLine());
                if(inputUsername.contentEquals("admin")){
                    username = inputUsername;
                }
            }
            else {
                System.out.println("Password");
                String inputPassword = String.valueOf(input.nextLine());
                if(inputPassword .contentEquals("12345")){
                    password = inputPassword;
                    System.out.println("Welcome to dash board");
                    isTrue = false;
                }
            }
        }
    }
}