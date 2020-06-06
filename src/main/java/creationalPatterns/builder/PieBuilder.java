package creationalPatterns.builder;

abstract public class PieBuilder {

    protected Pie pie;

    public Pie getPie() {
        return pie;
    }

    public void createNewPie() {
        pie = new Pie();
    }

    public abstract void buildFruits();
    public abstract void buildPrice();
    public abstract void buildSize();

}
