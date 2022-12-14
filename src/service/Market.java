package service;

import classes.Person;
import classes.Producty;

import java.util.List;

public interface Market {
    void akzhia(List<Person>personList);
    void satypAluu(List<Integer>integerList, List<Producty> productyList, List<Producty> producties, Person namePerson, classes.Market marketName);
    void pojalovatsa(List<String>pojalovatsa,List<Producty>producties);
    void check(List<Person>personList);
    void marketKoshuu(List<classes.Market>markets);

}
