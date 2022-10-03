package ch.heigvd.dai.chill.domain.IronGG;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChocolatChaudTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    ChocolatChaud beer = new ChocolatChaud();
    assertEquals(beer.getName(), ChocolatChaud.NAME);
    assertEquals(beer.getPrice(), ChocolatChaud.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.IronGG.ChocolatChaud";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = ChocolatChaud.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
