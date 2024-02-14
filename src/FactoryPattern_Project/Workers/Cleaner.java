package FactoryPattern_Project.Workers;

import FactoryPattern_Project.Worker;

public class Cleaner extends Worker {

    public Cleaner(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDutyPerson() {
        return "Bugun Cleaner navbatchilik qiladi !";
    }
}
