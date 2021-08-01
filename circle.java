import java.util.Scanner;
class circle
{
private Double radius=1.0;
Scanner s=new Scanner(System.in);
circle()
{
radius =0.0;
}
circle(double radius)
{
System.out.println(+radius);
}
void getRadius()
{
System.out.println("enter value of radius");
radius=s.nextDouble();
}
void calArea()
{
double area=3.14*radius*radius;
System.out.println(+area);
}
}
class main_2
{
public static void main(String args[])
{
circle obj=new circle(2.9);
obj.getRadius();
obj.calArea();
}
}