import classes.Market;
import classes.Person;
import classes.Producty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static  List<Producty> producties = new ArrayList<>();
    private static List<Integer>integerList  = new ArrayList<>();
    private static List<String> doo = new ArrayList<>();
    private static  Person person = new Person();
    public static void main(String[] args) {


        List<Producty> producties1 = new ArrayList<>(Arrays.asList(
                new Producty("Et", 600, "kyrgyzstan"),
                new Producty("Sut", 60, "kyrgyzstan"),
                new Producty("Nan", 25, "kyrgyzstan"),
                new Producty("Makaron", 60, "kyrgyzstan"),
                new Producty("Alma", 50, "kyrgyzstan"),
                new Producty("Bnan", 40, "Africa"),
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




               person =  new Person("Yryskeldi","Globus",2000);













        Market market1 = new Market();

        List<Market> market = new ArrayList<>(Arrays.asList(
                new Market("Globus", 1000000),
                new Market("Azia Mol", 500000),
                new Market("Kochmon", 300000),
                new Market("Ala-Too", 50000)
        ));



        commands();
        System.out.print("Command: ");
        int input = scanner.nextInt();



            switch (input) {
                case 1 :
                    Market market2 = new Market("Globus",100000);
                    System.out.println("|~~~~~~~~~~~~~~~~~ * GLOBUS * ~~~~~~~~~~~~~~~~|");
                    method();
                    int num = scanner.nextInt();
                    if (num == 1) {
                        System.out.println("                  _ PRODUCTY _                 ");
                        market1.satypAluu(integerList,producties1,producties,person,market2);

                    }else if(num == 2){
                        market1.pojalovatsa(doo,producties1);
                    } else if (num == 3) {
                        market1.marketKoshuu(market);
                    }

                    break;
                case 2:
                    Market market3 = new Market("Azia Mol",300000);
                    System.out.println("|~~~~~~~~~~~~~~~~~ * Azia Mol * ~~~~~~~~~~~~~~~~|");
                    System.out.println("                  _ PRODUCTY _                 ");
                    market1.satypAluu(integerList,producties1,producties,person,market3);

                case 3:
                    Market market4 = new Market("Kochmon",100000);
                    System.out.println("|~~~~~~~~~~~~~~~~~ * Kochmon * ~~~~~~~~~~~~~~~~|");
                    System.out.println("                  _ PRODUCTY _                 ");
                    market1.satypAluu(integerList,producties1,producties,person,market4);

                default:
                    Market market5 = new Market("Ala - Too",100000);
                  System.out.println("|~~~~~~~~~~~~~~~~~ * Ala - Too * ~~~~~~~~~~~~~~~~|");
                  System.out.println("                  _ PRODUCTY _                 ");
                    market1.satypAluu(integerList,producties1,producties,person,market5);
                  break;


        }
    }

    public static  void commands() {
        System.out.println("""
                1. Globus 
                2. Azia Mol
                3. Kochmon
                4. Ala-Too
                """);
    }
    public static void method(){
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
                """);
    }

}