package ex2;

import java.util.Scanner;
import ex5.Date;

public class HeartProfileTest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu primeiro nome: ");
        String firstName = input.nextLine();

        System.out.print("Digite seu último nome: ");
        String lastName = input.nextLine();

        System.out.print("Digite o seu ano de nascimento: ");
        int birthYear = input.nextInt();

        System.out.print("Digite o seu mês de nascimento: ");
        int birthMonth = input.nextInt();

        System.out.print("Digite o seu dia de nascimento: ");
        int birthDay = input.nextInt();

        // Criando objeto Date
        Date birthDate = new Date(birthDay, birthMonth, birthYear);

        // Criando HeartProfile com Date
        HeartProfile heartProfile =
                new HeartProfile(firstName, lastName, birthDate);

        System.out.println("\n--- Perfil do Coração do Usuário ---");

        System.out.printf("Nome Completo: %s %s",
                heartProfile.getFirstName(),
                heartProfile.getLastName());

        System.out.printf("%nData de Nascimento: %s",
                heartProfile.getBirthDate().displayDate());

        System.out.printf("%nIdade: %d",
                heartProfile.getIdade());

        System.out.printf("%nFrequência Cardíaca Máxima: %d",
                heartProfile.getFreqCardMax());

        System.out.printf("%nFrequência Cardíaca Ideal: %.0f - %.0f",
                heartProfile.getFreqCardIdealMin(),
                heartProfile.getFreqCardIdealMax());
    }
}