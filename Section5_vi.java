/*Section5:Write a java program to find following without using looping and decision 
making (VI). find bitwise and , or , and xor of 2nd and 4th digit of any 4 digit 
number*/
import java.util.*;
class Section5_vi
{
public static void main(String arg[])
{ 
Scanner sc=new Scanner(System.in);
int m,md2=0,md4=0,bA=0,bO=0,bX=0;
System.out.print("Enter 4-digit integer:");
m=sc.nextInt();
md4=m%10;
md2=(m/100)%10;
bA=md2&md4;
bO=md2|md4;
bX=md2^md4;
System.out.println("2nd digit is:"+md2);
System.out.println("4th digit is:"+md4);
System.out.println("Bitwise AND is:"+bA);
System.out.println("Bitwise OR is:"+bO);
System.out.println("Bitwise XOR is:"+bX);
}
}


