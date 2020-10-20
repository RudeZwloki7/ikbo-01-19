package Exercise2;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Address("Country1,State1,City1,Street1,Building1,Apartment1").toString());
        System.out.println(new Address("Country2, State2, City2, Street2, Building2, Apartment2").toString());
        System.out.println(new Address("Country3. State3. City3. Street3. Building3. Apartment3",".").toString());
        System.out.println(new Address("Country2, State2, City2, Street2, Building2, Apartment2, ExtraField").toString());
    }



}
