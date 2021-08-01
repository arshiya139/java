import java.util.Scanner;
class circle
{
private Double radius=1.0;
Scanner s=new Scanner(System.in);
circle()
{
radius=0.0;
}
circle(double x)
{
radius=x;
//System.out.println(+radius);
}
void getRadius()
{
System.out.println(+radius);
//System.out.println("enter value of radius");
//radius=s.nextDouble();
}
void calArea()
{
double area=3.14*radius*radius;
System.out.println(+area);
}
}
class main_1
{
public static void main(String args[])
{
circle obj1=new circle();
circle obj2=new circle(2.9);
obj1.getRadius();
obj1.calArea();
obj2.getRadius();
obj2.calArea();
}
}