package ExerciciosJava;
import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;

        System.out.println("Digite as idades das 20 pessoas:");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / 20;

        System.out.println("A média das idades das 20 pessoas é: " + mediaIdades);

        scanner.close();
    }

}
