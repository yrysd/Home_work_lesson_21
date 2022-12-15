package service;

import classes.Person;
import classes.Producty;

import java.util.List;
import java.util.Map;

public interface Market {
    void akzhia(List<Person>personList);
    void satypAluu(List<Integer>integerList, List<Producty> productyList, List<Producty> producties, Person namePerson, classes.Market marketName);
    void pojalovatsa(List<String>pojalovatsa,List<Producty>producties);
    void check(List<Person>personList);
    void marketKoshuu(List<classes.Market>markets);
    String markettiSatypAluu(List<Person>personList, classes.Market market, Person person, List<classes.Market>markets);
    void jumushkaAluu(List<Person>personList, classes.Market market);
    void markettiJaapSaluu(List<Person>personList, Person person, classes.Market market,List<classes.Market>markets);
    void markettinMaalymatynKoruu(List<classes.Market>markets, classes.Market market);
    void jumushchulardyIshtenBoshoguu(List<classes.Market>markets, List<Person>personList, classes.Market market);
    String markettinAkchasynAluu(List<classes.Market>markets, classes.Market market,List<Person>personList);
    void PersonInfo(List<Person>personList);
    void salykToloo(List<Person>personList, List<classes.Market>markets, classes.Market market,Person person);
    Map<String,Integer> markettegiJumushculardynSanynBiluu(List<classes.Market>markets, classes.Market market);


}
