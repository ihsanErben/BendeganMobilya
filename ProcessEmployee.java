
import java.util.Scanner;

public class ProcessEmployee {

    LinkedListCalisan E = new LinkedListCalisan();
    
    public void baslat() {
        Scanner input = new Scanner(System.in);
        int go1 = 1;
        while (go1 == 1) {
            System.out.println("1- add employee");
            System.out.println("2- remove employee");
            System.out.println("3- update employee");
            System.out.println("4- print all employees");
            System.out.print("Choose: ");
            int optionEmp = input.nextInt();
            System.out.println("");
            switch (optionEmp) {
                case 0:
                    go1 = 0;
                    break;
                case 1:
                    System.out.print("name: ");
                    String name = input.next();
                    System.out.print("surname: ");
                    String surName = input.next();
                    System.out.print("tc: ");
                    String tc = input.next();
                    System.out.print("phone no: ");
                    String phoneNo = input.next();
                    System.out.print("salary: ");
                    int salary = input.nextInt();
                    Person person1 = new Person(name, surName, tc, phoneNo, salary);
                    E.addEmployee(person1);
                    break;
                case 2:
                    System.out.print("Enter the tc what you want to remove: ");
                    String tc2 = input.next();
                    Person updatePerson1 = E.search(tc2);
                    if (updatePerson1 == null) {
                        System.out.println("--> ERROR tc");
                        break;
                    }
                    System.out.println(updatePerson1.name + " " + updatePerson1.surname + " was deleted.");
                    E.remove(updatePerson1);
                    break;
                case 3:
                    System.out.print("Enter the tc what you want to update: ");
                    String tc3 = input.next();
                    Person updatePerson2 = E.search(tc3);
                    if (updatePerson2 == null) {
                        System.out.println("--> ERROR tc");
                        break;
                    }
                    E.updateEmployeeInformations(updatePerson2);
                    break;
                case 4:
                    E.TumCalisanlariGoruntule();
                    System.out.println("");
                    break;
            }
            System.out.println("---------------------------------------------------");
        }
    }
}
