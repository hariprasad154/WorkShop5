package com.bridgeLabs;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook adb1= new AddressBook();
        adb1.addContact();
        adb1.addContact();
        adb1.displayContact();

        adb1.serchByCity("AP");
    }
}
