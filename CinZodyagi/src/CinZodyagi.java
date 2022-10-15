import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {

        int year,mod;
        String burc= " ";
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your birth year: ");
        year= input.nextInt();
        mod=year%12;

        switch (mod){
            case 0:
                burc = "Monkey";
                break;
            case 1:
                burc = "Cock";
                break;
            case 2:
                burc = "Dog";
                break;
            case 3:
                burc = "Pig";
                break;
            case 4:
                burc = "Mouse";
                break;
            case 5:
                burc = "Ox";
                break;
            case 6:
                burc = "Tiger";
                break;
            case 7:
                burc = "Rabbit";
                break;
            case 8:
                burc = "Dragon";
                break;
            case 9:
                burc = "Snake";
                break;
            case 10:
                burc = "Horse";
                break;
            case 11:
                burc = "Sheep";
                break;
            default:
                System.out.println("Plase try again!");
        }

        System.out.println("Your Chinese Zodiac is "+burc);
    }
}
