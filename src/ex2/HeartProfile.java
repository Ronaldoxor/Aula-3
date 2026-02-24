package ex2;

public class HeartProfile {

    private String firstName;
    private String lastName;
    private int idade;
    private int freqCardMax;
    private double freqCardIdealMin;
    private double freqCardIdealMax;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    /** Constrói um objeto HeartProfile, com o nome e idade da pessoa e retorna a frequência cardíaca
     * máxima e o intervalo alvo
     *
     * @param firstName primeiro nome do paciente
     * @param lastName último nome do paciente
     * @param birthDay dia de nascimento do paciente
     * @param birthMonth mês de nascimento do paciente
     * @param birthYear ano de nascimento do paciente
     */

    public HeartProfile(String firstName, String lastName, int birthDay, int birthMonth, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;

        this.idade = calculateAge();
        this.freqCardMax = calculateMaxCardFreq();
        this.freqCardIdealMin = calculateIdealCardFreqMin();
        this.freqCardIdealMax = calculateIdealCardFreqMax();
    }

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public int getBirthDay(){return birthDay;}

    public int getBirthMonth(){return birthMonth;}

    public int getBirthYear(){return birthYear;}

    public int getIdade(){return idade;}

    public int getFreqCardMax(){return freqCardMax;}

    public double getFreqCardIdealMin(){return freqCardIdealMin;}

    public double getFreqCardIdealMax(){return freqCardIdealMax;}

    public int calculateAge() {

        int currentDay = 20;    // defina manualmente
        int currentMonth = 2;   // fevereiro
        int currentYear = 2026; // ano atual

        int idade = currentYear - birthYear;

        if (currentMonth < birthMonth ||
                (currentMonth == birthMonth && currentDay < birthDay)) {
            idade--;
        }

        return idade;
    }

    public int calculateMaxCardFreq(){
        return 220 - idade;
    }

    public double calculateIdealCardFreqMin(){
        return freqCardMax * 0.5;
    }

    public double calculateIdealCardFreqMax(){
        return freqCardMax * 0.85;
    }

}
