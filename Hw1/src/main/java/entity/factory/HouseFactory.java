package entity.factory;

import entity.House;

// Abstract factory interface
public interface HouseFactory {
    House createHouse(int price, int squareMeters, int numberOfHalls, int numberOfRooms);
}
