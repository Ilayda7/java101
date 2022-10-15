import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the year: ");
        year= input.nextInt();

        if ((year % 4 == 0 )) && (year % 100 ! = 0) || (( year % 400 == 0 )){
            System.out.println("It's a leap year: "+year);
        }
        else{
            System.out.println("It's not a leap year: "+year);
        }
    }
}
