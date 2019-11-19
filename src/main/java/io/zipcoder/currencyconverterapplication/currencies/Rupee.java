package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / type.getRate();
    }
    private CurrencyType type = CurrencyType.RUPEE;

    public CurrencyType getType() {
        return this.type;
    }
}
