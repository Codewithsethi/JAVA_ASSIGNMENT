/*Section-5:Write a java program to find following without using looping and decision 
making I. Sum of all digits of any 4 digit numbers*/
import java.util.*;
class Section5_i
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,d=0,s=0;
System.out.print("Enter a 4-digit number:");
n=sc.nextInt();
d=n%10;
s=s+d;
n=n/10;
d=n%10;
s=s+d;
n=n/10;
d=n%10;
s=s+d;
d=n/10;
s=s+d;
System.out.print("Sum of four digit is:"+s);
}
}
