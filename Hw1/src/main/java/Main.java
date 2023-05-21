import java.util.List;

public class Main {
    public static void main(String[] args) {

        HouseFactory houseFactory = new HomeFactoryImpl();
        HouseFactory villaFactory = new VillaFactoryImpl();
        HouseFactory resortFactory = new ResortFactoryImpl();

        HouseService houseService = new HouseService();

        House house1 = houseFactory.createHouse(100000, 100,1,3);
        House house2 = houseFactory.createHouse(200000, 150,2,4);
        House villa1 = villaFactory.createHouse(500000, 200,2,4);
        House villa2 = villaFactory.createHouse(700000, 300,2,5);
        House resort1 = resortFactory.createHouse(300000, 120,2,3);
        House resort2 = resortFactory.createHouse(400000, 180,1,2);

        houseService.addHouse(house1);
        houseService.addHouse(house2);
        houseService.addHouse(villa1);
        houseService.addHouse(villa2);
        houseService.addHouse(resort1);
        houseService.addHouse(resort2);


        // Printing the house list
        List<House> houseList = houseService.getHouseList();
        System.out.println("Home List:");
        for (House house : houseList) {
            System.out.println("Price: " + house.getPrice() + ", Square Meters: " + house.getMeterSqure());
        }
        System.out.println("*************************************");
        // Calculating and printing total prices
        int totalHomePrice = houseService.getTotalPrice(houseService.filterByType(HomeImpl.class));
        int totalVillaPrice = houseService.getTotalPrice(houseService.filterByType(VillaImpl.class));
        int totalResortPrice = houseService.getTotalPrice(houseService.filterByType(ResortImpl.class));
        int totalAllPrice = houseService.getTotalPrice(houseList);
        System.out.println("Total House Price: " + totalHomePrice);
        System.out.println("Total Villa Price: " + totalVillaPrice);
        System.out.println("Total Resort Price: " + totalResortPrice);
        System.out.println("Total All Price: " + totalAllPrice);

        System.out.println("*************************************");

        // Calculating and printing average square meters
        double averageHomeSquareMeters = houseService.getAverageSquareMeters(houseService.filterByType(HomeImpl.class));
        double averageVillaSquareMeters = houseService.getAverageSquareMeters(houseService.filterByType(VillaImpl.class));
        double averageResortSquareMeters = houseService.getAverageSquareMeters(houseService.filterByType(ResortImpl.class));
        double averageAllSquareMeters = houseService.getAverageSquareMeters(houseList);
        System.out.println("Average Home Square Meters: " + averageHomeSquareMeters);
        System.out.println("Average Villa Square Meters: " + averageVillaSquareMeters);
        System.out.println("Average Resort Square Meters: " + averageResortSquareMeters);
        System.out.println("Average All Square Meters: " + averageAllSquareMeters);

        System.out.println("*************************************");

        // Filtering and printing houses based on rooms and living rooms
        List<House> filteredHouses = houseService.filterByRoomsAndLivingRooms(4, 2);
        System.out.println("Filtered Houses:");
        for (House house : filteredHouses) {
            System.out.println("Price: " + house.getPrice() + ", Square Meters: " + house.getMeterSqure());
        }

    }
}
