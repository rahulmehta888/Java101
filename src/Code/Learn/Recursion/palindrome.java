package Code.Learn.Recursion;

public class palindrome {
    public static boolean compute(Integer n)
    {
        Integer k=n;
        Integer a=0;
        if (n/10==0)
        {
            return true;
        }
        else
            {
              while(k>10)
              {
                  k=k/10;
                  a++;
              }
              if (k==n%10){
                  //System.out.println(10^6);
                  int x = (int) ((n - (k * (Math.pow(10, a )))) / 10);
                  System.out.println(x);

                  return compute((int) x);
              }
              else
              {
                  return false;
              }

        }

    }
    public boolean execute (Integer n){
        return compute(n);
    }
}
