package ch.heigvd.dai.chill.domain.RedTabby;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KoffTest {

  @Test
  void thePriceAndNameForKoffShouldBeCorrect() {
    Koff beer = new Koff();
    assertEquals(beer.getName(), Koff.NAME);
    assertEquals(beer.getPrice(), Koff.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKoff() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.RedTabby.Koff";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Koff.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
