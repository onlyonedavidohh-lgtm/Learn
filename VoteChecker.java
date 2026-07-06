import java.util.Scanner;

public class VoteChecker{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = Input.nextLine();

        System.out.println("Enter your age");
        int Age =Input.nextInt();

        Input.nextLine();
    if (Age>= 18){
        System.out.println("Hello " + name + " You are eligible to vote");
    }
    else {
        System.out.println("Hello " + name + " you are not eligible to vote");
    }
Input.close();




    }
}