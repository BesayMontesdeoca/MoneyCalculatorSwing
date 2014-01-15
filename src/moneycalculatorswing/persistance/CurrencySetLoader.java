package moneycalculatorswing.persistance;

import moneycalculatorswing.model.Currency;
import moneycalculatorswing.model.CurrencySet;

public class CurrencySetLoader {

    private static CurrencySetLoader instance;

    private CurrencySetLoader() {
    }

    public static CurrencySetLoader getInstance() {
        if (instance == null) {
            instance = new CurrencySetLoader();
        }
        return instance;
    }

    public void load() {
        CurrencySet currencySet = CurrencySet.getInstance();
        currencySet.add(new Currency("EUR", "Euro", "€"));
        currencySet.add(new Currency("USD", "dolar Americano", "$"));
        currencySet.add(new Currency("MON", "Nueva Moneda", "¿?"));
        currencySet.add(new Currency("GBP", "Libra Esterlina"));  
        currencySet.add(new Currency("CAD", "Dólar Canadiense"));  
        currencySet.add(new Currency("MXN", "Peso Mexicano"));  
        currencySet.add(new Currency("RUE", "Rublo Ruso"));  
        currencySet.add(new Currency("SER", "Corona Sueca"));  
        currencySet.add(new Currency("VEF", "Boívar Venezolano"));  
        currencySet.add(new Currency("ZAR", "Rand Sudafricano"));  
        currencySet.add(new Currency("IND", "Rupia India"));  
        currencySet.add(new Currency("ARS", "Peso Argentino"));  
        currencySet.add(new Currency("BRL", "Real Brazileño"));  
        currencySet.add(new Currency("CHF", "Franco Suizo")); 
    }
}
