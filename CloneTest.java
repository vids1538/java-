class CloneTest implements Cloneable    //extends object is used to inheritancec 
{
   String empName;
   Integer empId;
   CloneTest(Integer empId ,String empName)
   {
	   this.empId=empId;
	   this.empName=empName;
   }
   public Object clone() throws CloneNotSupportedException  // if class is not clonable then this 
   {                                                        //exceptonal will be thrown 
	   return super.clone();   // super 
   }
   public static void main(String [] str)
   {
	   try     // jisme exception aa sakta hai wo block (try ) block me jayega   if try se koi exception nhi aaya then 
	   {       // catch block ka koi kaam nhi hai wo run nhi hoga 
	   CloneTest ram =new CloneTest(201, "ram kumar");
	   System.out.println(ram.empId+ "    "+ram.empName);
	   CloneTest shyam=(CloneTest)ram.clone();  // typecasting here object type --> CloneTest type
	   System.out.println(shyam.empId+ "    " +shyam.empName);
	   }
	   catch(CloneNotSupportedException e)
	   {
		   System.out.println("exception occured");
	   }
	   
   }
}