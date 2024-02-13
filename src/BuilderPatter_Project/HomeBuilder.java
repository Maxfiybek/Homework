package BuilderPatter_Project;

public interface HomeBuilder {
    //Home dagi fieldlarga qiymat berish uchun abstract metodlar
    void setDoor(int doorsNumber);

    void setPool(boolean pool);

    void setGarage(boolean garage);

    void setFountain(boolean fountain);

    void setHomeArea(int homeArea);

    void setGardenArea(int gardenArea);

    void setLandlord(String landlord);

    void setHomePrice(HomePrices homePrices);
}
