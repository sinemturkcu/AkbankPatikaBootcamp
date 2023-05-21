// Concrete factory - HomeFactoryImpl
public class HomeFactoryImpl implements HouseFactory{
    @Override
    public House createHouse(int price, int squareMeters, int numberOfHalls, int numberOfRooms) {
        return new HomeImpl(price,squareMeters,numberOfRooms,numberOfHalls);
    }
}
