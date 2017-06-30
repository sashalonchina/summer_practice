package sample.summer_practice;

import java.awt.*;
<<<<<<< HEAD
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/** Класс графического интерфейса */
public class Visual extends JPanel
{
    private int heapSize;

    private Graphics2D g2d;

    private int[] array;

    private static int w;

    public Visual(int[] arr, int spd)
    {
        array = arr;

        buildHeap(array);

        Timer timer = new Timer(spd, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (heapSize == 1) return;

                swap(array, 0, heapSize - 1);

                heapSize--;

                heapify(array, 0);

                repaint();
            }
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g2d = (Graphics2D)g;

        w = getWidth();

        g2d.setBackground(Color.white);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.black);

        g2d.drawLine(w/2, 40, w/2 - 120, 120);
        g2d.drawLine(w/2, 40, w/2 + 120, 120);
        g2d.drawLine(w/2 - 120, 120, w/2 - 180, 200);
        g2d.drawLine(w/2 - 120, 120, w/2 - 60, 200);
        g2d.drawLine(w/2 + 120, 120, w/2 + 180, 200);
        g2d.drawLine(w/2 + 120, 120, w/2 + 60, 200);
        g2d.drawLine(w/2 - 180, 200, w/2 - 220, 280);
        g2d.drawLine(w/2 - 180, 200, w/2 - 150, 280);
        g2d.drawLine(w/2 - 60, 200, w/2 - 60, 280);

        g2d.setColor(Color.blue);

        g2d.fillOval(w/2 - 10, 30, 20, 20);
        g2d.fillOval(w/2 - 130, 110, 20, 20);
        g2d.fillOval(w/2 + 110, 110, 20, 20);
        g2d.fillOval(w/2 - 190, 190, 20, 20);
        g2d.fillOval(w/2 - 70, 190, 20, 20);
        g2d.fillOval(w/2 + 170, 190, 20, 20);
        g2d.fillOval(w/2 + 50, 190, 20, 20);
        g2d.fillOval(w/2 - 70, 270, 20, 20);
        g2d.fillOval(w/2 - 230, 270, 20, 20);
        g2d.fillOval(w/2 - 160, 270, 20, 20);

        g2d.dispose();
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
    private void buildHeap(int[] a)
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
    private void heapify(int[] a, int i)
    {
        int l = left(i), r = right(i), largest = i, y = 30, x = w/2 - 10, sc = 1;

        if ((l < heapSize) && (a[i] < a[l])) largest = l;
        if ((r < heapSize) && (a[largest] < a[r])) largest = r;

        g2d.setColor(Color.white);

        g2d.drawString("" + a[largest], x, y);

        if (i != largest)
        {
            y += 80;
            x += 120/sc;

            sc++;

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
    private int right(int i) {
        return 2 * i + 1;
    }

    /**
     * Возвращает индекс левого потомка текущего узла
     *
     * i - индекс текущего узла кучи
     * return - индекс левого потомка
     */
    private int left(int i) {
        return 2 * i + 2;
    }

    /**
     * Меняет местами два элемента в массиве
     *
     * a - массив
     * i - индекс первого элемента
     * j - индекс второго элемента
     */
    private void swap(int[] a, int i, int j)
    {
        int temp = a[i];

        a[i] = a[j];
        a[j] = temp;
=======
import java.awt.event.*;
import javax.swing.*;

/** Класс графического интерфейса */
public class Visual extends JFrame
{
    /** Задать длину h и ширину w окна, две кнопки button1, button2 и текст label */
    private static int scale = 2;
    private int w = 360 * scale, h = 270 * scale;

    private JButton button1 = new JButton("Пауза");

    private JLabel label = new JLabel("Здесь должна быть визуализация");

    private Image img;

    /** Конструктор класса */
    public Visual()
    {
        super();

        /** Размеры и положение окна, задания по выходу из окна выходить из приложения */
        this.setSize(w, h);
        this.setBounds(h, w, w, h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /** Контейнер для группировки элементов */
        Container container = this.getContentPane();

        container.setLayout(null);

        /** Размеры и положение кнопок */
        button1.setSize(70 * scale, 30 * scale);
        button1.setLocation(145 * scale,220 * scale);

        /** Размеры и положение текста */
        label.setSize(300 * scale, 180 * scale);
        label.setLocation(30 * scale, 20 * scale);

        /** Добавление элементов в окно */
        container.add(label);
        container.add(button1);
>>>>>>> origin/master
    }
}