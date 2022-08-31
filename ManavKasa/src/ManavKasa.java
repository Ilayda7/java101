import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double armut = 2.14 , elma = 3.67, domates = 1.11 , muz = 0.95, patlican = 5.00;
        int ArmutMiktari, ElmaMiktari, DomatesMiktari, MuzMiktari, PatlicanMiktari;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç kilogram armut aldığınızı girin : ");
        ArmutMiktari = inp.nextInt();
        System.out.println("Kaç kilogram elma aldığınızı girin : ");
        ElmaMiktari = inp.nextInt();
        System.out.println("Kaç kilogram domates aldığınızı girin : ");
        DomatesMiktari = inp.nextInt();
        System.out.println("Kaç kilogram muz aldığınızı girin : ");
        MuzMiktari = inp.nextInt();
        System.out.println("Kaç kilogram patlıcan aldığınızı girin : ");
        PatlicanMiktari = inp.nextInt();

        double toplam = ((armut * ArmutMiktari) + (elma*ElmaMiktari) + (domates*DomatesMiktari) + (muz*MuzMiktari) + (patlican*PatlicanMiktari));

        System.out.println("Toplam tutar : " + toplam);

    }
}
