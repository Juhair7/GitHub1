import java.util.*;
public class ConfSq {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c,min;
        for(int i=0;i<(2*n-1);i++)
        {
            c=i;
            if(i>=n)
            {
                c=2*n-i-2;
            }
            for(int j=0;j<(2*n-1);j++)
            {
                min =j;
                if(j>=n)
            {
                min=2*n-j-2;
            }
                min=(c>min)?min:c;
                System.out.printf("%2d ", n-min);
                
            }
            
            System.out.println();
        }
        sc.close();
    }
}
