import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        System.out.println("Escolha uma das operações abaixo para que o programa a realize: \n" +
                "1 = Adição \n" + "2 = Subtração \n" + "3 = Multiplicação \n" + "4 = Divisão \n");


        Scanner tec = new Scanner(System.in);
        Integer escolha;
        escolha = tec.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o primeiro numero: ");
                Integer n1 = tec.nextInt();

                System.out.println("Digite o segundo número: ");
                Integer n2 = tec.nextInt();

                System.out.println("A soma dos numeros: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Digite o primeiro número: ");
                Integer s1 = tec.nextInt();

                System.out.println("Digite o segundo número: ");
                Integer s2 = tec.nextInt();

                System.out.println("A subtracao dos numeros: " + (s1 - s2));
                break;

            case 3:
                System.out.println("Digite o prineiro numero: ");
                Integer m1 = tec.nextInt();

                System.out.println("Digite o segubndo numero: ");
                Integer m2 = tec.nextInt();

                System.out.println("A multipicacao dos numeros: " + (m1 * m2));
                break;

            case 4:
                System.out.println("Digite o primeiro numero: ");
                Integer d1 = tec.nextInt();

                System.out.println("Digite o segundo numero: ");
                Integer d2 = tec.nextInt();

                System.out.println("A divisão dos numeros: " + (d1 / d2));
                break;
        }
    }
}