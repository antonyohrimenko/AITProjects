package lesson22.classwork.example02;

public class Human {
    private String name;
    private Address address;

    public Human(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void introduce() {
        System.out.println("Hello im " + name + ", i live in " + address.getCity()
                + ", " + address.getCountry() + ", in " + address.getStreet());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
