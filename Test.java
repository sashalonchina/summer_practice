package sample.summer_practice;

import java.io.*;
import java.util.Random;

public class Test
{
    /** Константы для задания:
     *  Максимальная длина массива случайных чисел - maxLenArr
     *  Максимальная длина случайной строки - maxLenStr */
    static int maxLenArr = 50, maxLenStr = 20;

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

    /** Метод для генерации массивов разных данных */
    public static void createArray()
    {
        /** Массив с типами данных, по которым будет проходить генерация */
        String[] types = {"strng", "intgr", "dbl", "bt", "bln", "shrt", "chr", "lng", "flt"};

        /** Инициализация:
         *  Объекта класса Random - rand
         *  Генерация длины массива - lengh
         *  Генерация инекса массива типа данных - indType
         *  Массива случайных данных - res*/
        final Random rand = new Random();

        int lengh = rand.nextInt(maxLenArr), indType = rand.nextInt(types.length);

        String[] res = new String[lengh];

        /** Выбор типа для генерации на основе датчика случайных чисел */
        switch (types[indType])
        {

            /** Генерация массива случайных данных типа String */
            case "strng":
            {
                int strlen = rand.nextInt(maxLenStr);

                for (int i = 0; i < lengh; i++)
                {
                    for (int j = 0; j < strlen; j++) res[i] = "" + (char) (rand.nextInt(26) + 'a');
                }
            }

            /** Генерация массива случайных данных типа int */
            case "intgr":
            {
                for (int i = 0; i < lengh; i++) res[i] = "" + rand.nextInt();
            }

            /** Генерация массива случайных данных типа double */
            case "dbl":
            {
                for (int i = 0; i < lengh; i++) res[i] = "" + rand.nextDouble();
            }

            /** Генерация массива случайных данных типа byte */
            case "bt":
            {
                byte[] tmp = new byte[lengh];

                rand.nextBytes(tmp);

                for (int i = 0; i < lengh; i++) res[i] = "" + tmp[i];
            }

            /** Генерация массива случайных данных типа boolean */
            case "bln":
            {
                for (int i = 0; i < lengh; i++) res[i] = "" + rand.nextBoolean();
            }

            /** Генерация массива случайных данных типа short */
            case "shrt":
            {
                for (int i = 0; i < lengh; i++) res[i] = "" + (int) Math.floor(Math.random() * 65536 - 32768);
            }

            /** Генерация массива случайных данных типа char */
            case "chr":
            {
                for (int i = 0; i < lengh; i++) res[i] = "" + (char) (rand.nextInt(26) + 'a');
            }

            /** Генерация массива случайных данных типа long */
            case "lng":
            {
                for (int i = 0; i < lengh; i++) res[i] = "" + rand.nextLong();
            }

            /** Генерация массива случайных данных типа float */
            case "flt":
            {
                for (int i = 0; i < lengh; i++) res[i] = "" + rand.nextFloat();
            }
        }

        /** Запись массива случайных данных в файл */
        write("in.txt", res);
    }
}
