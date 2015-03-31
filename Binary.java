import java.io.*;
import java.util.*;
public class Binary
{
    public static void main(String ar[])
    {
        int[] rem = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        int count=0;
         int a=no;
        for(int i = 0; i <a; i++)
        {
            
            rem[i] = no % 2;
            no= no/2;

             count=i;
            if(no==0 &&rem[i]==0)
            {
                break;
            }
        }
        System.out.print("Binary number for "+a+" is ");
        for(int i = count-1; i >= 0; i--)
        {    
            System.out.print(rem[i]+" ");
        }
        System.out.println();
    }
}