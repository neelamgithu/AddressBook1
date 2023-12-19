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
    public static void edit_contact() {
        int count = check();//calling check methods

        if (count == -1) {
            System.out.println(" invalid name \nplease enter valid name");

        }
        // flag=1 means name is found and index is store in count varible so we can
        // update details by index of that contact
        else {

            System.out.println("enter new address");
            con.get(count).address = sc.nextLine();
            System.out.println("enter new city");
            con.get(count).city = sc.nextLine();
            System.out.println("enter new state");
            con.get(count).state = sc.nextLine();
            System.out.println("enter new zip");
            con.get(count).zip = sc.nextInt();
            sc.nextLine();// after taking interger as input /n create ussue for that we are using this
            // method
            System.out.println("enter new phone number");
            con.get(count).phone_number = sc.nextLine();
            System.out.println("enter new email address");
            con.get(count).email = sc.nextLine();
            System.out.println("updation done successfully");
        }
    }
    public static int check() {
        sc.nextLine();// to avoid /n issue in after taking integer as input
        int count = 0;
        // flag variable is to check user input name found or not
        if (con.size() == 0) {
            System.out.println(" No contact information to edit  ");
        } else {
            // int flag = 0;
            System.out.println("enter name of person to edit details");
            // reading name from console
            String cname = sc.nextLine();
            // iteration until length of arraylist
            while (count < con.size()) {
                // checking name of user input is matches with any name of stored contact
                if (con.get(count).first_name.equals(cname)) {
                    System.out.println("name fount successfully");

                    return count;
                    // as name has been found so no need to iterate break used to go out of loop
                    // after condition true
                }
                count++;
            }

            // if flag=0 means name is not found and so we are priting message and and stop
            // execution
        }
        return -1;
    }

}
