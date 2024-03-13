package org.example;

public class Main {
    public static void main(String[] args) {

        DiscountProduct product2 = new DiscountProduct();
        Product phone = new Product("Telefon",1,1,"Apple",1,"Apple 15","deneme.jpg","Beyaz",-1);



        Customer customerTurkcel = new Customer(123123,"deneme@gmail.com","123123","Turkey",1,"deneme","deneme",true);
        Customer customerNoTurkcel = new Customer(123121,"deneme@gmail.com","123123","Turkey",2,"deneme","deneme",false);

        CorporateCustomer cp2 = new CorporateCustomer(12333,"deneme@gmail.com","123123123","Turkey",1,"123123","Deneme");

        Comment comment = new Comment("Deneme",1,4,"Güzeldi","12.03.2024",1);


    }
}