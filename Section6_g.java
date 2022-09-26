/*Section6:6. Write a java program to find following using conditional operator and 
without using looping and decision making(g) Write a java program to find sum of product of corresponding even digits of 
first any digit number and corresponding odd digit of any 4 digit number Such as 
n=1234 m=4567 output=4*7+2*5*/
import java.util.*;
class Section6_g
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int m,n,md=0,nd=0,p=0,s=0;
System.out.print("Enter first 4-digit integer:");
m=sc.nextInt();
System.out.print("Enter first 4-digit integer:");
n=sc.nextInt();
md=m%10;
nd=n%10;
p=(md%2==0&&nd%2!=0)?md*nd:0;
s=s+p;
m=m/10;
n=n/10;
md=m%10;
nd=n%10;
p=(md%2==0&&nd%2!=0)?md*nd:0;
s=s+p;
m=m/10;
n=n/10;
md=m%10;
nd=n%10;
p=(md%2==0&&nd%2!=0)?md*nd:0;
s=s+p;
md=m/10;
nd=n/10;
p=(md%2==0&&nd%2!=0)?md*nd:0;
s=s+p;
System.out.println("sum is:"+s);
}
}