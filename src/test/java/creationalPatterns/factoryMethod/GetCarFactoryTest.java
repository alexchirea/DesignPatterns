package creationalPatterns.factoryMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetCarFactoryTest {

    GetCarFactory getCarFactory;
    Car car;

    @BeforeEach
    void beforeEach() {
        getCarFactory = new GetCarFactory();
    }

    @Test
    void createColoredCars() {
        String colors[] = {"white", "black", "green"};
        for (int i = 0; i < colors.length; i++) {
            car = getCarFactory.getCar(colors[i]);
            assertEquals(car.getColor(), colors[i]);
        }
    }

    @Test
    void createNullCars() {
        String colors[] = {null, "red"};
        for (int i = 0; i < colors.length; i++) {
            car = getCarFactory.getCar(colors[i]);
            assertEquals(car, null);
        }
    }

}