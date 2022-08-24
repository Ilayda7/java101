import java.util.Scanner;
public class KDVHesaplama {
    public static void main(String[] args) {
        /* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.*/

        double tutar, kdvOran, kdvTutar, kdvliTutar;
        boolean kdvDurum;

    Scanner input = new Scanner(System.in);
    System.out.println("Ücret tutarını girin: ");
    tutar=input.nextDouble();

        kdvDurum = (0<tutar)&&(1000>tutar);
        kdvOran = kdvDurum ? 0.18:0.08;

    kdvTutar = tutar * kdvOran;
    kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV'li tutar : " + kdvliTutar);
    }
}
