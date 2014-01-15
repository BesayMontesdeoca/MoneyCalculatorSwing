package moneycalculatorswing.model;

import java.util.Date;

public class ExchangeRate {

    private Currency fromCurrency;
    private Currency toCurrency;
    private Number rate;
    private Date date;

    public ExchangeRate(Currency fromCurrency, Currency toCurrency, Number rate, Date date) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.rate = rate;
        this.date = date;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public Number getRate() {
        return rate;
    }

    public Date getDate() {
        return date;
    }
}
