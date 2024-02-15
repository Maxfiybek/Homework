package FactoryPattern_Project;

import FactoryPattern_Project.Workers.Cleaner;
import FactoryPattern_Project.Workers.Mechanic;
import FactoryPattern_Project.Workers.Programmer;
import FactoryPattern_Project.Workers.Teacher;

public class WorkCreator extends FactoryWorker {

    @Override
    public Worker createWorker(String name, int age) { //Bu yerda Facctory abstractdan kelgan createWorker metod ishlatish orqali qiymat berilayapti !
        return switch (name) {
            case "Programmer" -> new Programmer(name,age);
            case "Mechanic" -> new Mechanic(name,age);
            case "Cleaner" -> new Cleaner(name,age);
            case "Teacher" -> new Teacher(name,age);
            default -> throw new RuntimeException(name);
        };
    }
}

