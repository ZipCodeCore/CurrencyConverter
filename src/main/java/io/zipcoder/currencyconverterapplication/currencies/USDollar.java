package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    @Override
    public CurrencyType getEnumType() {
        return CurrencyType.US_DOLLAR;
    }
}
