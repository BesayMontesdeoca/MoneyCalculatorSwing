package moneycalculatorswing.model;

public class Currency {

    private String code;
    private String name;
    private String symbol;

    public Currency(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;

    }

    public Currency(String code, String name) {
        this(code, name, "");
    }

    public Currency(Currency currency) {
        this(currency.getCode(), currency.getName(), currency.getSymbol());
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return code + "(" + name + ")" + symbol;
    }
}
