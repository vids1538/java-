package package2;   //package keyword is used for creating a package 
import package1.Amit; // imported previously created package1 and Amit class should be public before import
class Sumit
{
 public static void main(String [] args)
 {
   Amit a1=new Amit();  // new object a1 is created using new keyword 
   a1.setData(4,5);
   a1.display();
 }

}