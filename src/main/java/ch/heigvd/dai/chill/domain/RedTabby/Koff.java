package ch.heigvd.dai.chill.domain.RedTabby;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Koff implements IProduct {

  public final static String NAME = "Koff";
  public final static BigDecimal PRICE = new BigDecimal(1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
