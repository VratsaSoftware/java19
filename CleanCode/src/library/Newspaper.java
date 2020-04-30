package library;

public class Newspaper extends Edition {
    private String newspaperName;
    private String dateOfPublication;

    public Newspaper(String newspaperName, String dateOfPublication, boolean isAvailable) {
        super(isAvailable);
        this.newspaperName = newspaperName;
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Name: " + this.newspaperName);
        System.out.println("Published: " + this.dateOfPublication);
    }

    public String getNewspaperName() {
        return newspaperName;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }
}
