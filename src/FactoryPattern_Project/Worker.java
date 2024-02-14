package FactoryPattern_Project;

public abstract class Worker { //Product

    //Abstract shablon ya`ni barcha ishchilar uchun konstructor va qiymat beruchi

    private final String name;
    private final int age;     //Yoshi shart emas ediyu sal qiziqroq bo`lishi uchun qo`shdim 😎

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract String getDutyPerson();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
