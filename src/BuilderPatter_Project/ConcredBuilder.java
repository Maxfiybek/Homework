package BuilderPatter_Project;

public class ConcredBuilder implements HomeBuilder {
    private HomePrices homePrices;
    private String landlord;
    private int door;
    private Boolean pool;         //Basseyn
    private Boolean garage;       //Garage
    private Boolean fountain;     //Favvora tarjimasi
    private int homeArea;        //Uy sotixi    (hajmi)
    private int gardenArea;


    public Home concredBuild() {
        return new Home(landlord, homePrices, door, pool, garage, fountain, homeArea, gardenArea);
    }

    @Override
    public void setDoor(int doorsNumber) {
        this.door = doorsNumber;
    }

    @Override
    public void setPool(boolean pool) {
        this.pool = pool;
    }

    @Override
    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public void setFountain(boolean fountain) {
        this.fountain = fountain;
    }

    @Override
    public void setHomeArea(int homeArea) {
        this.homeArea = homeArea;
    }

    @Override
    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea;
    }

    @Override
    public void setLandlord(String landlord) {
        this.landlord = landlord;
    }

    @Override
    public void setHomePrice(HomePrices homePrices) {
        this.homePrices = homePrices;
    }
}
