package ch.heigvd.dai.chill.domain.Cedro22;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilsDePommeTest {

    @Test
    void thePriceAndNameForFilsDePommeShouldBeCorrect() {
        FilsDePomme beer = new FilsDePomme();
        assertEquals(beer.getName(), FilsDePomme.NAME);
        assertEquals(beer.getPrice(), FilsDePomme.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFilsDePomme() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.Cedro22.FilsDePomme";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = FilsDePomme.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
