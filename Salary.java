/** David needs to write a program to calculate the net
payable salary. The program will take basic salary as an
input from the user and calculate the total salary
along with the following components:

HRA, which is 50% of the basic salary

Special allowance, which is 75% of the basic salary
PF deduction, which is 12% of the basic salary
After calculating the preceding salary components,
the net payable salary should be displayed. Help David
to perform the preceding requirement.   **/

import java.util.Scanner;
class Salary
{
  public static void main(String [] args)
  {
    
	Scanner scanf=new Scanner (System.in);
	System.out.print("Enter your basic salary : ");
	int basicSalary=scanf.nextInt();
	int hra= (basicSalary*50)/100;
	int specialAllowance= (basicSalary*75)/100;
	int pf= (basicSalary*12)/100;
	int total=(basicSalary + hra + specialAllowance)- pf;
	
	System.out.println("basic sallary="+basicSalary);
	System.out.println("hra="+hra);
	System.out.println("specialAllowance="+specialAllowance);
	System.out.println("pf="+pf);
	System.out.println("total payable amout after deduction of pf is ="+total);
	
  }

}