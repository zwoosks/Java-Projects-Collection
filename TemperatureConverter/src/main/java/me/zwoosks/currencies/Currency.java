package me.zwoosks.currencies;

public abstract class Currency {

    private String type;
    private float amount;

    public Currency(String type, float amount) {
        this.type = type;
        this.amount = amount;
    }

    public float add(float toAdd) {
        amount = amount + toAdd;
        return amount;
    }

    public float subtract(float toSubtract) {
        amount = amount - toSubtract;
        return amount;
    }

    public float multiply(float factor) {
        amount = amount*factor;
        return amount;
    }

    public float divide(float quotient) {
        amount = amount/quotient;
        return amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public boolean typeMatches(Currency otherCurrency) {
        return type == otherCurrency.getType();
    }

    @Override
    public String toString() {
        return amount + " " + type;
    }

}
