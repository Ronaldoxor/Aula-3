package ex2;

import java.util.Scanner;

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

        HeartProfile heartProfile = new HeartProfile(firstName,lastName,birthDay,birthMonth,birthYear);

        System.out.println("\n--- Perfil do Coração do Usuário ---");
        System.out.printf("Nome Completo: %s %s",heartProfile.getFirstName(),heartProfile.getLastName());
        System.out.printf("%nData de Nascimento: %d/%d/%d ",heartProfile.getBirthDay(),heartProfile.getBirthMonth(),heartProfile.getBirthYear());
        System.out.printf("%nIdade: %d ",heartProfile.getIdade());
        System.out.println("Frequência Cardíaca Máxima:" + heartProfile.getFreqCardMax());
        System.out.printf("Frequência Cardíaca Ideal: %.0f - %.0f ", heartProfile.getFreqCardIdealMin(), heartProfile.getFreqCardIdealMax());
    }
}
