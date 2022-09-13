package com.bridgelabz.addressbook;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author pande
 *
 */
public class AddressBookMain {
    Scanner sc = new Scanner(System.in);
    HashMap<String, AddressBook> mapbook = new HashMap<String, AddressBook>();
    AddressBook addressBook = new AddressBook();

    public void toAddMultipleAddressBook() {
        while (true) {
            System.out.println("Enter 1.Book Name 2.to display 3.exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the address Book name");
                    String name = sc.next();
                    if (mapbook.containsKey(name)) {
                        System.out.println("This book is already exists");

                    } else {
                        mapbook.put(name, addressBook);
                        menuToDisplay();

                    }
                    break;
                case 2:
                    System.out.println("Enter book name to search");
                    String search = sc.next();
                    mapbook.get(search);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public static void menuToDisplay() {
        System.out.println("Welcome to addressBook Problem");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("***AddressBook***");
        while (true) {
            System.out.println(" \n 1. ADD CONTACT \n 2. DISPLAY CONTACT \n 3. EDIT CONTACT \n 4. DELETE CONTACT \n 5.EXIT");
            System.out.println("Choose the operationNo");
            int operationNo = sc.nextInt();
            switch (operationNo) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                default:
                    System.out.println("Wrong Operation No");
                    break;

            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Address book System");
        AddressBookMain addressBook = new AddressBookMain();
        addressBook.toAddMultipleAddressBook();
    }
}





