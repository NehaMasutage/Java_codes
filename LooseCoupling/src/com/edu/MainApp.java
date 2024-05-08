package com.edu;
interface Pizza{
    public String getPizza();
}
class VegPizza implements Pizza{
       public String getPizza(){
           return "VegPizza";
     }
  
}
class NonVegPizza implements Pizza{
       public String getPizza(){
           return "NonVegPizza";
     }
  
}
public class MainApp{
    public static void main(String args[]) {
     Pizza pizzaobj;
      pizzaobj = new VegPizza();
      System.out.println( pizzaobj.getPizza()); //VegPizza
      pizzaobj=new NonVegPizza();
       System.out.println( pizzaobj.getPizza()); //NonVegPizza
      
}
}
