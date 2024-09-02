package com.driver;

public class Main {
  public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.name = "John"; 
    // Error: 'name' has private access in 'RWOnly'
        System.out.println(obj.name);
    //we cannot access private members outside the class
    //*********************************************************************************    
    //by using getter setter method we can access private members outside the class
        obj.setName("John");
        
        
        System.out.println(obj.getName());
  
}
