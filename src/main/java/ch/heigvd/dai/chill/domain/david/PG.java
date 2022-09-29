package ch.heigvd.dai.chill.domain.david;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class PG implements IProduct {

  public final static String NAME = "Prix Garantie";
  public final static BigDecimal PRICE = new BigDecimal(1.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
