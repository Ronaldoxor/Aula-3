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
     * @param idade idade do paciente
     * @param freqCardMax frequência cardíaca máxima do paciente
     * @param freqCardIdealMin frequêcia cardíaca máxima ideal do paciente
     * @param freqCardIdealMax frequência cardíaca mínima ideal do paciente
     */

    public HeartProfile(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, int idade, int freqCardMax, double freqCardIdealMin, double freqCardIdealMax){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        calculateAge(idade);
        calculateMaxCardFreq(freqCardMax);
        calculateIdealCardFreqMin(freqCardIdealMin);
        calculateIdealCardFreqMax(freqCardIdealMax);
    }

    public String getFirstName(){return FirstName;};

    public String getLastName(){return LastName;};

    public int getBirthDay(){return birthDay;};

    public int getBirthMonth(){return birthMonth;};

    public int getBirthYear(){return birthYear;};

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
        int freqCardMax = 220 - idade;

        return freqCardMax;
    }

    public int calculateIdealCardFreqMin(){
        double freqCardIdealMin = freqCardMax * 0.5;

        return freqCardIdealMin;
    }

    public int calculateIdealCardFreqMax(){
        double freqCardIdealMax = freqCardMax * 0.85;

        return freqCardIdealMax;
    }

}
