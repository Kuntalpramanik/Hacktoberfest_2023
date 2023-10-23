//java program to check the number is prime or not
import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int flag=0;
        for(int i=2; i<=n; i++)
        {
           if(n%i==0)
           {
              flag=1;
              break;
           }
        }
        if(flag==0)
        {
        System.out.print(+n+" is  prime");
        }
        else
        {
        System.out.print(+n+" is not prime");
        }
    }
}
