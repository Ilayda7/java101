    import java.util.Scanner;

public class DaireAlaniHesaplama {
    public static void main(String[] args) {

        int r;
        double pi= 3.14;
        int aci ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz : ");
        r = inp.nextInt();

        System.out.println("Açıyı giriniz : ");
        aci = inp.nextInt();

        double alan = (pi * (r*r) * aci) / 360;

        System.out.println("Dairenin alanı : " + alan);



    }
}
