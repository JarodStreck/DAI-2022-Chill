package ch.heigvd.dai.chill.domain.cedric;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BierkaTest {

  @Test
  void thePriceAndNameForBierkaShouldBeCorrect() {
    Bierka beer = new Bierka();
    assertEquals(beer.getName(), Bierka.NAME);
    assertEquals(beer.getPrice(), Bierka.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBierka() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.cedric.Bierka";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Bierka.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
