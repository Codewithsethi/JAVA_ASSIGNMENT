/*Section6:6. Write a java program to find following using conditional operator and 
without using looping and decision making(e) Sum of product of consecutive odd digits of any 4 digit number? Supoose 
num=1356 then output= 5*3+ 3*1*/
import java.util.*;
class Section6_e  
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,d=0,t=0,s=0,p=1;
System.out.print("Enter a 4-digit number:");
n=sc.nextInt();
d=n%10;
t=(d%2!=0)?d:0;
p=p*t;
n=n/10;
d=n%10;
t=(d%2!=0)?d:0;
p=p*t;
s=s+p;
p=(d%2!=0)?d:0;
n=n/10;
d=n%10;
t=(d%2!=0)?d:0;
p=p*t;
s=s+p;
p=(d%2!=0?d:0);
d=n/10;
t=(d%2!=0)?d:0;
p=p*t;
s=s+p;
System.out.print("Sum of product of consecutive odd digit of is:"+s);
}
}