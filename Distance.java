/** John needs to write a program to calculate the total distance
travelled by a vehicle. The program will take initial velocity,
acceleration, and time as input from the user. To calculate the
distance, John can use the following formula:

Distance = ut + (at2) /2

Here, u is the initial velocity (meters per second), a is the
acceleration (meters per second2), and t is the time (seconds). Help
John to perform the preceding task.  **/

import java.util.Scanner;
class Distance
{
 public static void main(String [] args)
 {
   Scanner scanf=new Scanner(System.in);
   System.out.println("enter velocity :");
   int velocity=scanf.nextInt();
   
   System.out.println("enter acceleration:");
   int acceleration =scanf.nextInt();
   
   System.out.println("enter Time :");
   int Time =scanf.nextInt();
   int distance = (velocity * Time) + 1/2*(acceleration * Time^2);
   System.out.println("tOTAL DISTANCE COVERED IS  :"+ distance);
 }
 
}
