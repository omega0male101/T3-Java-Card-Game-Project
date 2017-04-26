import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

    Card cardA;
    Card cardB;

    @Before
    public void before() {
        cardA = new Card(CardSuits.DIAMONDS, 13);
        cardB = new Card(CardSuits.DIAMONDS, 14);
    }

    @Test
    public void canFindValue() {

        assertEquals(14, cardA.getValue());
    }


    @Test
    public void canFindSuit() {

        assertEquals(cardB.getSuit(), CardSuitS.DIAMONDS);
    }

}

