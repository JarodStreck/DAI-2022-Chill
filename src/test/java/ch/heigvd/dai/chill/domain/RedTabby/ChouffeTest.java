package ch.heigvd.dai.chill.domain.RedTabby;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChouffeTest {

  @Test
  void thePriceAndNameForChouffeShouldBeCorrect() {
    Chouffe beer = new Chouffe();
    assertEquals(beer.getName(), Chouffe.NAME);
    assertEquals(beer.getPrice(), Chouffe.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForChouffe() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.RedTabby.Chouffe";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Chouffe.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
