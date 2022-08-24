import java.util.Scanner;

public class DikUcgendeHipotenus {
    public static void main(String[] args) {

        double kenar1, kenar2, hipotenus;


        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenarı girin : ");
        kenar1 = input.nextDouble();
        System.out.println("İkinci kenarı girin : " );
        kenar2 = input.nextDouble();

        hipotenus = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.println("Birinci kenar uzunluğu : " + kenar1);
        System.out.println("İkinci kenar uzunluğu : " + kenar2);
        System.out.println("Üçgenin hipotenüs uzunluğu : " + hipotenus);

    }
}


