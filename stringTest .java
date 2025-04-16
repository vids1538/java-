class StringTest 
{
   public static void main(String [] str)
   {
      StringBuilder s1=new String ("cimage");
	  StringBuilder s2=new String ("cimage");
	  System.out.println(s1.length());
	  System.out.println(s1== s2); // it will return false coz both are two object and obsiouly they have diffrent mem.. address
	  System.out.println(s1.equals(s2));  // it will print true coz it compare contents not address
   
   
   }

}
