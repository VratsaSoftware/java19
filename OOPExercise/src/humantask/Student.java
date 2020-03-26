package humantask;

public class Student extends Human {

    int rating;

    public Student() {
        this.rating = rating;
    }

    public Student(int rating) {
        this.rating = rating;
    }

    public Student(String firstName, String lastName, int rating) {
        super(firstName, lastName);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
