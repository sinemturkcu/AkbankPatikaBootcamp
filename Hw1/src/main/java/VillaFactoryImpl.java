
// Concrete factory - VillaFactoryImpl
public class VillaFactoryImpl implements HouseFactory{
    @Override
    public House createHouse(int price, int squareMeters, int numberOfHalls, int numberOfRooms) {
        return new VillaImpl(price,squareMeters,numberOfRooms,numberOfHalls);
    }
}
