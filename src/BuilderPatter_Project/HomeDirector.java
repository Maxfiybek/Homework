package BuilderPatter_Project;

public class HomeDirector {
    public void ONE_HUNDRED_FIFTY_THOUSAND_DOLLAR (HomeBuilder homeBuilder, String landlord){
        homeBuilder.setLandlord(landlord);
        homeBuilder.setHomePrice(HomePrices.ONE_HUNDRED_FIFTY_THOUSAND_DOLLAR);
        homeBuilder.setDoor(2);
        homeBuilder.setPool(true);
        homeBuilder.setGarage(true);
        homeBuilder.setFountain(true);
        homeBuilder.setHomeArea(7);
        homeBuilder.setGardenArea(2);
    }
    public void ONE_HUNDRED_THOUSAND_DOLLAR(HomeBuilder homeBuilder, String landlord){
        homeBuilder.setLandlord(landlord);
        homeBuilder.setHomePrice(HomePrices.ONE_HUNDRED_THOUSAND_DOLLAR);
        homeBuilder.setDoor(2);
        homeBuilder.setPool(true);
        homeBuilder.setGarage(true);
        homeBuilder.setFountain(false);
        homeBuilder.setHomeArea(5);
        homeBuilder.setGardenArea(1);
    }
    public void FIFTY_THOUSAND_DOLLAR(HomeBuilder homeBuilder, String landLord){
        homeBuilder.setLandlord(landLord);
        homeBuilder.setHomePrice(HomePrices.FIFTY_THOUSAND_DOLLAR);
        homeBuilder.setDoor(1);
        homeBuilder.setPool(false);
        homeBuilder.setGarage(true);
        homeBuilder.setFountain(false);
        homeBuilder.setHomeArea(3);
        homeBuilder.setGardenArea(1);
    }
    public HomeBuilder homeBuild(HomeBuilder homeBuilder){
        return homeBuilder;
    }
}
