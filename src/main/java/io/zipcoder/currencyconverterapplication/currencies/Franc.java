package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return ConvertableCurrency.super.convert(currencyType);
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.FRANC;
    }
}
