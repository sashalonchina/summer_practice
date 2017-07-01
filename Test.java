package sample.summer_practice;

import java.io.*;
import java.util.Random;

public class Test
{
    /** Константы для задания:
<<<<<<< HEAD
     *  Максимальная длина массива случайных чисел - macCount
     */
    private static int maxCount = 50;
=======
     *  Максимальная длина массива случайных чисел - maxLenArr
<<<<<<< HEAD
     */
    private static int maxCount = 50;
=======
     *  Максимальная длина случайной строки - maxLenStr */
    static int maxLenArr = 50, maxLenStr = 20;
>>>>>>> origin/master
>>>>>>> origin/master

    /** Метод для записи тестового массива в файл */
    public static void write(String name, int[] a)
    {
        /** Создаем объект файла */
        File file = new File(name);

        try
        {
            /** Если файл не создан - создаем */
            if (!file.exists()) file.createNewFile();

            /** Объект для записи в файл */
<<<<<<< HEAD
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try
            {
                /** Записываем массив в файл */
                for (int i = 0; i < a.length - 1; i++)
                {
                    out.print(a[i]);
                    out.print(" ");
                }

                out.print(a[a.length - 1]);
                out.print("\n");
            }
=======
            
>>>>>>> origin/master

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

    /** Метод для генерации массивов разных данных */
<<<<<<< HEAD
    public Test(int maxLenArr)
    {
=======
<<<<<<< HEAD
    public Test(int maxLenArr)
    {
=======
    public static void createArray()
    {
        /** Массив с типами данных, по которым будет проходить генерация */
        String[] types = {"strng", "intgr", "dbl", "bt", "bln", "shrt", "chr", "lng", "flt"};

>>>>>>> origin/master
>>>>>>> origin/master
        /** Инициализация:
         *  Объекта класса Random - rand
         *  Генерация длины массива - lengh
         *  Генерация инекса массива типа данных - indType
<<<<<<< HEAD
         *  Массива случайных чисел - res*/
=======
<<<<<<< HEAD
         *  Массива случайных чисел - res*/
        final Random rand = new Random();

        int[] res = new int[maxLenArr];

        /** Генерация массива случайных данных типа int */
        for (int i = 0; i < maxLenArr; i++) res[i] = rand.nextInt(maxCount);

=======
         *  Массива случайных данных - res*/
>>>>>>> origin/master
        final Random rand = new Random();

        int[] res = new int[maxLenArr];

        /** Генерация массива случайных данных типа int */
        for (int i = 0; i < maxLenArr; i++) res[i] = rand.nextInt(maxCount);

>>>>>>> origin/master
        /** Запись массива случайных данных в файл */
        write("in.txt", res);
    }
}
