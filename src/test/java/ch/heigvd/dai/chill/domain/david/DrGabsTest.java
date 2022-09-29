package ch.heigvd.dai.chill.domain.david;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.david.DrGabs;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrGabsTest {

  @Test
  void thePriceAndNameForDrGabsShouldBeCorrect() {
    DrGabs beer = new DrGabs();
    assertEquals(beer.getName(), DrGabs.NAME);
    assertEquals(beer.getPrice(), DrGabs.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForDrGabs() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.david.DrGabs";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = DrGabs.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
