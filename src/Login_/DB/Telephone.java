package Login_.DB;

public class Telephone {
    private String telephoneNumber;

    public Telephone(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
