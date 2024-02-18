package I;


import I.Interfaces.StudentInterface;

public class Student implements StudentInterface {

    @Override
    public void doTrain() {
        System.out.println("Student mashq bajara oladi !");
    }

    @Override
    public void doExam() {
        System.out.println("Student imtixon topshira oladi !");
    }
}
