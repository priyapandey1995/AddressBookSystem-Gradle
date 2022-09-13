package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    /**
     * Arraylist is performed for multiple contacts
     * addContact() is used to add the contact in address book
     * displayContact() is used to display the contacts in address Book
     * editContact() is used edit the contacts in addressBook
     */

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact> contactArrayList = new ArrayList<>();
    static Contact addressBook = new Contact();
    int count = 0;

    public void addContact() {


        Contact contact = new Contact();
        count++;
        System.out.println("Enter the First Name");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address ");
        contact.setAddress(sc.next());
        System.out.println("Enter the City");
        contact.setCity(sc.next());
        System.out.println("Enter the State");
        contact.setState(sc.next());
        System.out.println("Enter the Zipcode");
        contact.setZip(sc.next());
        System.out.println("Enter the MobileNo");
        contact.setPhoneNo(sc.next());
        System.out.println("Enter the Email id");
        contact.setEmail(sc.next());
        contactArrayList.add(contact);

    }

    public void displayContact() {
        for(int i = 0; i < contactArrayList.size(); i++) {
            Contact contact = contactArrayList.get(i);
            System.out.println(contact.toString());
        }
        if(contactArrayList.size() == 0) {
            System.out.println("No contacts");
        }
    }
    public void editContact() {
        System.out.println("Enter the First Name of the contact to edit");
        String firstName = (sc.next());
        boolean isAvailable = false;

        for(Contact contact : contactArrayList) {
            if(contact.getFirstName().equals(firstName)) {
                while(true) {
                    System.out.println("Select the options to edit");
                    System.out.println("\n 1.FIRST NAME \n 2.LAST NAME \n 3. ADDRESS \n 4.CITY \n 5.STATE \n 6.PHONE NUMBER \n 7.ZIPCODE \n 8.EMAIL \n 9.EXIT");
                    int feilds = sc.nextInt();

                    isAvailable = true;
                    switch(feilds) {
                        case 1:
                            System.out.println("Enter the first name");
                            contact.setFirstName(sc.next());
                            break;
                        case 2:
                            System.out.println("Enter the Last Name : ");
                            contact.setLastName(sc.next());
                            break;
                        case 3:
                            System.out.println("Enter the Address : ");
                            contact.setAddress(sc.next());
                            break;
                        case 4:
                            System.out.println("Enter the City : ");
                            contact.setCity(sc.next());
                            break;
                        case 5:
                            System.out.println("Enter the State : ");
                            contact.setState(sc.next());
                            break;
                        case 6:
                            System.out.println("Enter the Zipcode : ");
                            contact.setZip(sc.next());
                            break;
                        case 7:
                            System.out.println("Enter the Mobile Number : ");
                            contact.setPhoneNo(sc.next());
                            break;
                        case 8:
                            System.out.println("Enter the Email Id : ");
                            contact.setEmail(sc.next());
                            break;
                        case 9:
                            return;
                        default:
                            System.out.println("to enter valid contacts");

                    }

                    System.out.println("Detailes are edited");
                }
            }
        }
        if(isAvailable == false) {
            System.out.println("Contact not Available");
        }
    }


    public void deleteContact() {
        System.out.println("Enter the First Name to Delete the Contact : ");
        String firstName = (sc.next());
        boolean isAvailable = false;

        for(Contact contact : contactArrayList) {
            if(contact.getFirstName().equalsIgnoreCase(firstName)) {
                isAvailable = true;
                contactArrayList.remove(contact);
                System.out.println("Contact is Deleted ");
                break;
            }
        }
        if(isAvailable == false) {
            System.out.println("Contact Not Available.");

        }
    }

}


