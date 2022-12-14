package classes;

public class Person {
    private String name;
    private String cardMarket;
    private int bankAccount;

    public Person(String name, String cardMarket, int bankAccount) {
        this.name = name;
        this.cardMarket = cardMarket;
        this.bankAccount = bankAccount;
    }
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardMarket() {
        return cardMarket;
    }

    public void setCardMarket(String cardMarket) {
        this.cardMarket = cardMarket;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", card market: " + cardMarket +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
