package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.getType().getRate();
    }

    CurrencyType getType();

}
