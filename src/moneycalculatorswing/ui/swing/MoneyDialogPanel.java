package moneycalculatorswing.ui.swing;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import moneycalculatorswing.model.Money;
import moneycalculatorswing.ui.CurrencyDialog;
import moneycalculatorswing.ui.MoneyDialog;
import moneycalculatorswing.model.Number;

public class MoneyDialogPanel extends JPanel implements MoneyDialog{

    private Number number;
    private String amount;
    private static JLabel result;
    private CurrencyDialog currencyDialog;

    public MoneyDialogPanel() {
        super(new FlowLayout(FlowLayout.LEFT));
        this.amount = "Introduzca cantidad";
        this.createComponents();
    }

    private JTextField createAmountField() {
        final JTextField textField = new JTextField(12);
        textField.setText(amount);
        textField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                amount = textField.getText();
            }
        });
        return textField;
    }

    private JPanel createCurrencyDialog() {
        CurrencyDialogPanel panel = new CurrencyDialogPanel();
        currencyDialog = panel;
        return panel;
    }

    private void createComponents() {
        result = createDestinationField();
        JPanel pan = new JPanel();
        pan.setLayout(new BoxLayout(pan, BoxLayout.Y_AXIS));
        pan.add(createAmountField());
        pan.add(new JPanel());
        pan.add(result);
        this.add(pan);
        this.add(createCurrencyDialog());
        
        

    }

    @Override
    public Money getMoney() {
        number = new Number(Double.parseDouble(amount));
        return new Money(number, currencyDialog.getCurrency());
    }
    private JLabel createDestinationField() {
        final JLabel textFielddestination = new JLabel();
        textFielddestination.setText("Cantidad convertida: ");
        return textFielddestination;
    }   
    public static void refresh(String number){
        result.setText("Cantidad convertida: " + number);
    }
    @Override
    public void execute() {
    }

}

