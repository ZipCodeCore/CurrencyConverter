package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {

    CurrencyType getEnumType();     //this gets the currency type to convert to.

    default Double convert(CurrencyType currencyType) {

        return currencyType.getRate() /         //the currency you want to convert to

                this.getEnumType().getRate();   //the class you're in goes on the bottom.
    }
}


//Divide the amount of your currency you start with by the amount of foreign currency you get back.
//To calculate how much foreign currency you'll get with an exchange rate, divide the amount of money you're staring
//with by the exchange rate.

