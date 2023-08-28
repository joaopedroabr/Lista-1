import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira um numero de sua preferencia: ");
        int number = in.nextInt();
        in.close();

        if (number % 2 == 0) {
            System.out.print("Esse numero e par");
        }
        else {
            System.out.println("Esse numero nao e par");
        }
    }
}

