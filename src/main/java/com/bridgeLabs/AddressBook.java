package com.bridgeLabs;

import java.io.*;
import java.util.*;

public class AddressBook {
    static Scanner src = new Scanner(System.in);
     public static Map<String, ArrayList<Contact>> addressBook = new HashMap<>();

    public void AddressBookContact(String addressBookName, Contact contact) {
        ArrayList<Contact> addressBookDetails = addressBook.getOrDefault(addressBookName, new ArrayList<Contact>());
        addressBookDetails.add(contact);
        addressBook.put(addressBookName, addressBookDetails);
    }
//    void displayContact(){
//        for (Contact i : contactList){
//            System.out.println("--------------");
//            System.out.println(i.getName());
//            System.out.println(i.getAddress());
//            System.out.println(i.getCity());
//            System.out.println(i.getState());
//            System.out.println(i.getContactNumber());
//            System.out.println(i.getZip());
//        }
    public void fileIo() {
        System.out.println("File io started");
        try {
            File f = new File("E:\\Hariprasad\\AddressBook\\src\\main\\java\\com\\bridgeLabs\\Contacts.txt");
            System.out.println(f.exists());
            PrintWriter writer = new PrintWriter(new FileWriter(f));
            for (Map.Entry<String, ArrayList<Contact>> ent: addressBook.entrySet()) {
                String key = ent.getKey();
                ArrayList<Contact> val = ent.getValue();
                writer.println(key );
                for (Contact  cont: val ){
                    writer.print(cont.getName()+ " ");
                    writer.print(cont.getContactNumber()+ " ");
                    writer.print(cont.getAddress()+ " ");
                    writer.print(cont.getCity()+ " ");
                    writer.print(cont.getState()+ " ");
                    writer.println(" \n");
                }
            }
            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.println(e);

        }
    }
    public void SerchBycity(String city){
        try {
            BufferedReader br=new BufferedReader(new FileReader("E:\\Hariprasad\\AddressBook\\src\\main\\java\\com\\bridgeLabs\\Contacts.txt"));
            String line= br.readLine();
            boolean find=false;
            while (line != null){
                String[] reader=line.split(" ");
                for(String i:reader){
                    if (i.equals(city)){
                        find=true;
                        System.out.println("The city is present - "+line);
                    }
                }
                line=br.readLine();
            }
            if(find==false){
                System.out.println("The name not present ");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void SerchByState(String state){
        try {
            BufferedReader br=new BufferedReader(new FileReader("E:\\Hariprasad\\AddressBook\\src\\main\\java\\com\\bridgeLabs\\Contacts.txt"));
            String line= br.readLine();
            boolean find=false;
            while (line != null){
                String[] reader=line.split(" ");
                for(String i:reader){
                    if (i.equals(state)){
                        find=true;
                        System.out.println("The state is present in - \n \t \t"+line);
                    }
                }
                line=br.readLine();
            }
            if(find==false){
                System.out.println("The name not present ");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void displayAddressBook() {
        System.out.println(addressBook);
    }
    public void showContact(){
        for (Map.Entry<String, ArrayList<Contact>> ent: addressBook.entrySet()){
            String key=ent.getKey();
            ArrayList<Contact> val=ent.getValue();
            System.out.println(key + " - ");
            for (Contact  cont: val ){
                System.out.println("--Contacts--");
                System.out.println(cont.getName());
                System.out.println(cont.getContactNumber());
                System.out.println(cont.getAddress());
                System.out.println(cont.getCity());
                System.out.println(cont.getState());
            }
        }
    }
}