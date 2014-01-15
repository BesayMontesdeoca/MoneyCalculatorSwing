package moneycalculatorswing.ui;

import moneycalculatorswing.model.Currency;
import moneycalculatorswing.model.Money;

public interface MoneyViewer {

    public void show(Money money,Currency currency);
}
