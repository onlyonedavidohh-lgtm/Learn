import java.util.Scanner;

public class StudentGrade{
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = Input.nextLine();

        System.out.println("Okay " + name + " Enter your score please");
        int score = Input.nextInt();

        Input.nextLine();

    if (score>= 70) {
        System.out.println("Hello " + name + " your score is " + score + " Grade A");
    }
    else if (score>= 60) {
        System.out.println("Hello " + name + " your score is " + score + " Grade B");
    }
    else if (score>= 50) {
        System.out.println("Hello " + name + " your score is " + score + " Grade C");
    }
    else if ( score>= 45) {
        System.out.println("Hello " + name + " your score is " + score + " Grade D");
    }
    else if ( score<= 45) {
        System.out.println("Hello " + name + " your score is " + score + " Garde F");
    }
Input.close();

    }
}