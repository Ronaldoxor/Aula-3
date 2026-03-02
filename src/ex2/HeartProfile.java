package ex2;

import ex5.Date;

public class HeartProfile {

    private String firstName;
    private String lastName;
    private Date birthDate;

    private int idade;
    private int freqCardMax;
    private double freqCardIdealMin;
    private double freqCardIdealMax;

    /**
     * Constrói um objeto HeartProfile com nome e data de nascimento
     *
     * @param firstName primeiro nome do paciente
     * @param lastName último nome do paciente
     * @param birthDate data de nascimento
     */
    public HeartProfile(String firstName, String lastName, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;

        this.idade = calculateAge();
        this.freqCardMax = calculateMaxCardFreq();
        this.freqCardIdealMin = calculateIdealCardFreqMin();
        this.freqCardIdealMax = calculateIdealCardFreqMax();
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Date getBirthDate(){
        return birthDate;
    }

    public int getIdade(){
        return idade;
    }

    public int getFreqCardMax(){
        return freqCardMax;
    }

    public double getFreqCardIdealMin(){
        return freqCardIdealMin;
    }

    public double getFreqCardIdealMax(){
        return freqCardIdealMax;
    }

    private int calculateAge() {

        int currentDay = 20;    // definido manualmente
        int currentMonth = 2;   // fevereiro
        int currentYear = 2026;

        int idade = currentYear - birthDate.getYear();

        if (currentMonth < birthDate.getMonth() ||
                (currentMonth == birthDate.getMonth() &&
                        currentDay < birthDate.getDay())) {
            idade--;
        }

        return idade;
    }

    private int calculateMaxCardFreq(){
        return 220 - idade;
    }

    private double calculateIdealCardFreqMin(){
        return freqCardMax * 0.5;
    }

    private double calculateIdealCardFreqMax(){
        return freqCardMax * 0.85;
    }
}