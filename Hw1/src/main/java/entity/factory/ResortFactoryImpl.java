package entity.factory;

import entity.House;
import entity.ResortImpl;

// Concrete factory - entity.factory.ResortFactoryImpl
public class ResortFactoryImpl implements HouseFactory {
    @Override
    public House createHouse(int price, int squareMeters, int numberOfRooms, int numberOfHalls) {
        return new ResortImpl(price,squareMeters,numberOfRooms,numberOfHalls);
    }
}
