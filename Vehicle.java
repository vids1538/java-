class Car
{
   int color;
   int size;
   void price()
   { 
     System.out.println("5500$");
   }
   
}
class  Vehicle
{
 public static void main(String [] args)
 {System.out.println("inside main function");
 Car c1=new Car();
 Car c2=new Car();
 c1.color=555;
 c1.size=8;
 c1.price();
 c2.color=666;
 c2.size=9;
 System.out.println(c2.color);
 System.out.println(c2.size);
 System.out.println(c1.color);
 System.out.println(c1.size);
 }
 }