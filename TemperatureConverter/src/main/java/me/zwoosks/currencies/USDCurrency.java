package me.zwoosks.currencies;

public class USDCurrency extends Currency {

    public USDCurrency(float amount) {
        super("USD", amount);
    }

    public float toEURFloat() {
        return getAmount()/1.09f;
    }

    public EuroCurrency toEUR() {
        return new EuroCurrency(toEURFloat());
    }

}
