package ch.heigvd.dai.chill.domain.motacarneiro;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaterTest {

  @Test
  void thePriceAndNameForWaterShouldBeCorrect() {
    Water beer = new Water();
    assertEquals(beer.getName(), Water.NAME);
    assertEquals(beer.getPrice(), Water.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForWater() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.motacarneiro.Water";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Water.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
