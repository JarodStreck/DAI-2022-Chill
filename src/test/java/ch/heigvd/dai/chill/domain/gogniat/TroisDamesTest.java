package ch.heigvd.dai.chill.domain.gogniat;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TroisDamesTest {

  @Test
  void thePriceAndNameForTroisDamesIPAShouldBeCorrect() {
    TroisDames beer = new TroisDames();
    assertEquals(beer.getName(), TroisDames.NAME);
    assertEquals(beer.getPrice(), TroisDames.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTroisDames() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain..gogniat.TroisDames";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = TroisDames.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
