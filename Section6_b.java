/*Section6:6. Write a java program to find following using conditional operator and 
without using looping and decision making(b) Sum of all odd digits of any 4 digit number*/
import java.util.*;
import java.util.*;
class Section6_b
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,t=0,d=0,s=0;
System.out.print("Enter a 4-digit number:");
n=sc.nextInt();
d=n%10;
t=(d%2!=0)?d:0;
s=s+t;
n=n/10;
d=n%10;
t=(d%2!=0)?d:0;
s=s+t;
n=n/10;
d=n%10;
t=(d%2!=0)?d:0;
s=s+t;
d=n/10;
t=(d%2!=0)?d:0;
s=s+t;
System.out.print("Sum of odd digits of 4-digit number is:"+s);
}
}