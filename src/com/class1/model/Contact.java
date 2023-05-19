package com.class1.model;

import java.util.Scanner;

public class Contact {

    int id;
    String name,company,email,phone;
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name= sc.nextLine();
        System.out.println("Enter company: ");
        this.company= sc.nextLine();
        System.out.println("Enter email: ");
        this.email= sc.nextLine();
        System.out.println("Enter phone:");
        this.phone= sc.nextLine();
    }
    public void display(){
        System.out.println("Name company"+name);
        System.out.println("Company"+company);
        System.out.println("Email"+email);
        System.out.println("Phone"+phone);






    }
    public  Contact(){

    }

    public Contact(int id, String name, String company, String email, String phone) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }
    @Override
   public String toString(){
        return this.id + ", " +
                this.name + ", " +
                this.company + ", " +
                this.email +", "+
                this.phone ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
