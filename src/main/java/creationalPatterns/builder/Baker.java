package creationalPatterns.builder;

public class Baker {

    private PieBuilder pieBuilder;

    public void setPieBuilder(PieBuilder pieBuilder) {
        this.pieBuilder = pieBuilder;
    }

    public Pie getPie() {
        return pieBuilder.getPie();
    }

    public void constructPie() {
        pieBuilder.createNewPie();
        pieBuilder.buildFruits();
        pieBuilder.buildPrice();
        pieBuilder.buildSize();
    }
}
