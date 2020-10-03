import java.util.Scanner;
import java.lang.*;  
public class Number1{
	public static void reverse(int i) {
      int rev = 0;
      while(i != 0) {
         int digit = i % 10;
         rev = rev * 10 + digit;
         i /= 10;
      }
      System.out.println("Reversed: " + rev);
   }
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("enter the value of x");
		 int x= sc.nextInt(); 
		 System.out.println(" enter the value of y");
		 int y= sc.nextInt(); 
		 System.out.println("enter the value of N");
		 int n= sc.nextInt(); 
		 int num=x*y;
		 int sum1=0;
		 int sum2=0;
		 int sum3=0;
		 int answer=0;
		 if(x!=0&& y!=0)
		 {
		 	for(int i=0;i<n;i++)
		 	{
		 		if(i%x==0)
		 		{
		 			sum1=sum1+i;
		 		}
		 	}
		 	for(int j=0;j<n;j++)
		 	{
		 		if(j%y==0)
		 		{
		 			sum2=sum2+j;
		 		}
		 	}
		 	for(int k=0;k<n;k++)
		 	{
		 		if(k%num==0)
		 		{
		 			sum3=sum3+k;
		 		}
		 	}
		 	answer=sum1+sum2-sum3;
		 	System.out.println("Sum of all multiple of x or y  "+":"+answer);
		 	reverse(answer);
		 }
	}
}