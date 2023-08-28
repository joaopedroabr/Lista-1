import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Coloque um numero: ");
        int number = in.nextInt();
        in.close();

        if (number % 2 != 0) {
            System.out.println("esse numero e impar");
        }
        else {
            System.out.println("esse numero nao e impar");
        }

    }
}

