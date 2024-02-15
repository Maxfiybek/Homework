package S.O.L.I.D.Open_Closed2;

public class Main {
    public static void main(String[] args) {
        BreadManager breadManager = new BreadManager();
        System.out.println(breadManager.getBread(new Korzinka(), 200) + " ta non yetkaib beriladi !");
        System.out.println(breadManager.getBread(new Magazin(), 100) + " ta non yetkazib beriladi !");
        System.out.println(breadManager.getBread(new Magnit(), 150) + " ta non yetkazib beriladi !");
    }
}
