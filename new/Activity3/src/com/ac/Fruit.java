package com.ac;



class friuit 
{
 String location="mumbai";
 void display()
 {
	 System.out.println("hello");
 }
}
class Apple extends friuit
{
  double price=200;
  String name="banana";
  void display()
  {
	  System.out.println("welcome"); 
  }
  
}
class Good
{
    public static void main(String[] args)
	{
		friuit f=new Apple();//upcasting
		//Apple a= (Apple)f;//downcasting
		f.display();
		if (f instanceof Apple)
		{ // Apple a=(Apple) f;
		
		}
		//System.out.println(f.name);
		
	}
}







