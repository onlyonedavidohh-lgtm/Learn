import java.util.Scanner;
public class Operation {
    public static void main(String[] args) {
      Scanner Input = new Scanner(System.in);
       
      System.out.println("Enter your first value");
      double Value1 = Input.nextDouble();

      Input.nextLine();

      System.out.println("Enter your second value");
      double Value2 = Input.nextDouble();

      Input.nextLine();

      System.out.println("What operation do you want to use?");
      String operation = Input.nextLine();

    if (operation.equals("addition")) {
        System.out.println(Value1+Value2);

    }
    else if (operation.equals ("multiplication")) {
        System.out.println(Value1*Value2);
    }
    else if (operation.equals("subtraction")) {
        System.out.println(Value1-Value2);
    }
    else if (operation.equals("division")) {
        System.out.println(Value1/Value2);
    }
    else if (operation.equals("modulos")) {
        System.out.println(Value1%Value2);
    }
    else if (operation.equals("square")) {
        System.out.println(Math.pow(Value1,Value2));
    }
    else if (operation.equals("maximum value")) {
        System.out.println(Math.max(Value1,Value2)); 
        
    }
    else if (operation.equals("minimum value")) {
        System.out.println(Math.min(Value1,Value2));
    }
    else {
        System.out.println("Invalid Operation!!");
    }

Input.close();
    }
}
