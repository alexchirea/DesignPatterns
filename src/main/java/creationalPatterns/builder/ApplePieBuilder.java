package creationalPatterns.builder;

public class ApplePieBuilder extends PieBuilder {

    @Override
    public void buildFruits() {
        pie.setFruits("apple");
    }

    @Override
    public void buildPrice() {
        pie.setPrice(8.25F);
    }

    @Override
    public void buildSize() {
        pie.setSize(Size.SMALL);
    }
}
