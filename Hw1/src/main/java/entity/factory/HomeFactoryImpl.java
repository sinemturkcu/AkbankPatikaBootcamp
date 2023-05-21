package entity.factory;

import entity.HomeImpl;
import entity.House;

// Concrete factory - entity.factory.HomeFactoryImpl
public class HomeFactoryImpl implements HouseFactory {
    @Override
    public House createHouse(int price, int squareMeters, int numberOfHalls, int numberOfRooms) {
        return new HomeImpl(price,squareMeters,numberOfRooms,numberOfHalls);
    }
}
