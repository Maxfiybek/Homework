package FactoryPattern_Project.Workers;

import FactoryPattern_Project.Worker;

public class Programmer extends Worker {
    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDutyPerson() {
        return "Bugun Programmer navbatchilik qiladi !";
    }
}
