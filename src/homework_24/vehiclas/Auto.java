package homework_24.vehiclas;

public class Auto extends Vehicle{
    public Auto(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return "Auto {" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", engine=" + getEngine() +
                '}';
    }

    }

