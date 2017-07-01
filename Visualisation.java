package sample.summer_practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.awt.event.KeyEvent;
import java.io.IOException;
=======
>>>>>>> origin/master
import javax.swing.*;

/** Класс графического интерфейса */
public class Visualisation extends JPanel
{
    private int[] array;

    private static int heapSize;

<<<<<<< HEAD
    private JButton play = new JButton("Пауза");

    private int scale = 2;
    private int minRad = 10;
    private int c = 0;

    private Graphics2D g2d;

    private Thread vizThread;

    private Timer timer;

    public void notifyViz() {
        vizThread.notify();
    }

    public Visualisation(int[] ar)
    {
        array = ar.clone();
    }

    public void timerStart()
    {
        timer.start();
    }

    public void setCont()
    {


        rep();
=======
    private JButton pause = new JButton("Пауза");

    private int scale = 2;
    private int minRad = 10;

    private Graphics2D g2d;

    public Visualisation(int[] arr, int sp)
    {
        array = arr;

        buildHeap(array);

        Timer timer = new Timer(sp, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (heapSize == 1) return;

                swap(array, 0, heapSize - 1);

                heapSize--;

                heapify(array, 0);

                rep();
                repaint();
            }
        });

        timer.start();
>>>>>>> origin/master
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g2d = (Graphics2D)g;

        g2d.setBackground(Color.white);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for(int i = 0; i < array.length; i++)
        {
            g2d.setColor(Color.red);
            g2d.fillOval(i * getWidth()/array.length + minRad, getHeight()/2 - array[i]/scale + minRad, array[i]/scale + minRad, array[i]/scale + minRad);
        }

        g2d.dispose();
    }

    public void rep()
    {
<<<<<<< HEAD


        repaint();
    }

=======
        for(int i = 0; i < array.length; i++)
        {
            g2d.setColor(Color.red);
            g2d.fillOval(i * getWidth()/array.length + minRad, getHeight()/2 - array[i]/scale + minRad, array[i]/scale + minRad, array[i]/scale
                        + minRad);
        }
    }



    /**
     * Сортировка с помощью кучи
     * Сначала формируется куча HeapSort.buildHeap(T[])
     * Теперь максимальный элемент массива находится в корне кучи. Его нужно
     * поменять местами с последним элементом и убрать из кучи (уменьшить
     * размер кучи на 1). Теперь в корне кучи находится элемент, который раньше
     * был последним в массиве. Нужно переупорядочить кучу так, чтобы
     * выполнялось основное условие кучи - a[parent] >= a[child]: heapify(int[], int, type)
     * После этого в корне окажется максимальный из оставшихся элементов.
     * Повторить до тех пор, пока в куче не останется 1 элемент
     *
     * a - сортируемый массив
     */


    /**
     * Построение кучи. Поскольку элементы с номерами начиная с a.length / 2 + 1 -
     * это листья, то нужно переупорядочить поддеревья с корнями в индексах
     * от 0 до a.length / 2 (метод heapify вызывать в порядке убывания индексов)
     *
     *  a - массив, из которого формируется куча
     */
    private static void buildHeap(int[] a)
    {
        heapSize = a.length;

        for (int i = a.length / 2; i >= 0; i--) heapify(a, i);
    }

    /**
     * Переупорядочивает поддерево кучи начиная с узла i так, чтобы выполнялось
     * основное свойство кучи - a[parent] >= a[child] or a[parent] <= a[child].
     *
     * a - массив, из которого сформирована куча
     * i - корень поддерева, для которого происходит переупорядосивание
     */
    private static void heapify(int[] a, int i)
    {
        int l = left(i), r = right(i), largest = i;

        if ((l < heapSize) && (a[i] < a[l])) largest = l;
        if ((r < heapSize) && (a[largest] < a[r])) largest = r;

        if (i != largest)
        {
            swap(a, i, largest);

            heapify(a, largest);
        }
    }

    /**
     * Возвращает индекс правого потомка текущего узла
     *
     * i - индекс текущего узла кучи
     * return - индекс правого потомка
     */
    private static int right(int i) {
        return 2 * i + 1;
    }

    /**
     * Возвращает индекс левого потомка текущего узла
     *
     * i - индекс текущего узла кучи
     * return - индекс левого потомка
     */
    private static int left(int i) {
        return 2 * i + 2;
    }

    /**
     * Меняет местами два элемента в массиве
     *
     * a - массив
     * i - индекс первого элемента
     * j - индекс второго элемента
     */
    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];

        a[i] = a[j];
        a[j] = temp;
    }
>>>>>>> origin/master
}
