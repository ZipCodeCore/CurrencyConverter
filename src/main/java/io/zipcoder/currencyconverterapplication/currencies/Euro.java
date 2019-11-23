package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {

    CurrencyType euroMoola = CurrencyType.EURO;

    public CurrencyType getType(){
        return euroMoola;
    }
}
