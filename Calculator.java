import java.util.Scanner;

 class Calculator

{

public static void main(String[] args)

{

   

 Scanner sc=new Scanner(System.in);

 System.out.println("Enter your choice : ");

 System.out.println("1. ADDITION");

 System.out.println("2. SUBTRACTION ");

 System.out.println("3. MULTIPLICATION ");

 int n=sc.nextInt();

   

 System.out.println("ENTER FIRST NUMBER ");

 double real=sc.nextDouble();

   

 System.out.println("ENTER SECOND NUMBER ");

 double imaginary=sc.nextDouble();

   

 double result=0;//'result' will store the result of operation

   

 switch(n)

 {

  case 1:

   result=real+imaginary;

   break;

  case 2:

   result=real-imaginary;

   break;

  case 3:

   result=real*imaginary;

   break;    

  default:

   System.out.println("YOU HAVE ENTERED A WRONG CHOICE");

   

 }

   

 System.out.println("RESULT = "+result);

}

}