package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {

    private CurrencyType type = CurrencyType.SINGAPORE_DOLLAR;

    @Override
    public CurrencyType getType() { return type; }

    @Override
    public Double convert(CurrencyType currencyType) {
        Double newMoney = currencyType.getRate();
        return newMoney/type.getRate();
    }
}
