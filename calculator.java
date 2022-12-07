//SAMARTH KUMAR
//2241011179
package program;
import java.util.*;
public class calculator 
{
 
//HERE WE ARE CREATING A MAIN METHOD
public static void main(String[] args) 
{
//Declaring Variables
double a,b,result;
int choice,cd;
//Here we are Creating an object of Scanner class
Scanner sc=new Scanner(System.in);
//do-while loop
do
{
//Displaying Menu-Driven program to the user
System.out.println("====================================================");
System.out.println("====================================================");
System.out.println("====================================================");
System.out.println("/*...................BASIC CALCULATOR...............*/");
System.out.println();
System.out.println("Press 1 for addition");
System.out.println("Press 2 for subtraction");
System.out.println("Press 3 for Multiplication");
System.out.println("Press 4 for Division");
System.out.println("Press 5 for finding Square of a number");
System.out.println("Press 6 for finding Square root of a number");
System.out.println("Press 7 for finding Reciprocal of a number");
System.out.println("Press 8 for getting the Absolute value of a number");
System.out.println("Press 9 for rounding of a number");
System.out.println("Press 10 for finding the cube root of a number ");
System.out.println("Press 11 for finding the smallest integer value");
System.out.println("Press 12 for finding the largest integer value ");
System.out.println("Press 13 for printing a Random Number");
System.out.println("====================================================");
System.out.println("====================================================");
System.out.println("====================================================");
//Getting desired input from user
choice=sc.nextInt();
//starting switch case
switch(choice) 
{

case 1:
System.out.println("Enter the first number");
a=sc.nextDouble();
System.out.println("Enter the second number");
b=sc.nextDouble();
result=a+b;
System.out.println("The sum of the numbers "+a+" and "+b+" is = "+result);
break;
case 2:
System.out.println("Enter the first number");
a=sc.nextDouble();
System.out.println("Enter the second number");
b=sc.nextDouble();
result=a-b;
System.out.println("The difference of the numbers "+a+" and "+b+" is = "+result);
break;
case 3:
System.out.println("Enter the first number");
a=sc.nextDouble();
System.out.println("Enter the second number");
b=sc.nextDouble();
result=a*b;
System.out.println("The product of the numbers "+a+" and "+b+" is = "+result);
break;
case 4:
System.out.println("Enter the first number");
a=sc.nextDouble();
System.out.println("Enter the second number");
b=sc.nextDouble();
result=a/b;
System.out.println("In Division of "+a+" and "+b+"The Quotient is = "+result);
System.out.println("The remainder is = "+(a%b));
break;
case 5:
System.out.println("Enter the number to find Square");
a=sc.nextDouble();
result=a*a;
System.out.println("The Square of the number "+a+" is = "+result);
break;
case 6:
System.out.println("Enter the number to find Square root");
a=sc.nextDouble();
result=Math.sqrt(a);
System.out.println("The Square root of the number "+a+" is = "+result);
break;
case 7:
System.out.println("Enter the number to find Reciprocal");
a=sc.nextDouble();
result=1/a;
System.out.println("The Reciprocal of the number "+a+" is = "+result);
break;
case 8:
System.out.println("Enter a number to get its Absolute value ");
a=sc.nextDouble();
result=Math.abs(a);
System.out.println("The Absolute of the number is "+result);
break;
case 9:
System.out.println("Enter a number to Round it off");
a=sc.nextDouble();
result=Math.round(a);
System.out.println("The number after rounding off "+result);
break;
case 10:
System.out.println("Enter a number to find its Cube Root");
a=sc.nextDouble();
result=Math.cbrt(a);
System.out.println("Cube root of the number "+result);
case 11:
System.out.println("Enter a number to find smallest inter value of it");
a=sc.nextDouble();
result=Math.ceil(a);
System.out.println("Smallest Integer Value "+result);
break;
case 12:
System.out.println("Enter a number to find largest inter value of it");
a=sc.nextDouble();
result=Math.floor(a);
System.out.println("Largest Integer Value "+result);
break;
case 13:
a = Math.random() *10;  
System.out.println("Random number is "+a);
break;

default:
System.out.println("Invalid choice!! Please make a valid choice !!!");
}
//checking if user want to continue or exit the program
System.out.println("To continue calculation Press 1 else Press any button to exit");
//getting user input
cd=sc.nextInt();
//Checking the condition of do-while loop
}while(cd==1);
}
}