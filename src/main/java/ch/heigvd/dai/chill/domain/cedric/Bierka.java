package ch.heigvd.dai.chill.domain.cedric;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Bierka implements IProduct {

  public final static String NAME = "Bierka";
  public final static BigDecimal PRICE = new BigDecimal(3.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
