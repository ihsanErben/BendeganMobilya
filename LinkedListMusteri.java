
import java.util.Scanner;

public class LinkedListMusteri {

    Scanner input = new Scanner(System.in);
    Person first;
    Person last;

    public void addCustomer(Person person) {
        if (first == null) {
            first = person;
        } else {
            last.next = person;
            person.prev = last;
        }
        last = person;
    }

    public void removeCustomer(int tc) {
        Person tmp = first;
        while (tmp != null) {
            if (tmp.tc.equals(tc)) {
                remove(tmp);
                System.out.println(tmp.name + " " + tmp.surname + " was deleted in the system.");
                return;
            }
            tmp = tmp.next;
        }
        System.out.println("ERROR --> tc: " + tc);
    }

    public void remove(Person person) {
        if (person == first) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                first = first.next;
            }
        } else if (person == last) {
            last = last.prev;
        } else {
            Person back = person.prev;
            Person front = person.next;
            back.next = front;
            front.prev = back;
        }
    }

    public void updateCustomerInformations(Person person) {
        System.out.println("1- name");
        System.out.println("2- surname");
        System.out.println("3- tel no");
        System.out.println("4- adress");
        System.out.println("5- product");
        System.out.println("6- annotation");
        System.out.print("What do you want to change: ");
        int option = input.nextInt();
        switch (option) {
            case 0:
                break;
            case 1:
                System.out.print("Enter the new name: ");
                String newName = input.next();
                person.setName(newName);
                break;
            case 2:
                System.out.print("Enter the new surname: ");
                String newSurname = input.next();
                person.setSurname(newSurname);
                break;
            case 3:
                System.out.print("Enter the new tel no: ");
                String newTelNo = input.next();
                person.setPhoneNumber(newTelNo);
                break;
            case 4:
                System.out.print("Enter the new adress: ");
                String newAdress = input.nextLine();
                person.setAdress(newAdress);
                break;
            case 5:
                System.out.print("Enter the new product: ");
                String newProduct = input.next();
                person.setProduct(newProduct);
                break;
            case 6:
                System.out.print("Enter the new annotation: ");
                String newAnnotation = input.nextLine();
                person.setAnnotation(newAnnotation);
                break;
            default:
                System.out.println("");
                break;
        }
    }

    public void kisiGoruntule(Person person) {
        System.out.println("Customer: " + person.name + " " + person.surname);
        System.out.println("Phone no: " + person.phoneNumber);
        System.out.println("Product: " + person.product);
        System.out.println("Adress: " + person.adress);
        System.out.println("Annotation: " + person.annotation);
        System.out.println("Kapora: " + person.kapora);
        System.out.println("Price: " + person.price);
    }

    public void TumMusterileriGoruntule() {
        System.out.println("----------------");
        Person tmp = first;
        if (tmp == null) {
            System.out.println("There is no any customer.");
            System.out.println("----------------");
        }
        while (tmp != null) {
            kisiGoruntule(tmp);
            System.out.println("----------------");
            tmp = tmp.next;
        }
    }

    public Person search(String phoneNumber) {
        Person tmp = first;
        while (tmp != null) {

            if (tmp.phoneNumber.equals(phoneNumber)) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }

}
