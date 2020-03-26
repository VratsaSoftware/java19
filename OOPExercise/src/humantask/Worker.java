package humantask;

public class Worker extends Human implements  IWage {

    private int workedHours;
    private double wage;

    public Worker() {
        this.workedHours = 1;
        this.wage = 20;
    }

    public Worker(int workedHours, double wage) {
        this.workedHours = workedHours;
        this.wage = wage;
    }

    public Worker(String firstName, String lastName, int workedHours, double wage) {
        super(firstName, lastName);
        this.workedHours = workedHours;
        this.wage = wage;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double returnWagePerHour() {
        return wage/workedHours;
    }


    @Override
    public void getWagePerHour() {
        System.out.println("wage per hour from interface: " + wage/workedHours);
    }
}
