package sample.summer_practice;

import java.io.*;
import java.util.Random;

public class Test
{
    /** Метод для записи тестового массива в файл */
    public static void write(String name, String[] a)
    {
        /** Создаем объект файла */
        File file = new File(name);

        try
        {
            /** Если файл не создан - создаем */
            if (!file.exists()) file.createNewFile();

            /** Объект для записи в файл */
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try
            {
                /** Записываем массив в файл */
                out.print(a);
            }

            finally
            {
                /**После чего мы должны закрыть файл
                  *Иначе файл не запишется*/
                out.close();
            }
        }

        /** "Ловим" исключения */
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    public static void createArray()
    {
        String[] types = {"string", "integer", "doub", "byt", "bool", "shrt", "chr", "lng", "flt"};

        final Random rand = new Random();

        int lengh = rand.nextInt(200);

        int indtype = rand.nextInt(9);

        switch (indtype)
        {
            case 0:
            {
                String[] res = new String[lengh];
            }

            case 1:
            {
                String[] res = new String[lengh];

                for (int i = 0; i < lengh; i++) res[i] = "" + rand.nextInt(400);

                write("in.txt", res);
            }

            case 2:
            {
                double[] res = new double[lengh];
            }

            case 3:
            {
                byte[] res = new byte[lengh];
            }

            case 4:
            {
                boolean[] res = new boolean[lengh];
            }

            case 5:
            {
                short[] res = new short[lengh];
            }

            case 6:
            {
                char[] res = new char[lengh];
            }

            case 7:
            {
                long[] res = new long[lengh];
            }

            case 8:
            {
                float[] res = new float[lengh];
            }
        }
    }
}
