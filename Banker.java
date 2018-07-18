
public class MyClass {
    public static void main(String args[]) {
        int ar1[] = new int[] { 4, 0, 6, 1, 7 };
        int ar2 []= new int[] { 0, 2, 3, 2, 0 };
        int bool[] = new int[] { 0, 0, 0, 0, 0 };
        int num = 3;
            int nc = 0;
            int j = 0;
            for (int i = 0; i < 5; i++)
            {
                if (num >= ar1[i] )
                {
                   if (bool[i] == 0)
                    {
                      num = num + ar2[i];
                        bool[i] = 1;
                        nc++;                             
                                                if (nc==5)
                                             {
                                                break;
                                             }
                    }
                    
                  
                }
                  else
                {
                    j++;
                }
               
                      if (i==4  && j!=0)
                      {
                         i = 0;
                         j = 0;
                        continue;
                      }
               
            }

        System.out.println("" + num);
    }
}
