package me.zwoosks;

import me.zwoosks.currencies.Currency;
import me.zwoosks.currencies.EuroCurrency;
import me.zwoosks.currencies.USDCurrency;

public class Main {

    public static void main(String[] args) {
        EuroCurrency account = new EuroCurrency(12113.52f);
        System.out.println("Current money on your account: " + account.toString());
        USDCurrency diposit = new USDCurrency(99.97f);
        account.add(diposit.toEURFloat());
        System.out.println("Current money on your account: " + account.toString());
    }

}