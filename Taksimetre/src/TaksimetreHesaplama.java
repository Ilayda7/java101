    import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20, total = 10;


        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen yolu km cinsinden yazınız : ");
        km = input.nextInt();

        total += (perKm * km);
        total = (total<20) ? 20 : total;
        System.out.println("Toplam tutar : " + total);


    }
}
