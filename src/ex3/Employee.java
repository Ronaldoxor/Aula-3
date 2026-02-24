package ex3;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private double monthlySalaryRaise;

    /**
     * Constrói uma classe que mostra os salários dos funcionários antes e após o aumento
     *
     * @param firstName primeiro nome do empregado;
     * @param lastName último nome do empregado;
     * @param monthlySalary salário atual do empregado;
     */

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;

        this.monthlySalaryRaise = calculateRaise();
    }

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public double getMonthlySalary(){return monthlySalary;}

    public double getMonthlySalaryRaise(){return monthlySalaryRaise;}

    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary < 0){
            this.monthlySalary = 0.0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    public double calculateRaise(){
        return monthlySalary * 1.12;
    }
}
