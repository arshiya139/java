import java.util.*;
public class Recruitment
{
String name,qual;
int exp,i,n;
//String gender=" ";
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("enter name");
name=s.nextLine();
//name=s.nextLine();
qual=s.nextLine();
qual=s.nextLine();
exp=s.nextInt();
//gender=s.nextLine();

}

void display()
{


System.out.println("name ="+name);
System.out.println("exp ="+exp);

}
}

class  main_5 
{ 
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of candidates");
n=s.nextInt();
Recruitment r[] =new Recruitment[n];

for(i=1;i<=n;i++)
{
System.out.println("Enter candidate detail :-"+i);

r[i]=new Recruitment();
r[i].input();

}

for( i=1;i<=n;i++)
{
System.out.println("details are"+i);
r[i].display();
}
}
}


