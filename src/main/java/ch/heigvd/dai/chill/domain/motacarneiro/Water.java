package ch.heigvd.dai.chill.domain.motacarneiro;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Water implements IProduct {

  public final static String NAME = "Water";
  public final static BigDecimal PRICE = new BigDecimal(4.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
