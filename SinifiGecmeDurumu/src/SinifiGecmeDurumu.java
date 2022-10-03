import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {

        int math, physic, turkish, chemistry, music;

        Scanner input = new Scanner(System.in);

        System.out.print("your math score is:  ");
        math = input.nextInt();

        System.out.print("your physic score is:  ");
        physic = input.nextInt();

        System.out.print("your turkish score is:  ");
        turkish = input.nextInt();

        System.out.print("your chemistry score is:  ");
        chemistry = input.nextInt();

        System.out.print("your music score is:  ");
        music = input.nextInt();

        if (math<0 || math>100)
            math = 0;
        if (physic<0 || physic>100)
            physic = 0;
        if (turkish<0 || turkish>100)
            turkish = 0;
        if (chemistry<0 || chemistry>100)
            chemistry = 0;
        if (music<0 || music>100)
            music = 0;

        double average = (math+physic+turkish+chemistry+music)/5;
        if (average<55){
            System.out.println("You have to repeat the class.");
        }else{
            System.out.println("You don't have to repeat the class. Congrats!");
        }
        System.out.println("Your average is : "+ average);
    }

}
