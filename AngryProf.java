import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProf {

    public static void main(String[] args) {
    int k, n, cnt = 0;
    int time[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of test cases:");
   	int no = sc.nextInt();

   	for(int i = 0; i < no; i++)
   	{
   	System.out.print("Enter total no of students ");
   	k = sc.nextInt();
   	System.out.print("Enter students required by prof ");
   	n = sc.nextInt();
   	System.out.print("Enter time of students ");
   		for(int j = 0; j < k ; j++)
   		{
   			time[j] = sc.nextInt();		
      }   		

      for ( int m=0;m<k;m++)
      {
   		 if(time[m] < 0 || time[m] == 0)
   			{
   				cnt++;
   			}
      }
   			if(cnt >= n)
   			{
   				System.out.print("Lecture will not be cancelled..");
   			}
   			else
   			{
   				System.out.print("cancelled..");
   			}
    }

	}
}
