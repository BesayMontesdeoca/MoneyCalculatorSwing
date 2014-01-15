package moneycalculatorswing.ui.swing;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import moneycalculatorswing.model.CurrencySet;

public class CurrencyPanel extends JPanel {

    private static String[] currencies;

    public CurrencyPanel() {
        this.add(createComboBox());
        currencies = CurrencySet.getInstance().codeCurrencies();
    }

    private JComboBox createComboBox() {
        JComboBox comboBox = new JComboBox(currencies);
        return comboBox;
    }

}
