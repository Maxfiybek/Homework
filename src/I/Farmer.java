package I;


import I.Interfaces.FarmerInterface;

public class Farmer implements FarmerInterface {
    @Override
    public void doPlantTree() {
        System.out.println("Fermer daraxt eka oladi !");
    }

    @Override
    public void doWorkInGarden() {
        System.out.println("Bog`da ish qila oladi !");
    }

    @Override
    public void doCareAnimals() {
        System.out.println("Hayvon boqa oladi !");
    }
}
