package ch.heigvd.dai.chill.domain.david;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PGTest {

    @Test
    void thePriceAndNameForPGShouldBeCorrect() {
        PG beer = new PG();
        assertEquals(beer.getName(), PG.NAME);
        assertEquals(beer.getPrice(), PG.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPG() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.david.PG";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = PG.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
