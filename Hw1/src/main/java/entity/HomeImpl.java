package entity;

import entity.House;

// Concrete product - Home
public class HomeImpl implements House {
    private int price;
    private int meterSquare;
    private int numberOfRooms;
    private int numberOfHalls;

    public HomeImpl(int price, int meterSquare,int numberOfRooms, int numberOfHalls) {
        this.price = price;
        this.meterSquare = meterSquare;
        this.numberOfHalls=numberOfHalls;
        this.numberOfRooms=numberOfRooms;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getMeterSqure() {
        return meterSquare;
    }

    @Override
    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    @Override
    public int getNumberOfRooms() {
        return numberOfRooms;
    }


}
