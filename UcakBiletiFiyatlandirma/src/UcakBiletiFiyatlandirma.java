import java.util.Scanner;

public class UcakBiletiFiyatlandirma {
    public static void main(String[] args) {

        int distance, age, tripType;
        double ageDiscount, normalAmount, discountAmount, extDiscount, totalAmount;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance: ");
        distance = input.nextInt();
        System.out.println("Please enter your age: ");
        age = input.nextInt();
        System.out.println("Please enter your trip type: (1=>One way, 2=>Roundtrip)");
        tripType = input.nextInt();

        if ((distance>=1 && age>=1 && tripType>=1 && tripType<=2)){
            normalAmount=distance*0.10;
            if (age<12){
                ageDiscount=normalAmount*0.50;
                discountAmount=normalAmount-ageDiscount;
            } else if (age>12 && age<24) {
                ageDiscount=normalAmount*0.10;
                discountAmount=normalAmount-ageDiscount;
                
            } else if (age>65) {
                ageDiscount=normalAmount*0.30;
                discountAmount=normalAmount-ageDiscount;
                
            }else {
                discountAmount = normalAmount;
            }if (tripType==2){
                extDiscount=discountAmount*0.20;
                totalAmount=(discountAmount-extDiscount)*2;
                System.out.println("Total price is: "+totalAmount+"TL");
            }else {
                System.out.println("Total price is: "+discountAmount+"TL");
            }

        }else {
            System.out.println("Please try again !");
        }


    }
}
