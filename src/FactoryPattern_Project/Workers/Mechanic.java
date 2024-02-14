package FactoryPattern_Project.Workers;

import FactoryPattern_Project.Worker;

public class Mechanic extends Worker {

    public Mechanic(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDutyPerson() {
        return "Bugun Mechanic navbatchilik qiladi !";
    }
}
