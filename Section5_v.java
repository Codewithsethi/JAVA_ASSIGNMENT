/*Section5:Write a java program to find following without using looping and decision 
making (V). find sum of product of corresponding digits of two any 4 digit 
number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1 */
import java.lang.*;
import java.util.*;
class Section5_v
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,d1=0,d2=0,s=0;
System.out.print("Enter 1st 4-digit number:");
n1=sc.nextInt();
System.out.print("Enter 2nd 4-digit number:");
n2=sc.nextInt();
d1=n1%10;
d2=n2%10;
s=s+d1*d2;
n1=n1/10;
n2=n2/10;
d1=n1%10;
d2=n2%10;
s=s+d1*d2;
n1=n1/10;
n2=n2/10;
d1=n1%10;
d2=n2%10;
s=s+d1*d2;
d1=n1/10;
d2=n2/10;
s=s+d1*d2;
System.out.print("Sum of product of corressponding digits of two 4-digit number is:"+s);
}
}
