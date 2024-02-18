package I;

import I.Interfaces.TeacherInterface;

public class Teacher implements TeacherInterface {
    @Override
    public void doCalculate() {
        System.out.println("Teacher hiosoblashni biladi !");
    }

    @Override
    public void doTeach() {
        System.out.println("Teacher dars bera oladi !");
    }

    @Override
    public void getExam() {
        System.out.println("Teacher imtixon ola oladi !");
    }
}
