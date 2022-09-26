/*Section6:6. Write a java program to find following using conditional operator and 
without using looping and decision making(f) Difference between Sum of product of consecutive even digits except 2 
and 6 and Sum of product of consecutive odd digits except 3 and 7 of any 4 digit
number*/
import java.util.*;
class Section6_f
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,d1,d2,ed1=0,ped=0,pod=0,sed=0,sod=0,diff=0;
System.out.print("Enter a 4-digit integer:");
n=sc.nextInt();
d1=n%10;
n=n/10;
d2=n%10;
ped=(d1%2==0&&d1!=2&&d1!=6)&&(d2%2==0&&d2!=2&&d2!=6)?d1*d2:0;
sed=sed+ped;
pod=(d1%2!=0&&d1!=3&&d1!=7)&&(d2%2!=0&&d2!=3&&d2!=7)?d1*d2:0;
sod=sod+pod;
d1=d2;
n=n/10;
d2=n%10;
ped=(d1%2==0&&d1!=2&&d1!=6)&&(d2%2==0&&d2!=2&&d2!=6)?d1*d2:0;
sed=sed+ped;
pod=(d1%2!=0&&d1!=3&&d1!=7)&&(d2%2!=0&&d2!=3&&d2!=7)?d1*d2:0;
sod=sod+pod;
d1=d2;
n=n/10;
d2=n%10;
ped=(d1%2==0&&d1!=2&&d1!=6)&&(d2%2==0&&d2!=2&&d2!=6)?d1*d2:0;
sed=sed+ped;
pod=(d1%2!=0&&d1!=3&&d1!=7)&&(d2%2!=0&&d2!=3&&d2!=7)?d1*d2:0;
sod=sod+pod;
d1=d2;
d2=n/10;
ped=(d1%2==0&&d1!=2&&d1!=6)&&(d2%2==0&&d2!=2&&d2!=6)?d1*d2:0;
sed=sed+ped;
pod=(d1%2!=0&&d1!=3&&d1!=7)&&(d2%2!=0&&d2!=3&&d2!=7)?d1*d2:0;
sod=sod+pod;
diff=sed-sod;
System.out.print("Difference is:"+diff);
}
}
