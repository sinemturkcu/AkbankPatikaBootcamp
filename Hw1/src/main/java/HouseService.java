import java.util.ArrayList;
import java.util.List;

public class HouseService {

    private List<House> houses;

    public HouseService() {
        houses = new ArrayList<>();
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public List<House> getHouseList() {
        return houses;
    }

    public int getTotalPrice(List<House> houseList) {
        int totalPrice = 0;
        for (House house : houseList) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    public double getAverageSquareMeters(List<House> houseList) {
        int totalSquareMeters = 0;
        for (House house : houseList) {
            totalSquareMeters += house.getMeterSqure();
        }
        return (double) totalSquareMeters / houseList.size();
    }

    public List<House> filterByType(Class<?> houseType) {
        List<House> filteredHouses = new ArrayList<>();
        for (House house : houses) {
            if (houseType.isInstance(house)) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }

    public List<House> filterByRoomsAndLivingRooms(int rooms, int livingRooms) {
        List<House> filteredHouses = new ArrayList<>();
        for (House house : houses) {
            if (house instanceof HomeImpl) {
                HomeImpl houseImpl = (HomeImpl) house;
                if (houseImpl.getNumberOfRooms() == rooms && houseImpl.getNumberOfHalls() == livingRooms) {
                    filteredHouses.add(house);
                }
            } else if (house instanceof VillaImpl) {
                VillaImpl villa = (VillaImpl) house;
                if (villa.getNumberOfRooms() == rooms && villa.getNumberOfHalls() == livingRooms) {
                    filteredHouses.add(house);
                }
            } else if (house instanceof ResortImpl) {
                ResortImpl resort = (ResortImpl) house;
                if (resort.getNumberOfRooms() == rooms && resort.getNumberOfHalls() == livingRooms) {
                    filteredHouses.add(house);
                }
            }
        }
        return filteredHouses;
    }


}