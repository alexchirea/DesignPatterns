package creationalPatterns.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BakerTest {

    Baker baker;
    PieBuilder pieBuilder;
    Pie pie;

    @BeforeEach
    void beforeEach() {
        baker = new Baker();
    }

    @Test
    void constructCherryPie() {
        pieBuilder = new CherryPieBuilder();
        baker.setPieBuilder(pieBuilder);
        baker.constructPie();
        pie = baker.getPie();
        assertEquals(pie.getFruits(), "cherry");
        assertEquals(pie.getSize(), Size.MEDIUM);
        assertEquals(pie.getPrice(), 12.5F);
    }

    @Test
    void constructApplePie() {
        pieBuilder = new ApplePieBuilder();
        baker.setPieBuilder(pieBuilder);
        baker.constructPie();
        pie = baker.getPie();
        assertEquals(pie.getFruits(), "apple");
        assertEquals(pie.getSize(), Size.SMALL);
        assertEquals(pie.getPrice(), 8.25F);
    }

}