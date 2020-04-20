public class Human {

    private static Human instance;
    private String name;

    public static Human getInstance() {
        if (instance == null) {
            instance = new Human();
        }
        return instance;
    }

    private Human() {
        this.name = "Pesho";
    }

    private Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
