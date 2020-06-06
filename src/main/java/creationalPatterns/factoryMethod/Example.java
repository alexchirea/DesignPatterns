package creationalPatterns.factoryMethod;

public class Example {

    public static void main(String[] args) {

        GetCarFactory getCarFactory = new GetCarFactory();

        Car whiteCar = getCarFactory.getCar("white");
        Car blackCar = getCarFactory.getCar("black");
        Car greenCar = getCarFactory.getCar("green");

        System.out.println(whiteCar);
        System.out.println(blackCar);
        System.out.println(greenCar);

    }

}
