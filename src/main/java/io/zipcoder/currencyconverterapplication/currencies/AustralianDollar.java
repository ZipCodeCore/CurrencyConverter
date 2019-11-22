package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {


    @Override
    public CurrencyType getEnumType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}

//    Alternative:
//    CurrencyType type = CurrencyType.AUSTRALIAN_DOLLAR;
//
//    public CurrencyType getType() {
//        return type;
//    }