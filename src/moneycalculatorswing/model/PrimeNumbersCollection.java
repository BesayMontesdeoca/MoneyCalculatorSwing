package moneycalculatorswing.model;

import java.util.Iterator;

public class PrimeNumbersCollection implements Iterable<Integer>{
    
    private int prime;

    public PrimeNumbersCollection() {
        prime=1;
    }

    public int getNumber() {
        return prime;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                while(true)
                    if (isPrime(++prime)) return prime;
            }

            @Override
            public void remove() {}

            private boolean isPrime(int prime) {
                for (int i=2;i<prime;i++)
                    if (prime%i==0) return false;
                return true;
            }
        };
    }
    
    
}
