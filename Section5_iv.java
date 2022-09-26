/*Section5:Write a java program to find following without using looping and decision 
making(IV). Sum of product of consecutive digits of any 4 digit number? Supoose
num=1234 then output= 4*3+3*2+2*1*/
import java.util.*;
class Section5_iv
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,d=0,p=1,s=0;
System.out.print("Enter a 4-digit number:");
n=sc.nextInt();
d=n%10;
p=p*d;
n=n/10;
d=n%10;
p=p*d;
s=s+p;
p=d;
n=n/10;
d=n%10;
p=p*d;
s=s+p;
p=d;
d=n/10;
p=p*d;
s=s+p;
System.out.print("Sum of product of consecutive digit of a four digit number is:"+s);
}
}