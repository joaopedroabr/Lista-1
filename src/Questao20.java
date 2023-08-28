import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quanto voce ganha por hora?");
        double earnedPerHour = in.nextDouble();

        System.out.print("quantas horas voce trabalha por mes?");
        double hoursPerMonth = in.nextDouble();
        in.close();

        double grossSalary = earnedPerHour * hoursPerMonth;
        double incomeTax = grossSalary * 0.11;
        double inss = grossSalary * 0.08;
        double sindicate = grossSalary * 0.05;
        double netWage = grossSalary * 0.76;

        System.out.printf("o salario liquido e R$ %.2f, o salario bruto e R$ %.2f, o inss e R$ %.2f, o sindicato e R$ %.2f, o imposto de renda e R$ %.2f, ", netWage, grossSalary, inss, sindicate, incomeTax);
    }
}