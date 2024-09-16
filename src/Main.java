import java.io.*;
import java.util.*;
public class Main {
    Customer customerArray [] = new Customer[5];
    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }

    public void run(){
        createCustomers();
        printCustomers(customerArray);

        Scanner s = new Scanner(System.in);
        System.out.println("Find by name: ");
        printCustomerByName(s.nextLine(), customerArray);


        Scanner a = new Scanner(System.in);
        System.out.println("Find by range balance: ");
        printCustomersBetweenRange(a.nextInt(), a.nextInt(), customerArray);

        System.out.println("Null balance");
        printCustomerCountNullBalance(customerArray);


    }
    public void createCustomers(){
        customerArray[0] = new Customer(100, "Tobi", "Edin", "Marcoo", "gray str.1", 380777, 44411111);
        customerArray[1] = new Customer(101, "Tobi", "Ore", "Gold", "gray str.2", 380788, 44411122, 2333);
        customerArray[2] = new Customer(102, "Fanu", "Edin", "Eren", "gray str.3", 380888, 44411123);
        customerArray[3] = new Customer(103, "Saft", "Hadr", "Marcoo", "gray str.4", 380222, 44411221, 23);
        customerArray[4] = new Customer(104, "Abu", "Dhabi", "Skyfall", "L. Hamilton 44", 888888, 33441000, 44);
    }

    public void printCustomers(Customer array[]){
        for (int i = 0; i <array.length; i ++) {
            System.out.println(array[i].toString());
        }
    }

    public void printCustomerByName(String name, Customer array[]){
        for (int i = 0; i <array.length; i ++) {
            if (array[i].getName().equals(name)){
                System.out.println(array[i].toString());
            }
        }
    }

    public void printCustomersBetweenRange(double begin, double end, Customer array[]){
        for (int i = 0; i <array.length; i ++) {
            if (array[i].getBonusBalance() >= begin && array[i].getBonusBalance() <= end){
                System.out.println(array[i].toString());
            }
        }
    }

    public void printCustomerCountNullBalance(Customer array[]){
        int count = 0;
        for (int i = 0; i <array.length; i ++){
            if (array[i].getBonusBalance() == 0){
                count++;
                System.out.println(array[i].toString());
            }
        }
    }
}