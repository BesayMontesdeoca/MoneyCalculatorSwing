package moneycalculatorswing.control;

import moneycalculatorswing.model.Currency;
import moneycalculatorswing.model.ExchangeRate;
import moneycalculatorswing.model.Money;
import moneycalculatorswing.model.MoneyExchanger;
import moneycalculatorswing.persistance.MockExchangeRateLouder;
import moneycalculatorswing.ui.CurrencyDialog;
import moneycalculatorswing.ui.MoneyDialog;
import moneycalculatorswing.ui.swing.MoneyDialogPanel;

public class CalculateCommand extends Command{

    private final MoneyDialog moneyDialog;
    private final CurrencyDialog currencyDialog;

    public CalculateCommand(MoneyDialog moneyDialog, CurrencyDialog currencyDialog) {
        this.moneyDialog = moneyDialog;
        this.currencyDialog = currencyDialog;
    }
    
    @Override
    public void execute() {
       Money money = moneyDialog.getMoney();
       Currency currency = currencyDialog.getCurrency();
       ExchangeRate exchangeRate = new MockExchangeRateLouder().load(money.getCurrency(),currency);
       Money result = MoneyExchanger.Exchange(money, exchangeRate);
       MoneyDialogPanel.refresh(result.getAmount().toString());
       System.out.println(moneyDialog.getMoney() + " " + currencyDialog.getCurrency());
    }

}
