package entity.factory;

import entity.House;
import entity.VillaImpl;

// Concrete factory - entity.factory.VillaFactoryImpl
public class VillaFactoryImpl implements HouseFactory {
    @Override
    public House createHouse(int price, int squareMeters, int numberOfHalls, int numberOfRooms) {
        return new VillaImpl(price,squareMeters,numberOfRooms,numberOfHalls);
    }
}
