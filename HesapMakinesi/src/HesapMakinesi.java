import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        number1 = inp.nextInt();
        System.out.println("Enter the second number : ");
        number2 = inp.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division ");
        System.out.println("Please select one of them : ");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Answer : " + (number1+number2));
                break;
            case 2:
                System.out.println("Answer : " + (number1-number2));
                break;
            case 3:
                System.out.println("Answer : " + (number1*number2));
                break;
            case 4:
                System.out.println("Answer : " + (number1/number2));
                break;
            default:
                System.out.println("Your select was wrong!");
        }

    }
}
