/*Section5-ii:Write a java program to find following without using looping and decision 
making (ii). find the face value and position value of any 4 digit number*/
import java.util.*;
class Section5_ii
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,t=0,d=0;
System.out.print("Enter any 4-digit number:");
n=sc.nextInt();
t=n%10;
System.out.println("face value\s"+t+"\sis:"+t);
System.out.println("position value\s"+t+"\sis:"+t*1);
n=n/10;
t=n%10;
System.out.println("face value\s"+t+"\sis:"+t);
System.out.println("position value\s"+t+"\sis:"+t*10);
n=n/10;
t=n%10;
System.out.println("face value\s"+t+"\sis:"+t);
System.out.println("position value\s"+t+"\sis:"+t*100);
t=n/10;
System.out.println("face value\s"+t+"\sis:"+t);
System.out.println("position value\s"+t+"\sis"+t*1000);
}
}