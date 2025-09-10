class Myclass
{
  static void fun1()    // we have to make this function static if we want to call it 
   {
     System.out.println(" myclass ka fun1");   
   }
   
    static  void fun2()  // we have to make this function static if we want to call it 
   {
     System.out.println("myclass ka fun2");   
   }
}

class Car
{
	static void purchase()
	{
		System.out.println("car purchased ");
	}
}
class Example
{
  static void fun1()    // we have to make this function static if we want to call it 
   {
     System.out.println("fun 1");   
   }
   
    static  void fun2()  // we have to make this function static if we want to call it 
   {
     System.out.println("fun 2");   
   }
   
    static void fun3()   // we have to make this function static if we want to call it 
   {
     System.out.println("fun 2");   
   }
   public static void main(String[] args)   // this is main method 
   {
    System.out.println(" inside main function");
	 fun1();
	 fun3();
	 fun2();
	 Myclass.fun1();
	 Myclass.fun2();
	 Car.purchase();
   }
}

