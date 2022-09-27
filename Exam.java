import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Subject One => ");
        int subOne = input.nextInt();
        System.out.println("Subject Two => ");
        int subTwo = input.nextInt();
        System.out.println("Subject Three => ");
        int subThree = input.nextInt();
        System.out.println("Subject Four => ");
        int subFour = input.nextInt();
        System.out.println("Subject Five => ");
        int subFive = input.nextInt();

        int passResult = 40;
        int credit = 65;
        int destination = 80;

        if (subOne < passResult || subTwo < passResult || subThree < passResult || subFour < passResult || subFive < passResult) {
            System.out.println("Failed");
        } else {
            if (subOne >= destination || subTwo >= destination || subThree >= destination || subFour >= destination || subFive >= destination) {
                System.out.println("Passed with destination");
            }
            else if (subOne >= credit && subTwo >= credit && subThree >= credit && subFour >= credit && subFive >= credit) {
                    System.out.println("Passed with credit!!");
            }
            else {
                System.out.println("Passed");
            }
        }
    }
}
