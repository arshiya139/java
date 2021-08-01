import java.util.Scanner;
class MyPoint
{
int x,y;

MyPoint()
{
x=0;
y=0;
}
MyPoint(int x,int y)
{
this.x=x;
this.y=y;
}
void ToString()
{
System.out.println("("+x+","+y+")");
}
void distance(int x,int y)
{
int a=this.x-x;
int b=this.y-y;
System.out.println("("+a+","+b+")");
}
void distance(int x)
{
int a=this.x-x;
System.out.println("("+a+","+y+")");
}
}
class main_3
{
public static void main(String args[])
{
MyPoint s1 =new MyPoint(2,6);
MyPoint s2 =new MyPoint(6,3);
s1.ToString();
s1.distance(1,3);
s1.distance(2);
s2.ToString();
s2.distance(2,6);
s2.distance(2);
}
} 

