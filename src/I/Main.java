package I;

public class Main {
    public static void main(String[] args) {
        //SOLID
        //I = interface segregation
        //Bu tamoyilda biz Obyekt ga ishlatishi kerak bo`lgan metodlarni owerride qilishimiz kerak kerak bo`lmaanlarini esa aksincha
        //Kelayotgan obyekt o`zi qilishi kerak bo`lgan yoki ishlatadigan metodlarni o`zida jamlashi kerak bo`ladi aks holda  I interface
        // segregationga zid bo`lib qoladi va ba`zan muammolar kelib chiqarisi mumkin

        Farmer farmer = new Farmer();
        System.out.println("    (Fermer)");
        farmer.doCareAnimals();
        farmer.doPlantTree();
        farmer.doWorkInGarden();
        System.out.println("--------------------------");
        System.out.println("    (Bog`bon)");
        Gardener gardener = new Gardener();
        gardener.doPlantTree();
        gardener.doWorkInGarden();
        System.out.println("--------------------------");
        System.out.println("    (Teacher)");
        Teacher teacher = new Teacher();
        teacher.doCalculate();
        teacher.doTeach();
        teacher.getExam();
        System.out.println("--------------------------");
        System.out.println("    (Student)");
        Student student = new Student();
        student.doExam();
        student.doTrain();
    }
}
