import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        Integer n1;
        n1 = tec.nextInt();

        System.out.println("Digite o segundo valor: ");
        Integer n2;
        n2 = tec.nextInt();

        System.out.println("Digite o terceiro valor: ");
        Integer n3;
        n3 = tec.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O primeiro valor é maior");
        }

        if (n2 > n1 &&  n2 >n3) {
            System.out.println("O segundo valor é maior");
        }

        if (n3 > n1 && n3 > n2) {
            System.out.println("O terceiro valor é maior");
        }
    }
}


