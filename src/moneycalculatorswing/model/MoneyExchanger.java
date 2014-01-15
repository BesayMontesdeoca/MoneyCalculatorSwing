package moneycalculatorswing.model;

public class MoneyExchanger {
    
    public static Money Exchange (Money money,ExchangeRate exchangeRate){
        int numerator = money.getAmount().getNumerator() * exchangeRate.getRate().getNumerator();
        int denominator = money.getAmount().getDenominator() * exchangeRate.getRate().getDenominator();
        Number result = new Number(numerator,denominator);
        return new Money(result,exchangeRate.getToCurrency());
    }
}
