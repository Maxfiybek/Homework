package BuilderPatter_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Home prosta shablon clas !
        // HomeDirector Interfacedagi metodlarga qiymat beryapti qaysiki Concred ga implementatsiya bo`lgan metodlarga !
        // ConcredBuilder set metodlarini implementatsiya qilib o`zida qiymatlarni saqlayapti ! Ya`ni Home tipida ochilgan metod hameni constructoriga qiymat berish uchun ishlataailayapti !

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Necha pullik uy ma`lumotini ko`rmoqchisiz ?");
            System.out.println(" 1) 50-ming $,    2) 100-ming $,    3) 150-ming $");
            System.out.print("Enter: ");
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> {

                    //50 ming dollrlik uy
                    HomeDirector homeDirector = new HomeDirector();
                    ConcredBuilder concredBuilder = new ConcredBuilder();
                    homeDirector.FIFTY_THOUSAND_DOLLAR(concredBuilder, "Abbosbek");
                    Home home = concredBuilder.concredBuild();
                    System.out.println(home);
                }
                case 2 -> {

                    //100ming dollrlik uy
                    HomeDirector homeDirector1 = new HomeDirector();
                    ConcredBuilder concredBuilder1 = new ConcredBuilder();   //Bu director metodiga qarab qiymatlarni home constructordagi maydonlarga qiymat beradi qiymat berilmaganlari null bo`ladi yoki ba`zilari false ya`ni yo`q degan ma`noda yozdim
                    homeDirector1.ONE_HUNDRED_THOUSAND_DOLLAR(concredBuilder1, "Sanjarbek");
                    Home home1 = concredBuilder1.concredBuild();    //ConcredBuild orqali Home constructoriga qiymat berib yuboryapmiz !
                    System.out.println(home1);
                }
                case 3 -> {

                    //150ming dollrlik uy
                    HomeDirector homeDirector2 = new HomeDirector();
                    ConcredBuilder concredBuilder2 = new ConcredBuilder();
                    homeDirector2.ONE_HUNDRED_FIFTY_THOUSAND_DOLLAR(concredBuilder2, "Mirjamol");
                    Home home2 = concredBuilder2.concredBuild();
                    System.out.println(home2);
                }
                default -> throw new RuntimeException();
            }
        }


    }
}