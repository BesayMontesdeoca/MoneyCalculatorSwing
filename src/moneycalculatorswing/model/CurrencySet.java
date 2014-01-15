package moneycalculatorswing.model;

import java.util.ArrayList;
import java.util.HashSet;

public class CurrencySet extends HashSet<Currency> {

    private static CurrencySet instance;

    private CurrencySet() {
        super();
    }
    
    public static CurrencySet getInstance() {
        if (instance == null) 
            instance = new CurrencySet();
        return instance;
    }

    public Currency get(String code) {
        for (Currency currency : this) 
            if (currency.getCode().equalsIgnoreCase(code)) 
                return currency;
        return null;
    }
    public void show(){
        for (Currency currency : this) 
            System.out.println(currency);
    }
    
    public Currency[] search(String token){
    
        ArrayList<Currency> list = new ArrayList<Currency>();
        for (Currency currency : this) {
            if (currency.getCode().equalsIgnoreCase(token)) 
                list.add(currency);
            else if (currency.getSymbol().equalsIgnoreCase(token))
                list.add(currency);
            else if (currency.getName().contains(token))
                list.add(currency);
        }
        
    return list.toArray(new Currency[0]);
    }
    public String [] codeCurrencies(){
        Currency [] allCurrencies = instance.toArray(new Currency[0]);
        String [] codes = new String [allCurrencies.length];
        for (int i = 0; i < allCurrencies.length; i++) {
            codes[i] = allCurrencies[i].getCode();
        }
        return codes;
    }
}
