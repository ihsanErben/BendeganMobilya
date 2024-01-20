
import java.util.Scanner;

public class ProcessCustomer {

    LinkedListMusteri C = new LinkedListMusteri();

    public void baslat() {
        Scanner input = new Scanner(System.in);
        int go2 = 1;
        while (go2 == 1) {
            System.out.println("1- add customer");
            System.out.println("2- remove customer");
            System.out.println("3- update customer");
            System.out.println("4- print all customers");
            System.out.print("Choose: ");
            int optionEmp = input.nextInt();
            System.out.println("");
            switch (optionEmp) {
                case 0:
                    go2 = 0;
                    break;
                case 1:
                    System.out.print("name: ");
                    String name = input.next();
                    System.out.print("surname: ");
                    String surName = input.next();
                    System.out.print("phone no: ");
                    String phoneNo = input.next();
                    System.out.print("product: ");
                    String product = input.next();
                    System.out.print("adress: ");
                    String adress = input.nextLine();
                    String adress1 = input.nextLine();
                    System.out.print("annotation: ");
                    String annotation = input.nextLine();
                    System.out.print("price: ");
                    int price = input.nextInt();
                    System.out.print("kapora: ");
                    int kapora = input.nextInt();
                    Person person2 = new Person(name, surName, phoneNo, product, adress1, annotation, price, kapora);
                    C.addCustomer(person2);
                    break;
                case 2:
                    System.out.print("Enter the phone number what you want to remove: ");
                    String phoneNumber1 = input.next();
                    Person updatePerson1 = C.search(phoneNumber1);
                    if (updatePerson1 == null) {
                        System.out.println("--> ERROR phone number");
                        break;
                    }
                    System.out.println(updatePerson1.name + " " + updatePerson1.surname + " was deleted.");
                    C.remove(updatePerson1);
                    break;
                case 3:
                    System.out.print("Enter the phone number what you want to update: ");
                    String phoneNumber2 = input.next();
                    Person updatePerson2 = C.search(phoneNumber2);
                    if (updatePerson2 == null) {
                        System.out.println("--> ERROR phone number");
                        break;
                    }
                    C.updateCustomerInformations(updatePerson2);
                    break;
                case 4:
                    C.TumMusterileriGoruntule();
                    break;
            }
            System.out.println("---------------------------------------------------");
        }
    }
}
