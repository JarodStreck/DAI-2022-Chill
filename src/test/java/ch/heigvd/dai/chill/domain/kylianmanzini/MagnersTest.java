package ch.heigvd.dai.chill.domain.kylianmanzini;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagnersTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        Magners beer = new Magners();
        assertEquals(beer.getName(), Magners.NAME);
        assertEquals(beer.getPrice(), Magners.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.kylianmanzini.Magners";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Magners.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
