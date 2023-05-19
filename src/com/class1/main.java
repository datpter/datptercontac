package com.class1;

import com.class1.model.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContacManagement contacManagement= new ContacManagement();
        System.out.println("1. Add new contact: ");
        System.out.println("2.  Find a contact by name: ");
        System.out.println("3. Display contacts :");
        System.out.println("4. Exit");
        int luachon = 0;
        try {
            do{
                luachon = sc.nextInt();
                sc.nextLine();
                if(luachon==1){
                    Contact c = new Contact();
                    c.inputData();
                    contacManagement.addNewContact(c);
                } else if (luachon==2) {

                    System.out.println("Enter Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    Contact contact= contacManagement.findContact(name);
                    if(contact!= null){
                        System.out.println("Found");

                    }else {
                        System.out.println("Not found");
                    }



                } else if (luachon==3) {
                    contacManagement.displayall();

                } else if (luachon==4) {
                    return;

                }

            }while (true);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }






    }
}
