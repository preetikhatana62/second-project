package com.ac;

//import com.java.Bank;
//import com.java.Ibank;

public abstract class Bank
{   static int a=10;  
public static void m3()
	{
		System.out.println("hi!");
	}
 abstract public  void m1();
 
	 public void m2()
	 {
		 System.out.println("hello");
	 }
	
}
class Ibank extends Bank

  {    @ Override   // annotation
     public void m2()
	  {
		System.out.println("hello");  
	  }
    public void m1()
	 {
		  System.out.println("Welcome");
	 }
	public static void main(String[] args){
		{
		    Ibank ob=new Ibank();
			ob.m1();
			ob.m2();
	    }
	}
  }
  class Driver2
  {
	  public static void main(String[] args){
		{
		    Bank ob=new Ibank();
			Bank.m3();
			ob.m2();
			System.out.println(Bank.a);
	    } 
  
	  }
  }





