package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    CurrencyType get();

    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.get().getRate();
    }
}
