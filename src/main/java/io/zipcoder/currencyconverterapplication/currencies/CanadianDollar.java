package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {

    CurrencyType canadaType = CurrencyType.CANADIAN_DOLLAR;

    public CurrencyType getType(){
        return this.canadaType;
    }
}
