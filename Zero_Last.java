import java.util.*;
public class Zero_Last {
    public static void main(String[] args)
    {
        List<Integer> l=new LinkedList<>(Arrays.asList(0,0,0,8,3,3,5,6,0,0,0,7,8,0,3,4,5,0));
        int i=0,j=0;
        int siz=l.size();
        while(i<siz)
        {
                    
            // if(l.get(i)==0)
            // {
            // l.remove(i);
            // l.add(0);
            // siz--;
            // }
            // i++;
            // if(l.get(i-1)==0)
            // i--; 

            //Another Method
            if(l.get(i)!=0)
            {
                int val=l.get(i);
                l.set(i,l.get(j));
                l.set(j,val);
                j++;
                
            }
            i++;
        }
        
        for(int y:l)
        System.out.print(y+"");
    }
}


