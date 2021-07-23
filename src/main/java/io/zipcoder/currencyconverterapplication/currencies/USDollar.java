package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar extends CurrencyConverter implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currencyType) {
        Double universalAmount = currencyType.getRate() / CurrencyType.US_DOLLAR.getRate();
            return universalAmount;
    }
}
