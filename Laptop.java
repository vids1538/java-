package com.java;
import java.lang. *;  // this line is not maindatory
class Laptop
{ 
  int price;
  Laptop()  // this is constructor  *** imp
  {
    price= 45000;
	System.out.println("constructor of laptop class ");
  }
  void display()
  { 
     System.out.println("price of the laptop is "+price);
  }
  public static void main(String [] str)
  {
     Laptop l=new Laptop();	 //here we are making object of Laptop class // here l is the refrence variable 
     l.display();
  }
}
// for compile this program javac -d . -Laptop.java
// for run - java -cp . com.cimage.Laptop