import classes.Gender;
import classes.Market;
import classes.Person;
import classes.Producty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Producty> producties = new ArrayList<>();
    private static List<Integer> integerList = new ArrayList<>();
    private static List<String> doo = new ArrayList<>();
    private static List<Person> person = new ArrayList<>();
    private static Person person1 = new Person("Keldibek", "Globus", 3000, "Trener Foodbol", Gender.MALE);

    public static void main(String[] args) {


        List<Producty> producties1 = new ArrayList<>(Arrays.asList(
                new Producty("Et", 600, "kyrgyzstan"),
                new Producty("Sut", 60, "kyrgyzstan"),
                new Producty("Nan", 25, "kyrgyzstan"),
                new Producty("Makaron", 60, "kyrgyzstan"),
                new Producty("Alma", 50, "kyrgyzstan"),
                new Producty("Banan", 40, "Africa"),
                new Producty("Alcha", 60, "kyrgyzstan"),
                new Producty("Shabdaly", 70, "kyrgyzstan"),
                new Producty("Oruk", 100, "kyrgyzstan"),
                new Producty("Darbyz", 150, "kyrgyzstan"),
                new Producty("Kolbasa", 300, "kyrgyzstan"),
                new Producty("Jumurtka", 10, "kyrgyzstan"),
                new Producty("Balyk", 400, "kyrgyzstan"),
                new Producty("Syr", 160, "kyrgyzstan"),
                new Producty("Kartoshka", 40, "kyrgyzstan")
        ));


        person.add(new Person("Yryskeldi", "Globus", 2000000000, "Progremmer", Gender.MALE));
        person.add(new Person("Altynbek", "Kochmon", 10000, "Businessmen", Gender.MALE));
        person.add(new Person("Saltanat", "Azia-Moll", 5000, "deputat", Gender.FEMALE)); ///////   <PERSON> classynyn ОБЪЕКТИСИ!!


        Market market1 = new Market();

        List<Market> market = new ArrayList<>(Arrays.asList(
                new Market("Globus", 1000000, 100000000, 150, "ШЕРАЛИ КЕЛДИБЕКОВИЧ"),
                new Market("Azia Mol", 500000, 20000000, 100, "ШЕРАЛИ КЕЛДИБЕКОВИЧ"),
                new Market("Kochmon", 300000, 50000000, 60, "ШЕРАЛИ КЕЛДИБЕКОВИЧ"),
                new Market("Ala-Too", 50000, 10000000, 85, "ШЕРАЛИ КЕЛДИБЕКОВИЧ")
        ));


        while (true) {
            commands();
            System.out.println("COMMAND: ");
            int input = scanner.nextInt();
            switch (input) {

                case 1:
                    Person person2 = new Person();
                    person2.getVip();
                    Market market2 = new Market("GLOBUS", 100000, 100000000, 150, "ШЕРАЛИ КЕЛДИБЕКОВИЧ");
                    market2.setKluch(1212);
                    System.out.println("|~~~~~~~~~~~~~~~~~ * GLOBUS * ~~~~~~~~~~~~~~~~|");
                    method();
                    int num = scanner.nextInt();
                    if (num == 1) {
                        System.out.println("                  _ PRODUCT _                 ");
                        market1.satypAluu(integerList, producties1, producties, person1, market2);

                    } else if (num == 2) {
                        market1.pojalovatsa(doo, producties1);
                    } else if (num == 3) {
                        market1.marketKoshuu(market);
                    } else if (num == 4) {
                        market1.markettiSatypAluu(person, market2, person2, market);
                    } else if (num == 5) {
                        market1.markettiJaapSaluu(person, person2, market2, market);
                    } else if (num == 6) {
                        market1.jumushkaAluu(person, market2);
                    } else if (num == 7) {
                        market1.jumushchulardyIshtenBoshoguu(market, person, market2);
                    } else if (num == 8) {
                        System.out.println(market1.markettinAkchasynAluu(market, market2, person));
                    } else if (num == 9) {
                        market1.salykToloo(person, market, market2, person2);
                    } else if (num == 10) {
                        System.out.println(market1.markettegiJumushculardynSanynBiluu(market, market2));
                    } else if (num == 11) {
                        market2.markettinMaalymatynKoruu(market, market2);
                    } else if (num == 12) {
                        market1.PersonInfo(person);
                    }

                    break;
                case 2:
                    Person person3 = new Person();
                    person3.getVip();
                    Market market3 = new Market("AZIA - MOL", 300000, 20000000, 100, "ШЕРАЛИ КЕЛДИБЕКОВИЧ");
                    market3.setKluch(3434);
                    System.out.println("|~~~~~~~~~~~~~~~~~ * AZIA - MOL * ~~~~~~~~~~~~~~~~|");

                    method();
                    int num1 = scanner.nextInt();
                    if (num1 == 1) {
                        System.out.println("                  _ PRODUCTY _                 ");
                        market1.satypAluu(integerList, producties1, producties, person1, market3);

                    } else if (num1 == 2) {
                        market1.pojalovatsa(doo, producties1);
                    } else if (num1 == 3) {
                        market1.marketKoshuu(market);
                    } else if (num1 == 4) {
                        market1.markettiSatypAluu(person, market3, person3, market);
                    } else if (num1 == 5) {
                        market1.markettiJaapSaluu(person, person3, market3, market);
                    } else if (num1 == 6) {
                        market1.jumushkaAluu(person, market3);
                    } else if (num1 == 7) {
                        market1.jumushchulardyIshtenBoshoguu(market, person, market3);
                    } else if (num1 == 8) {
                        System.out.println(market1.markettinAkchasynAluu(market, market3, person));
                    } else if (num1 == 9) {
                        market1.salykToloo(person, market, market3, person3);
                    } else if (num1 == 10) {
                        System.out.println(market1.markettegiJumushculardynSanynBiluu(market, market3));
                    } else if (num1 == 11) {
                        market3.markettinMaalymatynKoruu(market, market3);
                    } else if (num1 == 12) {
                        market1.PersonInfo(person);
                    }
                    break;

                case 3:
                    Person person4 = new Person();
                    person4.getVip();
                    Market market4 = new Market("KOCHMON", 100000, 50000000, 60, "ШЕРАЛИ КЕЛДИБЕКОВИЧ");
                    market4.setKluch(4545);
                    System.out.println("|~~~~~~~~~~~~~~~~~ * KOCHMON * ~~~~~~~~~~~~~~~~|");


                    method();
                    int num3 = scanner.nextInt();
                    if (num3 == 1) {
                        System.out.println("                  _ PRODUCTY _                 ");
                        market1.satypAluu(integerList, producties1, producties, person1, market4);

                    } else if (num3 == 2) {
                        market1.pojalovatsa(doo, producties1);
                    } else if (num3 == 3) {
                        market1.marketKoshuu(market);
                    } else if (num3 == 4) {
                        market1.markettiSatypAluu(person, market4, person4, market);
                    } else if (num3 == 5) {
                        market1.markettiJaapSaluu(person, person4, market4, market);
                    } else if (num3 == 6) {
                        market1.jumushkaAluu(person, market4);
                    } else if (num3 == 7) {
                        market1.jumushchulardyIshtenBoshoguu(market, person, market4);
                    } else if (num3 == 8) {
                        System.out.println(market1.markettinAkchasynAluu(market, market4, person));
                    } else if (num3 == 9) {
                        market1.salykToloo(person, market, market4, person4);
                    } else if (num3 == 10) {
                        System.out.println(market1.markettegiJumushculardynSanynBiluu(market, market4));
                    } else if (num3 == 11) {
                        market4.markettinMaalymatynKoruu(market, market4);
                    } else if (num3 == 12) {
                        market1.PersonInfo(person);
                    }
                    break;

                case 4:

                    Person person5 = new Person();
                    person5.getVip();
                    Market market5 = new Market("ALA - TOO", 100000, 10000000, 85, "ШЕРАЛИ КЕЛДИБЕКОВИЧ");
                    market5.setKluch(5656);
                    System.out.println("|~~~~~~~~~~~~~~~~~ * ALA - TOO * ~~~~~~~~~~~~~~~~|");


                    method();
                    int num4 = scanner.nextInt();
                    if (num4 == 1) {
                        System.out.println("                  _ PRODUCTY _                 ");
                        market1.satypAluu(integerList, producties1, producties, person1, market5);

                    } else if (num4 == 2) {
                        market1.pojalovatsa(doo, producties1);
                    } else if (num4 == 3) {
                        market1.marketKoshuu(market);
                    } else if (num4 == 4) {
                        market1.markettiSatypAluu(person, market5, person5, market);
                    } else if (num4 == 5) {
                        market1.markettiJaapSaluu(person, person5, market5, market);
                    } else if (num4 == 6) {
                        market1.jumushkaAluu(person, market5);
                    } else if (num4 == 7) {
                        market1.jumushchulardyIshtenBoshoguu(market, person, market5);
                    } else if (num4 == 8) {
                        System.out.println(market1.markettinAkchasynAluu(market, market5, person));
                    } else if (num4 == 9) {
                        market1.salykToloo(person, market, market5, person5);
                    } else if (num4 == 10) {
                        System.out.println(market1.markettegiJumushculardynSanynBiluu(market, market5));
                    } else if (num4 == 11) {
                        market5.markettinMaalymatynKoruu(market, market5);
                    } else if (num4 == 12) {
                        market1.PersonInfo(person);
                    }
                    break;
                default:
                    System.out.println("МЫНДАЙ КОМАНДА ЖОК!");


            }
        }
    }

    public static void commands() {
        System.out.println("""
                1. GLOBUS
                2. AZIA - MOL
                3. KOCHMON
                4. ALA - TOO
                """);
    }

    public static void method() {
        System.err.println("ЭСКЕРТУУ БУЛ ЖАКТАГЫ АДАМДЫН <МААЛЫМАТЫН> СУРАГАН ЖЕРЛЕРДЕ <(Person class)> ОБЪЕКТИСИН  КОЛДОНУНУЗ! ИЙГИЛИК😊");
        System.out.println("""
                1. САТЫП АЛУУ
                2. ДОО
                3. МАРКЕТ КОШУУ
                4. МАРКЕТТИ САТЫП АЛУУ
                5. МАРКЕТТИ ЖААП САЛУУ
                6. ЖУМУШЧУЛАРДЫ ИШКЕ АЛУУ
                7. ЖУМУШЧУЛАРДЫ ИШТЕН БОШОТУУ
                8. МАРКЕТТИН КАССАСЫНДАГЫ АКЧАНЫ АЛУУ
                9. САЛЫК БЕРУУ (МАМЛЕКЕТКЕ)
                10. МАРКЕТТЕГИ ЖУМУШЧУЛАРДЫН САНЫН БИЛУУ 
                11. МАРКЕТТИН МААЛЫМАТЫН КОРУУ
                12. АДАМДЫН МААЛЫМАТЫН КОРУУ
                """);
    }

}