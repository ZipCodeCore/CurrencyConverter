package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / type.getRate();
    }
    private CurrencyType type = CurrencyType.FRANC;

    public CurrencyType getType() {
        return this.type;
    }
}
