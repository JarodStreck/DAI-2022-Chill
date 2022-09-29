package ch.heigvd.dai.chill.domain.zmoos;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.zmoos.Redbull;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RedbullTest {

  @Test
  void thePriceAndNameForRedbullShouldBeCorrect() {
    Redbull beer = new Redbull();
    assertEquals(beer.getName(), Redbull.NAME);
    assertEquals(beer.getPrice(), Redbull.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForRedbull() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.zmoos.Redbull";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Redbull.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
