import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Coloque sua primeira nota:");
        int grade1 = in.nextInt();

        System.out.print("Coloque sua segunda nota:");
        int grade2 = in.nextInt();

        System.out.print("coloque sua terceira nota:");
        int grade3 = in.nextInt();

        System.out.print("coloque sua quarta nota:");
        int grade4 = in.nextInt();
        in.close();

        int middle = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.printf("Sua media e %d", middle);

    }
}