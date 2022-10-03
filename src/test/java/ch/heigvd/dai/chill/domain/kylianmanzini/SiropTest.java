package ch.heigvd.dai.chill.domain.kylianmanzini;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.kylianmanzini.Sirop;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SiropTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Sirop beer = new Sirop();
    assertEquals(beer.getName(), Sirop.NAME);
    assertEquals(beer.getPrice(), Sirop.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.kylianmanzini.Sirop";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Sirop.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
