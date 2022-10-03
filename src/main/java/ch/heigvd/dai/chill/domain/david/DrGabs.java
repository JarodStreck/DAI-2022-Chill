package ch.heigvd.dai.chill.domain.david;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class DrGabs implements IProduct {

  public final static String NAME = "DrGabs";
  public final static BigDecimal PRICE = new BigDecimal(6.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
