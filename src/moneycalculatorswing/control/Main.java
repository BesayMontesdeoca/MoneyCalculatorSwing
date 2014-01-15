package moneycalculatorswing.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import moneycalculatorswing.persistance.CurrencySetLoader;    
import moneycalculatorswing.ui.swing.ApplicationFrame;


public class Main {

    public static void main(String[] args) {
        CurrencySetLoader.getInstance().load();
        final CommandDictionary commandDictionary = new CommandDictionary();
        ActionListenerFactory factory = new ActionListenerFactory() {

            @Override
            public ActionListener getAction(final String action) {
                return new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        commandDictionary.get(action).execute();
                    }
                };
            }
        };
        final ApplicationFrame frame = new ApplicationFrame(factory);
        
        commandDictionary.register("calculate", new CalculateCommand(frame.getMoneyDialog(), frame.getCurrencyDialog()));
        commandDictionary.register("exit", new Command() {

            @Override
            public void execute() {
                frame.dispose();
            }
        });
    }
}