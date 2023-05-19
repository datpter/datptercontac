package com.class1;

import com.class1.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContacManagement {
    List<Contact> list ;

    public ContacManagement() {
        list=new ArrayList<Contact>();


    }
    public void addNewContact(Contact contact){
        list.add(contact);

    }
    Contact findContact(String name){
        for (Contact item:list){
            if(name.equals(item.getName())){
                item.display();
                return item;
            }

        }
        return null;

    }
    public void displayall(){
        for (Contact item :list){
            item.display();
        }
    }


}
