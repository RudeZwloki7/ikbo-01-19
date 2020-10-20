package Exercise2;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String state;
    private String city;
    private String street;
    private String building;
    private String apartment;

    public Address(String address) {
        String[] parsedAddress = address.split(",");
        if (parsedAddress.length != 6) throw new IllegalArgumentException("Wrong address format");
        this.country = parsedAddress[0].trim();
        this.state = parsedAddress[1].trim();
        this.city = parsedAddress[2].trim();
        this.street = parsedAddress[3].trim();
        this.building = parsedAddress[4].trim();
        this.apartment = parsedAddress[5].trim();
    }
    public Address(String address,String delimit) {
        StringTokenizer parsedAddress = new StringTokenizer(address,delimit);
        if (parsedAddress.countTokens() != 6) throw new IllegalArgumentException("Wrong address format");
        this.country = parsedAddress.nextToken().trim();
        this.state = parsedAddress.nextToken().trim();
        this.city = parsedAddress.nextToken().trim();
        this.street = parsedAddress.nextToken().trim();
        this.building = parsedAddress.nextToken().trim();
        this.apartment = parsedAddress.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address: " +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'';
    }
}
