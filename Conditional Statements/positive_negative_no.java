// Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;
 class classmain
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("\nEnter a number :");
        int num=ob.nextInt();
        if(num>0)
        {
            System.out.print("\nPositive");
        }
        else if (num<0)
        {
            System.out.print("\nNegative");
        }
        else
        {
            System.out.print("\nZero");
        }
    }
}
