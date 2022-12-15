package classes;

import java.util.List;
import java.util.Map;

public class Person {
    private String vip;
    private String name;
    private String cardMarket;
    private int bankAccount;
    private Gender gender;
    private String placeOfWork;


    public Person(String name, String cardMarket, int bankAccount,String placeOfWork,Gender gender) {
        this.name = name;
        this.cardMarket = cardMarket;
        this.bankAccount = bankAccount;
        this.placeOfWork = placeOfWork;
        this.gender = gender;
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

    public String getPlaceOfWork() {
        return placeOfWork;
    }



    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return
                "| name: " + name + "\n" +
                "| cardMarket: " + cardMarket + "\n" +
                "| bankAccount: " + bankAccount +"\n"+
                "| gender: " + gender +"\n"+
                "| placeOfWork: " + placeOfWork + "\n";
    }
}
