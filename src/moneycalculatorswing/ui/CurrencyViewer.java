package moneycalculatorswing.ui;

import moneycalculatorswing.model.Currency;

public class CurrencyViewer {
    
    private Currency currency;

    public CurrencyViewer(Currency currency) {
        this.currency = currency;
    }
    public void show(){
        System.out.println(currency);
    }
}
