package classes;

import java.util.*;

public class Market implements service.Market {
    private static final Scanner scanenr = new Scanner(System.in);
    private static final Scanner getScanenr = new Scanner(System.in);
    private static List<Producty> producties = new ArrayList<>();
    private String name;
    private String vladeles;
    private int BankAccount;
    private int MarketPrice;
    private int numberOfPerson;
    private int kluch;


    public Market(String name, int bankAccount, int MarketPrice, int numberOfPerson,String vladeles) {
        this.name = name;
        this.BankAccount = bankAccount;
        this.MarketPrice = MarketPrice;
        this.numberOfPerson = numberOfPerson;
        this.vladeles  = vladeles;
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

    public int getMarketPrice() {
        return MarketPrice;
    }

    public void setMarketPrice(int marketPrice) {
        MarketPrice = marketPrice;
    }


    public int getKluch() {
        return kluch;
    }

    public void setKluch(int kluch) {
        this.kluch = kluch;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public String getVladeles() {
        return vladeles;
    }

    public void setVladeles(String vladeles) {
        this.vladeles = vladeles;
    }

    @Override
    public String toString() {
        return
                "*~~~~~~~~~~~~ * INFO * ~~~~~~~~~~~~~~*" + "\n" +
                        "*Name-> " + name + "\n" +
                        "*BankAccount->  " + BankAccount + "\n" +
                        "*Number of person->  " + numberOfPerson + "\n" +
                        "*Vladeles-> "+vladeles+"\n"+
                        "*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*" + "\n";
    }

    @Override
    public void akzhia(List<Person> personList) {
        for (Person person : personList) {
            if (person.getCardMarket().equalsIgnoreCase("Globus")) {


            }
        }


    }


    public void satypAluu(List<Integer> integerList, List<Producty> tolgonPraducta, List<Producty> producties, Person namePerson, Market marketName) {
        System.out.println(tolgonPraducta);
        System.out.println("ЭМНЕ АЛАСЫЗ?");
        String tovarName = getScanenr.nextLine();
        for (Producty producty1:tolgonPraducta) {
            if(tovarName.trim().equalsIgnoreCase(producty1.getName())){
                producties.add(producty1);
                while (true) {
                    System.out.println("ДАГЫ САТЫП АЛАСЫЗБЫ? (yes/no)");
                    String yesNo = getScanenr.nextLine();
                    if (yesNo.trim().equalsIgnoreCase("yes")) {
                        System.out.println("ЭМНЕ АЛАСЫЗ?");
                        String tovar = getScanenr.nextLine();
                        if (tovar.trim().equalsIgnoreCase(producty1.getName())) {
                            producties.add(producty1);
                        }

                    } else {
                        int i = 0;

                        for (Producty producty : producties) {

                            i += producty.getPrice();


                            System.out.printf("""
                                    | ~~~~~~~~~~~~ * CHECK * ~~~~~~~~~~~ |
                                    | Name: %s
                                    | Tovar: %s
                                    | Price: %s
                                    | ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ |
                                    | ~~~~~~~~СООДАНЫЗГА РАХМАТ~~~~~~~~~ |
                                    """, namePerson.getName(),producty.getName() , i);
                        }
                        break;

                    }
                }


            }
        }

    }


    @Override
    public void pojalovatsa(List<String> pojalovatsa, List<Producty> producties) {

        System.out.println("What is your name? ");
        String personName = getScanenr.nextLine();

        System.out.println("КАНДАЙ  ДООНУЗ БАР ЖАЗЫНЫЗ: ");

        while (true) {

            String doo = getScanenr.nextLine();


            pojalovatsa.add(personName);
            pojalovatsa.add(doo);
            System.out.println("СИЗДИН ДООНУЗ: " + pojalovatsa);
            break;

        }


    }

    @Override
    public void check(List<Person> personList) {


    }

    @Override
    public void marketKoshuu(List<Market> markets) {
        System.out.println("n");
    }

    @Override
    public String markettiSatypAluu(List<Person> personList, Market market, Person person,List<Market>markets) {
        System.out.println("АТЫНЫЗ КИМ?");
        String name = getScanenr.nextLine();
        System.out.println("JASHYNYZ KANCHADA?");
        int age = scanenr.nextInt();
        System.out.println("ЖЫНЫСЫНЫЗДЫ ЖАЗЫНЫЗ:");
        String gender = getScanenr.nextLine();
        System.out.println("КАНДАЙ ЖУМУШТА ИШТЕЙСИЗ?");
        String work = getScanenr.nextLine();
        for (Person person1 : personList) {
            if (name.trim().equalsIgnoreCase(person1.getName())) {
                if (work.trim().equalsIgnoreCase(person1.getPlaceOfWork())) {
                    System.out.printf(" \nСАЛАМАТСЫЗБЫ МЕНИН АТЫМ: ШЕРАЛИ КЕЛДИБЕКОВИЧ, МЕН %s МАРКЕТИНИН ДИРЕКТОРУ БОЛОМ. ", market.getName());
                    System.err.printf("\n%s: ТАНДАНЫЗ!  ", name);

                    System.out.println("\n1.САЛАМАТЧЫЛЫК, МЕНИН АТЫМ _ УШУЛ СИЗДИН _ МАРКЕТИНИЗДИ САТЫП АЛАЙЫН ДЕДИМ ЭЛЕ. ");
                    int num = scanenr.nextInt();
                    if (num == 1) {
                        System.out.printf("\nСАЛАМАТЧЫЛЫК, МЕНИН АТЫМ %s УШУЛ СИЗДИН %s МАРКЕТИНИЗДИ САТЫП АЛАЙЫН ДЕДИМ ЭЛЕ. ", name, market.getName());
                    }
                    System.out.printf("\nШЕРАЛИ КЕЛДИБЕКОВИЧ: САТЫП АЛГЫНЫЗ КЕЛСЕ, БААСЫ:  %d ", market.getMarketPrice());
                    System.out.println("\nАКЧАСЫН НАКТАЛАЙ  ТОЛОЙСУЗ! (yes/no)");
                    String yesNo = getScanenr.nextLine();
                    for (Market market1 : markets) {

                    if (yesNo.trim().equalsIgnoreCase("yes")) {
                        if (person1.getBankAccount() < market.getMarketPrice()) {
                            System.out.println("АКЧАНЫЗ ЖЕТПЕЙТ ЭКЕН!");
                            break;
                        } else {
                            int summa = person1.getBankAccount() - market.getMarketPrice();
                            System.out.printf("\nСИЗДИН КАЛГАН  АКЧАНЫЗ:  %s", summa + "\n");
                            if (gender.trim().equalsIgnoreCase(Gender.FEMALE.name())) {
                                personList.add(new Person(name, market.getName(), summa, work, Gender.FEMALE));
                                person.setVip("VIP");
                                market1.setVladeles(person1.getName());
                                System.out.println(market1);

                            } else {
                                personList.add(new Person(name, market.getName(), summa, work, Gender.MALE));
                                person.setVip("VIP");
                                market1.setVladeles(person1.getName());
                                System.out.println(market1);

                            }
                            System.out.println("\nКУТТУКТАЙМ СИЗ ИЙГИЛИКТУУ САТЫП АЛДЫНЫЗ!!");
                            return "\nКУТТУКТАЙМ СИЗ ИЙГИЛИКТУУ САТЫП АЛДЫНЫЗ!!";


                        }


                    } else {

                        System.out.printf("ШЕРАЛИ КЕЛДИБЕКОВИЧ: АНДА  %s МАРКЕТИ САТЫЛБАЙТ!", market.getName());
                        break;
                    }
                }


                    } else {




                }
            }
        }

        return "КЕЧИРЕСИЗ СИЗ МАРКЕТТИ САТЫП АЛА АЛБАЙСЫЗ! СЕБЕБИ СИЗДИН ЖУМУШУНУЗДУН ДЕНГЭЭЛИ САТЫП АЛГАНГА ЖЕТПЕЙТ!";
    }

    @Override
    public void jumushkaAluu(List<Person> person, Market market) {
        System.out.println("АТЫНЫЗ КИМ?");
        String name = getScanenr.nextLine();
        System.out.println("ЖАЩЫНЫЗ КАНЧАДА?");
        int age = scanenr.nextInt();
        System.out.println("ЖЫНЫСЫНЫЗДЫ ЖАЗЫНЫЗ (MALE / FEMALE): ");
        String gender = getScanenr.nextLine();
        System.out.println("СТАЖЫНЫЗДЫ ЖАЗЫНЫЗ? ");
        double opytRaboty = scanenr.nextDouble();
        int satuuchu = 25000;
        int uborshik = 20000;
        int ohrana = 30000;
        if (opytRaboty < 10 && opytRaboty >= 0.5) {
            System.out.printf("""
                    1.САТУУЧУ (ЗП) = %d
                    2.УБОРЩИК (ЗП) = %d
                    3.ОХРАНА  (ЗП) = %d
                    """, uborshik, uborshik, ohrana);
            System.out.println("ТАНДАНЫЗ: ");
            int tandoo = scanenr.nextInt();

            if (tandoo == 1) {
                if (gender.trim().equalsIgnoreCase(Gender.MALE.name())) {
                    person.add(new Person(name, market.getName(), satuuchu, "Satuucu", Gender.MALE));
                    market.setNumberOfPerson(market.getNumberOfPerson() + 1);
                } else {
                    person.add(new Person(name, market.getName(), satuuchu, "Satuucu", Gender.FEMALE));
                    market.setNumberOfPerson(market.getNumberOfPerson() + 1);
                }

                System.out.println("КУТТУКТАЙМ ЖУМУШКА АЛЫНДЫНЫЗ!");

                System.out.printf("""
                        ||*~~~~~~~~~* Name: %s *~~~~~~~~~~*||
                        ||* Age: %s                       *||
                        ||* Doljnost: САТУУЧУ             *||
                        ||* КЛЮЧ: %s                      *||
                        ||*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*||
                        """, name, age, market.getKluch());
            } else if (tandoo == 2) {
                if (gender.trim().equalsIgnoreCase(Gender.MALE.name())) {
                    person.add(new Person(name, market.getName(), satuuchu, "Satuucu", Gender.MALE));
                    market.setNumberOfPerson(market.getNumberOfPerson() + 1);
                } else {
                    person.add(new Person(name, market.getName(), satuuchu, "Satuucu", Gender.FEMALE));
                    market.setNumberOfPerson(market.getNumberOfPerson() + 1);
                }
                System.out.println("КУТТУКТАЙМ ЖУМУШКА АЛЫНДЫНЫЗ!");
                System.out.printf("""
                        ||*~~~~~~~~~* Name: %s *~~~~~~~~~~*||
                        ||* Age: %s                       *||
                        ||* Doljnost: УБОРЩИК             *||
                        ||* КЛЮЧ: %s                      *||
                        ||*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*||
                        """, name, age, market.getKluch());

            } else {
                if (gender.trim().equalsIgnoreCase(Gender.MALE.name())) {
                    person.add(new Person(name, market.getName(), satuuchu, "Satuucu", Gender.MALE));
                    market.setNumberOfPerson(market.getNumberOfPerson() + 1);
                } else {
                    person.add(new Person(name, market.getName(), satuuchu, "Satuucu", Gender.FEMALE));
                    market.setNumberOfPerson(market.getNumberOfPerson() + 1);

                }
                System.out.println("КУТТУКТАЙМ ЖУМУШКА АЛЫНДЫНЫЗ!");
                System.out.printf("""
                        ||*~~~~~~~~~* Name: %s *~~~~~~~~~~*||
                        ||* Age: %s                       *||
                        ||* Doljnost:   ОХРАНА            *||
                        ||* КЛЮЧ: %s                      *||
                        ||*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*||
                        """, name, age, market.getKluch());
            }
        } else if (opytRaboty <= 30 && opytRaboty >= 10) {
            if (gender.trim().equalsIgnoreCase(Gender.MALE.name())) {
                person.add(new Person(name, market.getName(), satuuchu, "Satuucu", Gender.MALE));
                market.setNumberOfPerson(market.getNumberOfPerson() + 1);
            } else {
                person.add(new Person(name, market.getName(), satuuchu, "Satuucu", Gender.FEMALE));
                market.setNumberOfPerson(market.getNumberOfPerson() + 1);
            }
            System.out.println("КУТТУКТАЙМ ЖУМУШКА АЛЫНДЫНЫЗ!");
            System.out.printf("""
                    // * ~~~~~~~~~~ ** %s ** ~~~~~~~~~ *//
                    // * AGE: %s                       *//
                    // * DOLJNOST: АДМИНИСТРАТОР       *//
                    // * KLUCH: %s                     *//
                    // * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ *//
                    """, name, age, market.getKluch());
        }


    }

    @Override
    public void markettiJaapSaluu(List<Person> personList, Person person, Market market, List<Market> markets) {
        System.out.println("What is your name?");
        String name = getScanenr.nextLine();
        System.out.println("Write kluch market: ");
        int kluch = scanenr.nextInt();
        for (Person person1 : personList) {
            if (kluch == market.getKluch() || name.trim().equalsIgnoreCase(person1.getName()) || person.getVip().equalsIgnoreCase("vip")) {
                System.out.println("JAABASYZBY? (yes / no)");
                String yesNo = getScanenr.nextLine();
                if (yesNo.trim().equalsIgnoreCase("yes")) {
                    markets.clear();
                    break;

                } else {
                    System.out.println("MARKET ACHYK!");
                    break;
                }
            }

        }


    }

    @Override
    public void markettinMaalymatynKoruu(List<Market> markets, Market market) {
        for (Market market1 : markets) {
            if (market1.getName().equalsIgnoreCase(market.getName())) {
                System.out.println(market1);
            }
        }

    }

    @Override
    public void jumushchulardyIshtenBoshoguu(List<Market> markets, List<Person> personList, Market market) {
        System.out.println("What is your name?");
        String name = getScanenr.nextLine();
        System.out.println("Write kluch:");
        int kluch = scanenr.nextInt();
        for (Person person : personList) {
            if (name.trim().equalsIgnoreCase(person.getName()) || kluch == market.getKluch()) {
                System.out.println("АНЧА ЖУМУШЧУНУ ИШТЕН АЛГЫНЫЗ КЕЛИП ЖАТАТ?");
                int number = scanenr.nextInt();
                if(number < 50){
                    market.setNumberOfPerson(market.getNumberOfPerson() - number);
                    System.out.println("Number of Persons: "+market.getNumberOfPerson());
                    break;
                }else {
                    System.out.println("СИЗ БИР УБАКТА 50 ДОН АШЫК ЖУМУШЧУНУ ИШТЕН АЛА АЛБАЙСЫЗ!  ");
                    break;
                }
            }
        }


    }

    @Override
    public String markettinAkchasynAluu(List<Market>markets,Market market,List<Person>personList) {
        for (Market market1:markets) {
            if(market1.getName().trim().equalsIgnoreCase(market.getName()) ){
                System.out.println("What is your name?");
                String name = getScanenr.nextLine();
                for (Person person:personList) {
                    if(name.trim().equalsIgnoreCase(person.getName()) ||  person.getVip().trim().equalsIgnoreCase("VIP")){
                        System.out.println("Bank Account: "+market1.getBankAccount());
                        System.out.println("aluu / kaitaruu");
                        String aluuKaitaruu = getScanenr.nextLine();
                        if(aluuKaitaruu.trim().equalsIgnoreCase("aluu")){
                            person.setBankAccount(person.getBankAccount() + market1.getBankAccount());
                            int bankAccount = 0;
                            market1.setBankAccount(bankAccount);

                            System.out.println("Bank Account: "+person.getBankAccount());
                            break;


                        }else {
                            System.out.println("ДОБРОВОГО ВАМ ДНЯ!");
                            break;
                        }


                    }else {
                        System.out.println("СИЗДИН АККАУНТУНУЗ (VIP) ЭМЕС!");
                        break;
                    }
                }
                break;
            }
        }


        return "ДОБРОВОГО ВАМ ДНЯ!";
    }

    @Override
    public void PersonInfo(List<Person>personList) {
        System.out.println("What is your name?");
        String name = getScanenr.nextLine();
        for (Person person:personList) {
            if(name.trim().equalsIgnoreCase(person.getName())){
                System.out.println(person);

            }
        }

    }

    @Override
    public void salykToloo(List<Person>personList,List<Market>markets,Market market1,Person person1) {
        System.out.println("АТЫНЫЗ КИМ? (САЛЫК АЛА ТУРГАН АДАМ)");

        for (Market market:markets) {
            if (market.getName().trim().equalsIgnoreCase(market1.getName())) {


                for (Person person : personList) {
                    String name = getScanenr.nextLine();
                    System.out.println("КАЙСЫЛ МЕКЕМЕДЕН КЕЛДИНИЗ? -> (kg.salyk)");
                    String mekeme = getScanenr.nextLine();
                    if (mekeme.trim().equalsIgnoreCase("kg.salyk")) {
                        System.out.println("САЛЫКТЫН ОЛЧОМУ КАНЧА?");
                        int salyk = scanenr.nextInt();
                        if (name.trim().equalsIgnoreCase(person.getName())) {
                            if (!(market.getBankAccount() <= 0)) {
                                market.setBankAccount(market.getBankAccount() - salyk);
                                System.out.println(market);
                                person.setBankAccount(person.getBankAccount() + salyk);
                                System.out.println(person);
                                break;
                            } else {
                                    if (person1.getVip().trim().equalsIgnoreCase("VIP")) {
                                        int i = person1.getBankAccount() - salyk;
                                        person1.setBankAccount(i);
                                        System.out.println(person1);
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                                        person.setBankAccount(person.getBankAccount() + salyk);
                                        System.out.println(person);
                                        break;

                                }
                            }

                        }
                    }


                }


            }

        }

    }

    @Override
    public Map<String, Integer> markettegiJumushculardynSanynBiluu(List<Market> markets,Market market) {
        Integer i = -1;
        Map<String,Integer> map = new HashMap<>();
        for (Market market1:markets) {

            if(market1.getName().equalsIgnoreCase(market.getName())){
                i++;
                map.put("Number of Person: ",market1.numberOfPerson);

            }
        }

        return map;
    }
}


