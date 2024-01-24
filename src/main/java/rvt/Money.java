package rvt;

public class Money {
    private final int euros;
    private final int cents;

    // Konstruktors
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    // Publiskā funkcija, lai iegūtu cik euro ir
    public int euros() {
        return this.euros;
    }

    // Publiskā funkcija, lai iegūtu cik centi ir
    public int cents() {
        return this.cents;
    }

    // Pārveido objektu uz string tipu
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    // Saskaita naudu kopā
    public Money plus(Money money) {
        int sum = (money.euros() + euros) * 100 + money.cents() + cents;
        return new Money(sum / 100, sum % 100);
    }

    // Atņem no esošā naudas objekta citu naudas daudzumu
    public Money minus(Money money) {
        int sum = (euros - money.euros()) * 100 + cents - money.cents();
        if (sum < 0) return new Money(0, 0);
        return new Money(sum / 100, sum % 100);
    }

    // Pārbauda vai šī nauda ir mazāka par citu naudas objektu
    public boolean lessThan(Money money) {
        int sum = (euros - money.euros()) * 100 + cents - money.cents();
        return sum < 0;
    }
}
