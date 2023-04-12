package me.zwoosks.currencies;

public class EuroCurrency extends Currency {

    public EuroCurrency(float amount) {
        super("EUR", amount);
    }

    public float toUSDFloat() {
        return getAmount()*1.09f;
    }

    public USDCurrency toUSD() {
        return new USDCurrency(toUSDFloat());
    }

}
