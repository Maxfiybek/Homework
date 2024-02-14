package FactoryPattern_Project.Workers;

import FactoryPattern_Project.Worker;

public class Teacher extends Worker {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDutyPerson() {
        return "Bugun Teacher navbatchilik qiladi !";
    }
}
