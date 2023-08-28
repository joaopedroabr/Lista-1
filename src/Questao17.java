import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Coloque um numero: ");
        int number = in.nextInt();
        in.close();

        if (number % 5 == 0) {
            System.out.println("Esse numero e multiplo por 5");
        }
        else {
            System.out.println("esse  numero nao e multiplo por 5");
        }
    }
}