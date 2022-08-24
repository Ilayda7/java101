        import java.util.Scanner;
public class DikUcgendeHipotenus {
    public static void main(String[] args) {

        double kenar1, kenar2, kenar3, alan, cevre, u;


        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenarı girin : ");
        kenar1 = input.nextDouble();
        System.out.println("İkinci kenarı girin : " );
        kenar2 = input.nextDouble();
        System.out.println("Üçüncü kenarı girin : " );
        kenar3 = input.nextDouble();

        u = ((kenar1+kenar2+kenar3) / 2);
        cevre = 2 * u;
        alan = Math.sqrt(u * (u - kenar1)* (u - kenar2) * (u - kenar3));

        System.out.println("Birinci kenar uzunluğu : " + kenar1);
        System.out.println("İkinci kenar uzunluğu : " + kenar2);
        System.out.println("Üçüncü kenar uzunluğu : " + kenar3);
        System.out.println("Üçgenin alanı : " + alan);

    }
}
