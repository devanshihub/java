import java.util.*;
// question 1

public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=0;i<n;i++)
      {
         for(int k=0;k<n;k++)
          System.out.print("* ");
          System.out.println();
      }
   }
}


// question 2
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=0;i<n;i++)
      {
         for(int k=i;k>=0;k--)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 3
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=n;i>0;i--)
      {
         for(int k=i;k>0;k--)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 4
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=7;
      for(int i=n;i>0;i--)
      {
         for(int k=i;k>0;k--)
          System.out.print("  ");
         for(int j=n-i;j>=0;j--)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 5
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=n;i>0;i--)
      {
         for(int k=0;k<n-i;k++)
          System.out.print("  ");
         for(int j=i;j>0;j--)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 6
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=n,space=0;i>0;i--,space=space+2)
      {
         for(int k=0;k<space;k++)
          System.out.print("  ");
         for(int j=i;j>0;j--)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 7
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=1;i<=n;i++)
      {
        for(int k=1;k<=n;k++)
        if(i==1 || k==1 || k==n ||i==n)
          System.out.print("* ");
          else
          System.out.print("  ");
          System.out.println();
      }
   }
}
*/

// question 8
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=1;i<=n;i++)
      {
        for(int k=1;k<=n;k++)
        if(i==k || i+k==n+1)
          System.out.print("* ");
          else
          System.out.print("  ");
          System.out.println();
      }
   }
}
*/

// question 9
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=0;i<n;i++)
      {
        for(int k=n-i;k>0;k--)
          System.out.print("  ");
         for(int j=i*2+1;j>0;j--)
          System.out.print("* ");
         
          System.out.println();
      }
   }
}
*/

// question 10
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=n;i>0;i--)
      {
        for(int k=n-i;k>0;k--)
          System.out.print("  ");
         for(int j=i*2-1;j>0;j--)
          System.out.print("* ");
         
          System.out.println();
      }
   }
}
*/

// question 11
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=6;
      for(int i=1;i<=n;i++)
      {
         for(int j=n-i;j>0;j--)
          System.out.print(" ");
         for(int j=0;j<i;j++)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 12
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      int space=n*2-2;
      for(int i=1;i<=n;i++,space=space-2)
      {
         for(int j=1;j<=space;j++)
          System.out.print(" ");
          System.out.print("*");
         for(int j=i-1;j>0;j--)
          System.out.print(" ! *");
          System.out.println();
      }
   }
}
*/

// question 13
 /* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=1;i<=n;i++)
      {
         for(int j=0;j<i;j++)
          System.out.print("* ");
          System.out.println();
      }
      for(int i=n-1;i>0;i--)
      {
         for(int j=0;j<i;j++)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 14
 /* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=1;i<=n;i++)
      {
         for(int j=n-i;j>0;j--)
          System.out.print("  ");
         for(int k=1;k<=i;k++)
          System.out.print("* ");
          System.out.println();
      }
      for(int i=1;i<n;i++)
      {
         for(int j=1;j<=i;j++)
          System.out.print("  ");
         for(int k=n-i;k>0;k--)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 15
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=8;
      for(int i=n;i>0;i--)
      {
         for(int j=0;j<i-1;j++)
          System.out.print("  ");
         for(int k=0;k<i;k++)
          System.out.print("* ");
          System.out.println();
      }

      for(int i=2;i<=n;i++)
      {
         for(int j=0;j<i-1;j++)
          System.out.print("  ");
         for(int k=0;k<i;k++)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 16
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=n,space=0;i>0;i--,space=space+2)
      {
         for(int k=0;k<space;k++)
          System.out.print("  ");
         for(int j=i;j>0;j--)
          System.out.print("* ");
          System.out.println();
      }

      for(int i=2,space=(n-1)*2-2;i<=n;i++,space=space-2)
      {
         for(int j=0;j<space;j++)
          System.out.print("  ");
         for(int k=i;k>0;k--)
          System.out.print("* ");
         
          System.out.println();
      }
   }
}
*/

// question 17
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=13;
      n=(n-1)/2;
 
      for(int i=n,space=1;i>0;i--,space=space+2)
      {
         for(int star=1;star<=i;star++)
          System.out.print("* ");
          for(int j=1;j<=space;j++)
          System.out.print("  ");
          for(int star=1;star<=i;star++)
          System.out.print("* ");
          System.out.println();
      }
      System.out.println();
      for(int i=1,space=(n*2)-1;i<=n;i++,space=space-2)
      {
         for(int j=1;j<=i;j++)
          System.out.print("* ");
         for(int k=1;k<=space;k++)
          System.out.print("  ");
          for(int j=1;j<=i;j++)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 18
 /* 
public class Main 
{
	public static void main(String args[])
	{
      int n=9;
       n=(n+1)/2;
 
      for(int i=n-1,star=1;i>=0;i--,star=star+2)
      {
         for(int space=i;space>0;space--)
          System.out.print("  ");
          for(int j=0;j<star;j++)
          System.out.print("* ");
          System.out.println();
      }
      for(int i=1,star=(n-1)*2-1;i<n;i++,star=star-2)
      {
         for(int space=i;space>0;space--)
          System.out.print("  ");
          for(int j=0;j<star;j++)
          System.out.print("* ");
          System.out.println();
      }
   }
}
*/

// question 19
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=9;
      int m=(n-1)/2;
      for(int i=0;i<n;i++)
          System.out.print("* ");
          System.out.println();
      for(int i=m,space=1;i>0;i--,space=space+2)
      {
         for(int j=i;j>0;j--)
          System.out.print("* ");
          for(int k=0;k<space;k++)
          System.out.print("  ");
          for(int j=i;j>0;j--)
          System.out.print("* ");
          System.out.println();
      }
      for(int i=2,space=((m-1)*2)-1;i<=m;i++,space=space-2)
      {
         for(int j=i;j>0;j--)
          System.out.print("* ");
          for(int k=0;k<space;k++)
          System.out.print("  ");
          for(int j=i;j>0;j--)
          System.out.print("* ");
          System.out.println();
      }
      for(int i=0;i<n;i++)
          System.out.print("* ");
          System.out.println();
   }
}
   */

// question 20
 /* 
public class Main 
{
	public static void main(String args[])
	{
      int n=7;
      n=(n+1)/2;

      for(int j=0;j<n-1;j++)
          System.out.print(" ");
      System.out.print("*");
      System.out.println();
      for(int i=2,space=1;i<=n;i++,space=space+2)
      {
         for(int j=0;j<n-i;j++)
          System.out.print(" ");
         System.out.print("*");
         for(int j=1;j<=space;j++)
          System.out.print(" ");
          System.out.print("*");
          System.out.println();
      }
      for(int i=1,space=(n-2)*2-1;i<=n-2;i++,space=space-2)
      {
         for(int j=0;j<i;j++)
          System.out.print(" ");
         System.out.print("*");
         for(int j=1;j<=space;j++)
          System.out.print(" ");
          System.out.print("*");
          System.out.println();
      }
      for(int j=0;j<n-1;j++)
          System.out.print(" ");
      System.out.println("*");
   }
}
*/


// question 22
/* 
public class Main 
{
	public static void main(String args[])
	{
      int l=5;
      int m=l-1;
      int n=l*2-1;
      for(int i=0;i<n;i++)
          System.out.print("* ");
          System.out.println();
      for(int i=m,space=1;i>0;i--,space=space+2)
      {
         for(int j=i;j>0;j--)
          System.out.print("* ");
          for(int k=0;k<space;k++)
          System.out.print("  ");
          for(int j=i;j>0;j--)
          System.out.print("* ");
          System.out.println();
      }

   }
}
*/

// question 23
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=0;i<n;i++)
      {
        for(int k=n-i;k>0;k--)
          System.out.print("  ");
         for(int j=i*2+1;j>0;j--)
          System.out.print("1 ");
         
          System.out.println();
      }
   }
}
*/

// question 24
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=0;i<n;i++)
      {
        for(int k=n-i;k>0;k--)
          System.out.print("  ");
         for(int j=0;j<i*2+1;j++)
          System.out.print(i+1+" ");
         
          System.out.println();
      }
   }
}
*/

// question 25
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=3;
      int num=1;
      for(int i=0;i<n;i++)
      {
        for(int k=n-i;k>0;k--)
          System.out.print("  ");
         for(int j=0;j<i*2+1;j++)
         {
            System.out.print(num+" ");
            num++;
         }
          
         
          System.out.println();
      }
   }
}
 */

 // question 26
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=0;i<n;i++)
      {
        for(int k=n-i;k>0;k--)
          System.out.print("  ");
         for(int j=0;j<i*2+1;j++)
          System.out.print(j+1+" ");
         
          System.out.println();
      }
   }
}
*/

 // question 27
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=1;i<=n;i++)
      {
        for(int k=n-i;k>0;k--)
          System.out.print("  ");
         for(int j=0;j<i;j++)
          System.out.print(j+1+" ");
          for(int j=i-1;j>=1;j--)
          System.out.print(j+" ");
          System.out.println();
      }
   }
}
*/

 // question 29
/* 
 public class Main 
 {
    public static void main(String args[])
    {
       int n=5;
       int zero=1;
       for(int k=n-1;k>0;k--)
           System.out.print("  ");
       System.out.print(1);
       System.out.println();

       for(int i=2;i<=n;i++,zero=zero+2)
       {
         for(int k=n-i;k>0;k--)
           System.out.print("  ");
         System.out.print(i+" ");
         for(int k=1;k<=zero;k++)
           System.out.print("0 ");
           System.out.print(i);
           System.out.println();
       }
    }
 }
    */

// question 30
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=0;i<n;i++)
      {
         for(int k=n;k>0;k--)
          System.out.print(k+" ");
          System.out.println();
      }
   }
}
   */

 // question 31
/* 
public class Main 
{
	public static void main(String args[])
	{
      int n=5;
      for(int i=1;i<=n;i++)
      {
         for(int k=n;k>0;k--)
         {
            if(k==i)
            System.out.print("* ");
            else
            System.out.print(k+" ");
         }
          System.out.println();
      }
   }
}
*/
