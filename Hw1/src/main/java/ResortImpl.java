// Concrete product - Resort
public class ResortImpl implements House{
    private int price;
    private int meterSquare;
    private int numberOfRooms;
    private int numberOfHalls;

    public ResortImpl(int price, int meterSquare, int numberOfRooms, int numberOfHalls) {
        this.price = price;
        this.meterSquare = meterSquare;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
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
