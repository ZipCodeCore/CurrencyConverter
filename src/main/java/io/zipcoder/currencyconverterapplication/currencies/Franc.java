package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {

    CurrencyType francType = CurrencyType.FRANC;

    public CurrencyType getType(){
        return francType;
    }

}


