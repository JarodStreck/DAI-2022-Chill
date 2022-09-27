package ch.heigvd.dai.chill.domain.Cedro22;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class FilsDePomme implements IProduct {
    public static final String NAME = "Fils de Pomme";
    public static final BigDecimal PRICE = new BigDecimal(5.8);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
