package sample.summer_practice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import sample.summer_practice.Visual;

/** Класс графического интерфейса */
public class GUI extends JFrame
{

    /**
     * Задать длину h и ширину w окна, константы, кнопки button1, button2, nexter, next, pause и текст label, outp и
     * текстовое поле text, speed, ps
     */
    private static int scale = 2;
    private static int maxCount = 50;

    private int w = 360 * scale, h = 270 * scale;
    private int spd = 0;
    private int pse = 0;
    private int maxLenArr = 10;
    private int con = 0;

    private ArrayList<HeapSort> hs;

    private Visualisation scene;

    private boolean flag = false;

    private String tmp;

    private int[] array = new int[maxLenArr];

    private JButton button1 = new JButton("Сгенерировать");
    private JButton button2 = new JButton("Ввести вручную");
    private JButton nexter = new JButton(">>");
    private JButton next = new JButton(">>");
    private JButton pause = new JButton("Следующий шаг");

    private JLabel label = new JLabel("Как задать массив?");
    private JLabel outp = new JLabel("Начало визуализации");

    private JTextField text = new JTextField("Введите массив");
    private JTextField speed = new JTextField("Введите задержку визуализации");
    private JTextField ps = new JTextField("Введите длину паузы");

    /** Конструктор класса */
    public GUI()
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
        button1.setSize(100 * scale, 20 * scale);
        button1.setLocation(70 * scale, 70 * scale);
        button1.addActionListener(new Action2());

        button2.setSize(100 * scale, 20 * scale);
        button2.setLocation(210 * scale, 70 * scale);
        button2.addActionListener(new Action1());

        /** Размеры и положение текста */
        label.setSize(180 * scale, 30 * scale);
        label.setLocation(90 * scale, 30 * scale);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        /** Добавление элементов в окно */
        container.add(label);
        container.add(button1);
        container.add(button2);
    }

    /** Поведение кнопки далее после ввода скорости и паузы, здесь отрисовывается окно выбора визуализации */
    class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            /** Чтение с текстового поля */
            spd = Integer.parseInt(speed.getText());
            pse = Integer.parseInt(ps.getText());

            /** Показать элементы */
            label.setVisible(true);
            button2.setVisible(true);

            /** Спрятать элементы */
            speed.setVisible(false);
            ps.setVisible(false);
            next.setVisible(false);

            /** Переопределение текста */
            label.setText("Запустить визуализацию");
            button2.setText("Запустить");

            /** Положение кнопки */
            button2.setLocation(130 * scale, 70 * scale);

            /** Задание поведения кнопок */
            button2.addActionListener(new Action4());
        }
    }

    /**
     * Поведение кнопки ручного ввода массива
     */
    class Action1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            flag = true;

            /** Задание размеров и положение объектов */
            text.setSize(120 * scale, 25 * scale);
            text.setLocation(210 * scale, 150 * scale);

            nexter.setSize(30 * scale, 15 * scale);
            nexter.setLocation(300 * scale, 210 * scale);

            /** Привязка поведения кнопки далее */
            nexter.addActionListener(new Action2());

            /** Добавление элементов на окно */
            add(text);
            add(nexter);
        }
    }

    /** Задание поведения кнопки далее после ручного ввода, отрисовывается окно выбора скорости паузы и визуализации, ренерируется массив */
    class Action2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            /** Генерация массива */
            if (flag == true)
            {
                tmp = text.getText();

                String[] arr = tmp.split(" ");

                if (arr.length > maxLenArr)
                {
                    int kostyl = Integer.parseInt("kostyl");
                }

                for (int i = 0; i < arr.length; i++) if(Integer.parseInt(arr[i]) > maxCount)
                {
                    int kostyl = Integer.parseInt("kostyl");
                }

                for (int i = 0; i < arr.length; i++) array[i] = Integer.parseInt(arr[i]);

                hs = new ArrayList();
                HeapSort ini = new HeapSort(array);

                hs.add(ini);

                HeapSort curr = new HeapSort(ini.stp);

                while (curr.heapSize > 1)
                {
                    curr.sort();

                    hs.add(curr);

                    curr = new HeapSort(curr.stp);
                }
            }
            else
            {
                Test test = new Test(maxLenArr);

                try
                {
                    Scanner scanner = new Scanner(new File("in.txt"));

                    int i = 0;

                    while(scanner.hasNextInt()) array[i++] = scanner.nextInt();
                }
                catch (FileNotFoundException er)
                {
                    System.out.println("Sorry, File not found!");
                }
                catch (InputMismatchException er)
                {
                    System.out.println("Sorry, InputMismatchException");
                }

                hs = new ArrayList();
                HeapSort ini = new HeapSort(array);

                hs.add(ini);

                HeapSort curr = new HeapSort(ini);

                while (curr.heapSize > 1)
                {
                    curr.sort();

                    hs.add(curr);

                    curr = new HeapSort(curr);
                }
            }

            /** Спрятать элементы */
            label.setVisible(false);
            button1.setVisible(false);
            button2.setVisible(false);
            text.setVisible(false);
            nexter.setVisible(false);

            /** Задать размеры и положения */
            speed.setSize(120 * scale, 25 * scale);
            speed.setLocation(120 * scale, 70 * scale);

            ps.setSize(120 * scale, 25 * scale);
            ps.setLocation(120 * scale, 100 * scale);

            next.setSize(30 * scale, 15 * scale);
            next.setLocation(165 * scale, 130 * scale);

            /** Привязка поведения к кнопке далее */
            next.addActionListener(new Action());

            /** Добавление элементов на окно */
            add(speed);
            add(ps);
            add(next);
        }
    }

    /** Поведение кнопки визуализации размеров */
    class Action4 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            /** Создание объекта визуализации */
            scene = new Visualisation(array);

            /** Создание панели, добавление границ */
            JPanel cp = new JPanel(new BorderLayout());

            cp.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 40, 5),
                    BorderFactory.createLineBorder(Color.black)));

            /** Представление панели как контейнера */
            setContentPane(cp);

            /** Поведение кнопки следующего шага, здесь после каждого нажатия отрисовывается следующий шаг сортировки */
            scene.setCont();

            pause.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(con <= hs.size())
                    {

                        scene = new Visualisation(hs.get(con).stp);

                        con++;

                        add(scene, BorderLayout.CENTER);

                        scene.setCont();

                        scene.revalidate();

                        scene.repaint();

                        outp.setText("Закончено построение дерева, началась фаза 2");
                    }
                }
            });

            /** Задание размеров и положения элементов, а так же добавление их на панель */
            outp.setSize(200 * scale, 20);
            outp.setLocation(100, 210 * scale);

            cp.add(outp, BorderLayout.SOUTH);

            cp.add(pause, BorderLayout.SOUTH);
            cp.setBackground(Color.white);

            setSize(250 * scale, 241 * scale);
            setLocationRelativeTo(null);

            //При закрытии окна завершить приложение
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            //Сделать видимым данную панель
            setVisible(true);
        }
    }
}
