package com.bridgeLabs;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook adb=new AddressBook();

        adb.AddressBookContact("Family",new Contact("Hari","Madanapalle","Mpl","Aps","98772332",1231));
        adb.AddressBookContact("Family",new Contact("prasad","Madanapalle","Mp","Ap","987324272332",1231));
        adb.AddressBookContact("Friend",new Contact("naidu","Madanapalle","M","A","9873242",1231));

        adb.displayAddressBook();

//        adb.fileIo();
//        adb.showContact();
//
//        adb.fileIo();
        adb.SerchBycity("Mp");
        adb.SerchByState("Aps");

    }
}