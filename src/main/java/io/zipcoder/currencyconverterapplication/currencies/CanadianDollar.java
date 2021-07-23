package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        Double universalAmount = currencyType.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
        return universalAmount;
    }
}
