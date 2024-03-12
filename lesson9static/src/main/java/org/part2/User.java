package org.part2;

public class User {

    private String name;
    private Address address;

    public User(String name, String city, String street) {
        this.name = name;
        address = new Address(city, street);
    }

    public void printInfo() {
        System.out.println(name + " lives " + address);
    }

    public class Address {

        private String city;
        private String street;

        public Address(String city, String street) {
            this.city = city;
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }
    }

}
