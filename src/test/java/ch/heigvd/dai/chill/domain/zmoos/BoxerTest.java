package ch.heigvd.dai.chill.domain.zmoos;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.zmoos.Boxer;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoxerTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    Boxer beer = new Boxer();
    assertEquals(beer.getName(), Boxer.NAME);
    assertEquals(beer.getPrice(), Boxer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.zmoos.Boxer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Boxer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
