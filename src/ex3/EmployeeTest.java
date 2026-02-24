package ex3;

import java.util.Scanner;


public class EmployeeTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro nome do primeiro funcionário: ");
        String firstName = input.nextLine();

        System.out.print("Digite o último nome do primeiro funcionário: ");
        String lastName = input.nextLine();

        System.out.print("Digite o salário anual do primeiro funcionário: ");
        double monthlySalary = input.nextDouble();
        input.nextLine();

        System.out.printf("%nDigite o primeiro nome do segundo funcionário: ");
        String firstName2 = input.nextLine();

        System.out.print("Digite o último nome do segundo funcionário: ");
        String lastName2 = input.nextLine();

        System.out.print("Digite o salário anual do segundo funcionário: ");
        double monthlySalary2 = input.nextDouble();

        Employee employee = new Employee(firstName,lastName,monthlySalary);
        Employee employee2 = new Employee(firstName2,lastName2,monthlySalary2);

        System.out.print("Perfil do empregado 1: ");
        System.out.printf("%nNome do Funcionário: %s %s",employee.getFirstName(),employee.getLastName());
        System.out.printf("%nSalário Anual Atual: R$ %.2f ",employee.getMonthlySalary());
        System.out.printf("%nSalário Anual com Aumento: R$ %.2f %n%n%n", employee.getMonthlySalaryRaise());

        System.out.print("Perfil do empregado 2: ");
        System.out.printf("%nNome do Funcionário: %s %s",employee2.getFirstName(),employee2.getLastName());
        System.out.printf("%nSalário Anual Atual: R$ %.2f" , employee2.getMonthlySalary());
        System.out.printf("%nSalário Anual com Aumento: R$ %.2f" , employee2.getMonthlySalaryRaise());
    }
}
