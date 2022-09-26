/*Section-5:Write a java program to find following without using looping and decision 
making (iii). Find the value available at position required by user it may be 10, 
100 or 1000.*/
import java.util.*;
class Section5_iii
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,p,t;
System.out.print("Enter a 4-digit number:");
n=sc.nextInt();
System.out.print("Enter the position value that you want to know(10,100,1000):");
p=sc.nextInt();
t=(n/p)%10;
System.out.print("Availavle position value at\s"+p+"\sis:"+t);
}
}
