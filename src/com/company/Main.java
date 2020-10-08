package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       Contacts contact1 = new Contacts("Fatih",514077303);
       contact1.addNewContact("Hasan",523654234);
       contact1.addNewContact("Ayse",543766723);


       Messages messages1 = new Messages("Fatih","Fatih send to Hasan : Hi Hassan how are you?");

       Scanner scanner = new Scanner(System.in);

        int i =0;
       while (i!=3){

           System.out.println("Select one of the options "+ "\n\t" + "1. Manage Contacts " + "\n\t" + "2. Messages " + "\n\t" +
                                 "3.Quit");
           i = scanner.nextInt();

           switch (i){

               case 1:
                   while (i!=5) {
                       System.out.println("Manage Contacts " + "\n\t" + "1. Show all contacts" + "\n\t"
                               + "2. Add a new contact" + "\n\t"
                               + "3. Search for a contact" + "\n\t"
                               + "4. Delete a contact" + "\n\t"
                               + "5. Go back the menu");
                       i = scanner.nextInt();
                       if (i == 1) {
                           contact1.showAllContacts();

                       }
                       if (i == 2) {
                           System.out.print("Type a name : ");
                           String name = scanner.next();
                           System.out.print("Type the number : ");
                           long number = scanner.nextLong();
                           contact1.addNewContact(name, number);

                       }
                       if (i == 3) {

                           System.out.print("what is the name of the contact : ");
                           String name = scanner.next();
                           contact1.getName(name);

                       }
                       if (i == 4) {

                           System.out.print("What is the name of your contact for deleting : ");
                           String name = scanner.next();
                           contact1.deleteContact(name);

                       }
                       if (i == 5) {
                           continue;
                       }
                   }
                   break;

               case 2:
                    while(i!=3) {
                        System.out.println("Messages " + "\n\t" + "1. See the list of all messages"+ "\n\t"
                                + "2. Send a new message" + "\n\t"
                                + "3. Go back to the previous menu");
                        i = scanner.nextInt();

                        if (i == 1) {
                            messages1.showAllMessages();
                        }
                        if (i == 2) {
                            System.out.print("Type your contact name : ");
                            String name = scanner.next();
                            System.out.print("Please type your message : ");
                            String message = scanner.next();
                            System.out.print("  ");
                            messages1.sendMessage(name, message);
                        }
                        if (i == 3) {
                            continue;
                        }
                    }
                        break;

               case 3:
                   break;
           }


       }




    }
}
