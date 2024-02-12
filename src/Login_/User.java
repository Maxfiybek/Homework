package Login_;

import Login_.DB.Telephone;

public class User {
    private Telephone telephone;
    private String name;
    private String lastName;
    private int age;
    private String gmail;
    private int code;
    private String emailCode;

    //Telefon raqam bilan kirish uchun
    public User(Telephone telephone, String name, String lastName, int age) {
        this.telephone = telephone;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //Email orqali kirish uchun


    public User(String gmail, String emailCode) {
        this.gmail = gmail;
        this.emailCode = emailCode;
    }

    public String getGmail() {
        return gmail;
    }

    public String getUserEmail() {
        return "User{" +
                "email=" + getGmail() + '\'' +
                ", code=" + emailCode + '\'' +
                "}";
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + telephone + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public Telephone getTelephone() {
        return telephone;
    }
}
