package creationalPatterns.builder;

public class Customer {

    public static void main(String[] args) {
        Baker baker = new Baker();
        PieBuilder cherryPieBuilder = new CherryPieBuilder();
        PieBuilder applePieBuilder = new ApplePieBuilder();

        baker.setPieBuilder(applePieBuilder);
        baker.constructPie();

        Pie pie1 = baker.getPie();
        System.out.println(pie1);

        baker.setPieBuilder(cherryPieBuilder);
        baker.constructPie();

        Pie pie2 = baker.getPie();
        System.out.println(pie2);
    }

}
