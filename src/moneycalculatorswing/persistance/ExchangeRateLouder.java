package moneycalculatorswing.persistance;

import java.util.Date;
import moneycalculatorswing.model.Currency;
import moneycalculatorswing.model.ExchangeRate;

public interface ExchangeRateLouder {
    
    public ExchangeRate load(Currency from, Currency to, Date date);
    public ExchangeRate load(Currency from, Currency to);
}
