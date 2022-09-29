package ch.heigvd.dai.chill.domain.kylianmanzini;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sirop implements IProduct {

  public final static String NAME = "Sirop";
  public final static BigDecimal PRICE = new BigDecimal(2.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
