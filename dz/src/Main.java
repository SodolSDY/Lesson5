
public class Main {
    public static void main(String[] args) {
       Address add = new Address();
       add.setIndex(39800);
       add.setCountry("Ukraine");
       add.setCity("Komsomolsk ");
       add.setStreet("Lenina");
       add.setHouse(72);
       add.setApartment(74);
        System.out.println(add.getCountry());
        System.out.print(add.getIndex() + " " + add.getCity());
        System.out.println(add.getStreet() + " " + add.getHouse() + "-" + add.getApartment());
    }
}
