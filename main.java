import java.util.Scanner;
class cal
{
double a,b;
double sum,sub,mul,div;
Scanner s=new Scanner(System.in);
cal()
{
sum=0;
sub=0;
mul=0;
div=0;
}
void get()
{
System.out.println("enter value for a and b");
a=s.nextDouble();
b=s.nextDouble();
}
void calculate()
{
sum=a+b;
sub=a-b;
mul=a*b;
div=a/b;
}
void display()
{
System.out.println("sum="+sum+"\n sub="+sub+"\nmul="+mul+"\ndiv="+div);
}
}

class main
{
public static void main(String args[])
{
cal obj=new cal();
obj.get();
obj.calculate();
obj.display();
}
}
