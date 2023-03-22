package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
             price = 300;
            System.out.println("Base Price Of The Pizza: 300"); }
        else {
            price = 400;
            System.out.println("Base Price Of The Pizza: 400");
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price += 80;
        System.out.println("Extra Cheese Added: 80");
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            price += 70;
            System.out.println("Extra Toppings Added: 70");
        }
        else {
            price += 120;
            System.out.println("Extra Toppings Added: 120");
        }
    }

    public void addTakeaway(){
        // your code goes here
        price += 20;
        System.out.println("Paperbag Added: 20");
    }

    public String getBill(){
        // your code goes here
//        return "Total Price: "+price;
//        bill = String.valueOf(price);
        bill  = "Total Price: "+price+"\n";
      return this.bill;
    }
}
