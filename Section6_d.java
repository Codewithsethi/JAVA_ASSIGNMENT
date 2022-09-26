/*Section6:6. Write a java program to find following using conditional operator and 
without using looping and decision making(d) Sum of product of consecutive even digits of any 4 digit number? Supoose 
num=1624 then output= 4*2+2*6*/
import java.util.*;
class Section6_d
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,d=0,t=0,s=0,p=1;
System.out.print("Enter a 4-digit number:");
n=sc.nextInt();
d=n%10;
t=(d%2==0)?d:0;
p=p*t;
n=n/10;
d=n%10;
t=(d%2==0)?d:0;
p=p*t;
s=s+p;
p=(d%2==0)?d:0;
n=n/10;
d=n%10;
t=(d%2==0)?d:0;
p=p*t;
s=s+p;
p=(d%2==0?d:0);
d=n/10;
t=(d%2==0)?d:0;
p=p*t;
s=s+p;
System.out.print("Sum of product of consecutive even digit of is:"+s);
}
}

