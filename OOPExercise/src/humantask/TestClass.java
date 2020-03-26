package humantask;

public class TestClass {

    public static void main(String[] args) {
        Worker worker = new Worker("Georgi", "Ivanov", 5, 120);
        System.out.println(worker.getFirstName() + " " + worker.getLastName());
        System.out.println("wage: " + worker.getWage() + " worked hours: " + worker.getWorkedHours());
        System.out.println("wage per hour: " + worker.returnWagePerHour());
        worker.getWagePerHour();
    }
}
