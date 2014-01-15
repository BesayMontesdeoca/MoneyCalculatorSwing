
package moneycalculatorswing.persistance;

import java.util.Date;
import moneycalculatorswing.model.Currency;
import moneycalculatorswing.model.ExchangeRate;


public class MockExchangeRateLouder implements ExchangeRateLouder{
    
    
    public ExchangeRate load(Currency from, Currency to, Date date){
        moneycalculatorswing.model.Number rate = new moneycalculatorswing.model.Number(1.5);
        return new ExchangeRate (from,to,rate,date);
    }
    public ExchangeRate load(Currency from, Currency to){
        return load(from,to,new Date());
    }
}
