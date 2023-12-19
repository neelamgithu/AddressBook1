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
}