package ch.heigvd.dai.chill.domain.gogniat;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class TroisDames implements IProduct {

  public final static String NAME = "Trois Dames";
  public final static BigDecimal PRICE = new BigDecimal(7.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
