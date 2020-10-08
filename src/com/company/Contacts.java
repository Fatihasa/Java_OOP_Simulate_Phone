package com.company;

import java.util.HashMap;


public class Contacts {

    HashMap<String, Long> contactList = new HashMap<String, Long>();

    private String name;
    private long number;

    public Contacts(String name, long number) {
        this.name = name;
        this.number = number;
        contactList.put(name,number);
    }


    public void showAllContacts(){

        for(String i : contactList.keySet() ){

            System.out.println("name " + i +  " number :" + contactList.get(i) );
        }

    }

    public void addNewContact(String name, long number){

        contactList.put(name,number);

    }

    public void getName(String name){

        if(contactList.containsKey(name)){
            System.out.println("Contacts number is : "+ contactList.get(name));
        }
    }

    public void deleteContact(String name){
        contactList.remove(name);
    }




}
