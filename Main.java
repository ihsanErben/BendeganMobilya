
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProcessEmployee E = new ProcessEmployee();
        ProcessCustomer C = new ProcessCustomer();
        
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------------");
        while (true) {
            System.out.println("1- Employee");
            System.out.println("2- Customer");
            System.out.print("Choose: ");
            int option = input.nextInt();
            System.out.println("");
            if (option == 1) {
                E.baslat();
            } else if (option == 2) {
                C.baslat();
            }
        }
    }
}
