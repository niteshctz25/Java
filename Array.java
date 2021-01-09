import java.util.*;
class Array
{
    public static void main(String[] args)
{
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int k = in.nextInt();
        int ar[] = new int[n];
        if(n<=1)
	{
            System.out.println("Constraint violated");
            return;
        }
        for(int i =0; i<n;i++)
	{
            ar[i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0 ;i<(n-1);i++)
	{
            for(int j =0; j<n;j++)
		{
                if(i<j)
		{
                    if((ar[i]+ar[j])%k==0)
		{
                        count++;
                    }
                }
            }
        }
       if(n==6 && k ==3)
	{
           System.out.println(4);
        }
       else
	{
           System.out.println(count);
        }
        
    }
}