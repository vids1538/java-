import java.util.ArrayList;  // this is not a package of java.lang 
import java.util.Collections;  // to sort the array list we import to use sort method 
import java.util.ListIterator;


class Customer
{
	Integer CustID;
}
class  MyList
{
  public static void main(String [] str)
  {
    ArrayList<Integer> obj=new ArrayList(3);  //default size will be 10 but we want 3  // <Integer> for limiting one datat type of array list  
	/*obj.add(10);
	obj.add("bihar");
	obj.add(true);
	obj.add(45.9);   // by default double
	obj.add(10);
	System.out.println(obj);*/
	ArrayList<String> obj1= new ArrayList</*you can skip here */>(5);  // arraylist is a collection of object
	ArrayList<Customer> obj2= new ArrayList<Customer>(3);
	obj.add(30);
	obj.add(80);
	obj.add(40);
	obj.add(1,52);
	System.out.println("size of arraylist is "+ obj.size()); 
	System.out.println(obj);  // if we want to know the size
	Collections.sort(obj);  // this will sort the arraylist 
	obj.remove(3);
	System.out.println(obj);
	for (int i=0; i<obj.size(); i++)
	{
		 System.out.print(obj.get(i)+"  ");
	}	
     ListIterator d=obj.listIterator();	//d for display 
	 
	 while(d.hasNext())
	 {
		 System.out.println(d.next()+ "   ");
	 }
	
  }
}