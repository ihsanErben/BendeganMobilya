
public class Person {

    Person next;
    Person prev;

    String name;
    String surname;
    String phoneNumber;

    String product;
    String adress;
    String annotation;

    int price;
    int kapora;

    String tc;
    int salary;

    public Person(String name, String surname, String phoneNumber, String product, String adress, String annotation, int price, int kapora) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.product = product;
        this.adress = adress;
        this.annotation = annotation;
        this.kapora = kapora;
        this.price = (price - this.kapora);
    }

    public Person(String name, String surname, String tc, String phoneNumber, int salary) {
        this.name = name;
        this.surname = surname;
        this.tc = tc;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
