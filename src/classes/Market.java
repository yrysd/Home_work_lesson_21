package classes;

import java.util.*;

public class Market implements service.Market {
    private static final Scanner scanenr = new Scanner(System.in);
    private static final Scanner getScanenr = new Scanner(System.in);
    private static List<Producty> producties = new ArrayList<>();
    private String name;
    private int BankAccount;

    public Market(String name, int bankAccount) {
        this.name = name;
        this.BankAccount = bankAccount;
    }

    public Market() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankAccount() {
        return BankAccount;
    }

    public void setBankAccount(int bankAccount) {
        BankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return
                "name: " + name + "\n" +
                        "Bank account: " + BankAccount;
    }


    @Override
    public void akzhia(List<Person> personList) {
        for (Person person : personList) {
            if (person.getCardMarket().equalsIgnoreCase("Globus")) {


            }
        }


    }


    public void satypAluu(List<Integer> integerList, List<Producty> tolgonPraducta, List<Producty> producties, Person namePerson, Market marketName) {
        while (true) {
            System.out.println("emne alasyz: ");
            String kaalo = scanenr.next();
            for (Producty product : tolgonPraducta) {
                if (kaalo.equals(product.getName())) {
                    producties.add(product);

                }
                System.out.println("dagy alasyzby(yes/no)");
                String dagy = scanenr.next();
                if (dagy.equalsIgnoreCase("no")) {
                    System.out.println("              check                ");
                    System.out.println("Aty: " + namePerson.getName());
                    System.out.println("Кайсыл маркеттен алды: " + marketName);

                    for (int i = 0; i < producties.size(); i++) {
                        System.out.println("Список товаров: " + producties.get(i).getName());

                    }
                    int counter = 0;
                    for (Producty producty1 : producties) {
                        counter += producty1.getPrice();

                    }
                    System.out.println("Общая стоимость товаров: " + counter + " som ");

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Спасибо за покупку!");
                    break;
                }
                break;


            }

        }
    }


    @Override
    public void pojalovatsa(List<String> pojalovatsa,List<Producty>producties) {

        System.out.println("What is your name? ");
        String personName = getScanenr.nextLine();

        System.out.println("КАНДАЙ  ДООНУЗ БАР ЖАЗЫНЫЗ: ");

        while (true) {

            String doo =  getScanenr.nextLine();

            pojalovatsa.add(doo);
            if (pojalovatsa.size() == 5) {
                producties.clear();
            }
        }



    }

    @Override
    public void check(List<Person> personList) {


    }

    @Override
    public void marketKoshuu(List<Market> markets) {
        System.out.println("n");
    }
}
