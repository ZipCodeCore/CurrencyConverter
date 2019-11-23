package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {

    CurrencyType rupeeType = CurrencyType.RUPEE;

    public CurrencyType getType(){
        return rupeeType;
    }
}


