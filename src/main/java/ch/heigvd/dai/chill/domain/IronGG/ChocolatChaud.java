package ch.heigvd.dai.chill.domain.IronGG;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class ChocolatChaud implements IProduct {

  public final static String NAME = "Chocolat Chaud";
  public final static BigDecimal PRICE = new BigDecimal(1.);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
