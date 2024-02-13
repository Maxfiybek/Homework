package BuilderPatter_Project;

public class Home {
    private final HomePrices homePrices;
    private final String landlord;
    private final int door;
    private final Boolean pool;         //Basseyn
    private final Boolean garage;       //Garage
    private final Boolean fountain;     //Favvora tarjimasi
    private final int homeArea;        //Uy sotixi    (hajmi)
    private final int gardenSize;      //Bog` sotixi

    public Home(String landlord, HomePrices homePrices, int door, Boolean pool, Boolean garage, Boolean fountain, int homeArea, int gardenSize) {
        this.landlord = landlord;
        this.homePrices = homePrices;
        this.door = door;
        this.pool = pool;
        this.garage = garage;
        this.fountain = fountain;
        this.homeArea = homeArea;
        this.gardenSize = gardenSize;
    }

    @Override
    public String toString() {
        return "Home{" +
                " landlord='" + landlord +
                ", homePrices=" + homePrices + '\''+
                ", door=" + door +
                ", pool=" + pool +
                ", garage=" + garage +
                ", fountain=" + fountain +
                ", homeArea=" + homeArea +
                ", gardenSize=" + gardenSize +
                '}';
    }
}
