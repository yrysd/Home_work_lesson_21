package classes;

public class Producty {
    private String name;
    private int price;
    private String proizvodstfa;

    public Producty(String name, int price,String proizvodstfa) {
        this.name = name;
        this.price = price;
        this.proizvodstfa = proizvodstfa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProizvodstfa() {
        return proizvodstfa;
    }

    public void setProizvodstfa(String proizvodstfa) {
        this.proizvodstfa = proizvodstfa;
    }

    @Override
    public String toString() {

        return  "\n* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ * "+"\n"+
                "name: " + name + " \n " +
                "price: " + price+"\n"+
                "Proizvodsva: "+proizvodstfa+"\b"+
                " * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ * ";
    }
}
