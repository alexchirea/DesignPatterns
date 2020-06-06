package creationalPatterns.factoryMethod;

public class GetCarFactory {

    public Car getCar(String type) {
        if (type == null) {
            return null;
        }
        if (type.equals("white")) {
            return new WhiteCar();
        } else if (type.equals("black")) {
            return new BlackCar();
        } else if (type.equals("green")) {
            return new GreenCar();
        }
        return null;
    }

}
