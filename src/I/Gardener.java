package I;


import I.Interfaces.GardenerInterface;

public class Gardener implements GardenerInterface {
    @Override
    public void doPlantTree() {
        System.out.println("Gardener daraxt eka oladi !");
    }

    @Override
    public void doWorkInGarden() {
        System.out.println("Gardener bog`da ish qila oladi !");
    }
}
