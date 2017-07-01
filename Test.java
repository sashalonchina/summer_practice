package sample.summer_practice;

import java.io.*;
import java.util.Random;

public class Test
{

    private static int maxCount = 50;


    public static void write(String name, int[] a)
    {

        File file = new File(name);

        try
        {

            if (!file.exists()) file.createNewFile();

            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try
            {

                for (int i = 0; i < a.length - 1; i++)
                {
                    out.print(a[i]);
                    out.print(" ");
                }

                out.print(a[a.length - 1]);
                out.print("\n");
            }

            finally
            {
                out.close();
            }
        }

         catch(IOException e)
        {
            throw new RuntimeException(e);
        }

    }

     public Test(int maxLenArr)
    {
        final Random rand = new Random();

        int[] res = new int[maxLenArr];

        for (int i = 0; i < maxLenArr; i++) res[i] = rand.nextInt(maxCount);


        write("in.txt", res);
    }
}
