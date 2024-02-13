package Login_;

import Login_.DB.DB;
import Login_.DB.Telephone;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DB dataBase = DB.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("1) Telefon raqam orqali kirish !     2) Email orqali kirish !");
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.print("Telefon raqamingizni kiriting: ");
                    String tel = scanner.nextLine();
                    Telephone telephone = new Telephone(tel);
                    System.out.println("Telefon raqamingizga kod yubordik !");
                    int basket = 0;

                    for (int i = 0; i < 1; i++) {
                        i = random.nextInt(1000);
                        System.out.println("message code : " + i);
                        basket = i;
                    }
                    System.out.print("Codeni kiriting: ");
                    int code = scanner.nextInt();

                    if (code == basket) {
                        System.out.println("Kod to`g`ri kiritildi ");
                        scanner.nextLine();
                        System.out.print("Ismingizni kiriting: ");
                        String name = scanner.nextLine();

                        System.out.print("Familyangizi kiriting: ");
                        String lastName = scanner.nextLine();

                        System.out.print("Yoshingizni kiriting: ");
                        int age = scanner.nextInt();

                        User user = new User(telephone, name, lastName, age);
                        System.out.println(user);
                        System.out.println(dataBase);
                    } else {
                        System.out.println("Siz kodni noto`g`ri kiritdingiz qayta urinib ko`ring !");
                    }
                }


                case 2 -> {
                    scanner.nextLine();
                    System.out.print("Emailingizni kiriting: ");
                    String email = scanner.nextLine();


                    System.out.print("Emailingizni kodini kiriting: ");
                    String emailCode = scanner.nextLine();

                    User user = new User(email, emailCode);
                    System.out.println("Siz muvafaqiyatli kirdingiz !  \nSizni ma`lumotlaringiz qaayta kirishingiz uchun saqlanib qoladi !");
                    System.out.println(user.getUserEmail());

                }
            }
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
        }
    }
}