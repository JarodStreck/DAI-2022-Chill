package ch.heigvd.dai.chill.domain.gogniat;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MortSubiteTest {

  @Test
  void thePriceAndNameForMortSubiteShouldBeCorrect() {
    MortSubite beer = new MortSubite();
    assertEquals(beer.getName(), MortSubite.NAME);
    assertEquals(beer.getPrice(), MortSubite.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMortSubite() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.gogniat.MortSubite";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = MortSubite.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
