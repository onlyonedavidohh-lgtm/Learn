import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter your name please");
        String name = Input.nextLine();

        System.out.println("Okay " + name + " Enter your Monthly Salary please");
        int Salary = Input.nextInt();

        Input.nextLine();

        double TwePercent = (20.0/100*Salary);
        double FifPercent = (15.0/100*Salary);
        double TenPercent = (10.0/100*Salary);

    if (Salary>= 500000) {
        System.out.println("Your bonus is " + TwePercent);

    }
    else if (Salary>= 300000 && Salary<= 499999) {
        System.out.println("Your bonus is " + FifPercent);

    }
    
    else if (Salary>=100000 &&Salary<= 299999) {
        System.out.println("Your bonus is " + TenPercent);

    }
    else if (Salary<= 100000) {
        System.out.println("No Bonus");
    
    }
    
Input.close();




    }


}    
