package ch.heigvd.dai.chill.domain.zmoos;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Redbull implements IProduct {

  public final static String NAME = "Redbull";
  public final static BigDecimal PRICE = new BigDecimal(5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
