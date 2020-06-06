package creationalPatterns.factoryMethod;

abstract public class Car {

    protected String color;

    Car() {
        setColor();
    };

    abstract void setColor();

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "The car is " + color;
    }

}
