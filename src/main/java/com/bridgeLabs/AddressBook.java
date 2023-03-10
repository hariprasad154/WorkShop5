package com.bridgeLabs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static Scanner src = new Scanner(System.in);
    List<Contact> contactList = new ArrayList<>();
    void AddressBook(Contact contact){
        contactList.add(contact);
    }
    void addContact(){
        System.out.println("Enter the Name");
        String name= src.next();

        System.out.println("Enter the address");
        String address= src.next();

        System.out.println("Enter the city ");
        String city= src.next();

        System.out.println("Enter the State");
        String state= src.next();

        System.out.println("Enter the contactNumber");
        String contactNumber= src.next();

        System.out.println("Enter the zip");
        int zip= src.nextInt();
        Contact cnt = new Contact(name,address,city,state,contactNumber,zip);
        AddressBook(cnt);
    }

    void displayContact(){
        for (Contact i : contactList){
            System.out.println("--------------");
            System.out.println(i.getName());
            System.out.println(i.getAddress());
            System.out.println(i.getCity());
            System.out.println(i.getState());
            System.out.println(i.getContactNumber());
            System.out.println(i.getZip());
        }


    }


}
