package creationalPatterns.builder;

public class CherryPieBuilder extends PieBuilder {

    @Override
    public void buildFruits() {
        pie.setFruits("cherry");
    }

    @Override
    public void buildPrice() {
        pie.setPrice(12.5F);
    }

    @Override
    public void buildSize() {
        pie.setSize(Size.MEDIUM);
    }
}
