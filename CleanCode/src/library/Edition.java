package library;

public class Edition {
    protected boolean isAvailable;
    protected int timesDetailsRequested = 0;

    public Edition(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void take() {
        this.isAvailable = false;
    }

    public void restore() {
        this.isAvailable = true;
    }

    public void getDetails() {
        System.out.println("Is available: " + this.isAvailable);
        this.timesDetailsRequested++;
    }
}
