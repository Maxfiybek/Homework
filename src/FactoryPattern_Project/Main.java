package FactoryPattern_Project;

import FactoryPattern_Project.FactoryWorker;
import FactoryPattern_Project.WorkCreator;
import FactoryPattern_Project.Worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkCreator workCreator = new WorkCreator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ishchi kasbini kiriting: ");  //Kasbni to`g`ri kiritish kerak
        String name = scanner.nextLine();
        System.out.print("Yoshini kiriting: ");         //Yosh muxim emas !
        int age = scanner.nextInt();


        Worker worker = workCreator.createWorker(name,age);
        System.out.println(worker.getDutyPerson());
        System.out.println("Ishchi kasbi: " + worker.getName());
        System.out.println("Ishchi yoshi: " + worker.getAge());

    }
}
