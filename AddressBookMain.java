 import java.util.ArrayList;
import java.util.Scanner;


class Contacts {
    
    String first_name  ;
    String last_name;
    String address;
    String city;
    String state;
    int zip;
    String phone_number;
    String email;


    // initialising value with constructor a
    public Contacts(String first_name, String last_name, String address, String city, String state, int zip,
                    String phone_number, String email) {
//this is a key word which is used to refer current object
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_number = phone_number;
        this.email = email;

                    }
                }
 
 
 
 public class AddressBookMain{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contacts> con = new ArrayList<Contacts>();
 public static void main(String[] args) {
        System.out.println("welcome to address book program");
 }

public static void add_contact() {
        sc.nextLine();// to avoid /n issue in after taking integer as input
        System.out.println("enter first name ");
        String first_name = sc.nextLine();
        System.out.println("enter last name ");
        String last_name = sc.nextLine();
        System.out.println("enter address ");
        String address = sc.nextLine();
        System.out.println("enter  city");
        String city = sc.nextLine();
        System.out.println("enter  state");
        String state = sc.nextLine();
        System.out.println("enter zip-code");
        int zip = sc.nextInt();
        sc.nextLine();
        System.out.println("enter phone number");
        String phone_number = sc.nextLine();
        System.out.println("enter email");
        String email = sc.nextLine();
        Contacts cont = new Contacts(first_name, last_name, address, city, state, zip, phone_number, email);
        con.add(cont);
    }
}
