import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Scanner tec = new Scanner(System.in);
        Integer num;
        System.out.println("Digite um número: ");
        num = tec.nextInt();
        if (num > 0) {
            System.out.println(num + " é positivo!");
        } else if (num < 0) {
            System.out.println(num + " é negativo!");
        } else {
            System.out.println("Este é um número nulo");
        }


    }
}
