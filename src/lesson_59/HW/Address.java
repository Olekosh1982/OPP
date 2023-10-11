package lesson_59.HW;

public class Address {
    String street;
    int housNumber;

    public Address(String street, int housNumber) {
        this.street = street;
        this.housNumber = housNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", housNumber=" + housNumber +
                '}';
    }
}
