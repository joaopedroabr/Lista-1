public class Questao10 {
    public static void main(String[] args) {
        Double balance = 500.50;
        Double deposit = balance += 300.25;
        Double saque = deposit -= 150.75;

        System.out.printf("%.2f", saque);

    }
}
