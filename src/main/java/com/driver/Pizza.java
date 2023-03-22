package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public boolean addcheese;
    public boolean toppingsadded;
    public boolean paperbagadded;
    public int toppingprice;
    public int paperbagprice;
    public int cheeseprice;
    public boolean billgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            price = 300;
            toppingprice = 70;
        }
        else {
            price = 400;
            toppingprice = 120;
        }
        addcheese = false;
        toppingsadded = false;
        paperbagadded = false;
        paperbagprice = 20;
        cheeseprice = 80;

        bill = "Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addcheese==false)
        {
            price += cheeseprice;
            addcheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsadded==false)
        {
            price += toppingprice;
            toppingsadded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperbagadded){
            price += paperbagprice;
            paperbagadded = true;
        }
    }

    public String getBill(){
       if(!billgenerated)
       {
           if(addcheese==true){
               bill = bill + "Extra Cheese Added: "+cheeseprice+"\n";
           }
           if(toppingsadded){
               bill = bill + "Extra Toppings Added: "+toppingprice+"\n";
           }
           if(paperbagadded){
               bill = bill +"Paperbag Added: "+paperbagprice+"\n";
           }
           bill = bill + "Total Price: "+price+"\n";
       }
       billgenerated = true;
       return this.bill;
    }
}
