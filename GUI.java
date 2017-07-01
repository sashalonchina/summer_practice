package sample.summer_practice;

import java.awt.*;
<<<<<<< HEAD
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import sample.summer_practice.Visual;
=======
<<<<<<< HEAD
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import sample.summer_practice.Visual;
=======
import java.awt.event.*;
import javax.swing.*;
import sample.summer_practice.GUI1;
>>>>>>> origin/master
>>>>>>> origin/master

/** Класс графического интерфейса */
public class GUI extends JFrame
{
<<<<<<< HEAD
    /**
     * Задать длину h и ширину w окна, две кнопки button1, button2 и текст label
     */
=======
<<<<<<< HEAD
    /**
     * Задать длину h и ширину w окна, две кнопки button1, button2 и текст label
     */
    private static int scale = 2;
    private static int maxCount = 50;

    private int w = 360 * scale, h = 270 * scale;
    private int spd = 0;
    private int pse = 0;
    private int maxLenArr = 10;
=======
    /** Задать длину h и ширину w окна, две кнопки button1, button2 и текст label */
>>>>>>> origin/master
    private static int scale = 2;
    private static int maxCount = 50;

    private int w = 360 * scale, h = 270 * scale;
<<<<<<< HEAD
    private int spd = 0;
    private int pse = 0;
    private int maxLenArr = 10;
    private int con = 0;

    private ArrayList<HeapSort> hs;

    private Visualisation scene;
=======
>>>>>>> origin/master
>>>>>>> origin/master

    private boolean flag = false;

    private String tmp;
<<<<<<< HEAD
    private int[] array = new int[maxLenArr];
=======
<<<<<<< HEAD
    private int[] array = new int[maxLenArr];



    /**
     * Конструктор класса
     */
=======
    private String[] array;

    private ImageIcon img = new ImageIcon("Images/tree.jpg");
    private ImageIcon image = new ImageIcon("Images/circles.jpg");
>>>>>>> origin/master

    private JButton button1 = new JButton("Сгенерировать");
    private JButton button2 = new JButton("Ввести вручную");
    private JButton nexter = new JButton(">>");
    private JButton next = new JButton(">>");
<<<<<<< HEAD
    private JButton pause = new JButton("Следующий шаг");
    private JButton play = new JButton("Продолжить");

    private JLabel label = new JLabel("Как задать массив?");
    private JLabel outp = new JLabel("Начало визуализации");

    private JTextField text = new JTextField("Введите массив");
    private JTextField speed = new JTextField("Введите задержку визуализации");
    private JTextField ps = new JTextField("Введите длину паузы");

    /**
     * Конструктор класса
     */
=======
    private JButton pause = new JButton("Пауза");

    private JLabel label = new JLabel("Как задать массив?");
    private JLabel tree = new JLabel(img);
    private JLabel circle = new JLabel(image);

    private JTextField text = new JTextField("Введите массив");
    private JTextField speed = new JTextField("Введите скорость визуализации");

    /** Конструктор класса */
>>>>>>> origin/master
>>>>>>> origin/master
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
<<<<<<< HEAD
        button1.setLocation(70 * scale, 70 * scale);
        button1.addActionListener(new Action2());

        button2.setSize(100 * scale, 20 * scale);
        button2.setLocation(210 * scale, 70 * scale);
=======
<<<<<<< HEAD
        button1.setLocation(70 * scale, 70 * scale);
        button1.addActionListener(new Action2());

        button2.setSize(100 * scale, 20 * scale);
        button2.setLocation(210 * scale, 70 * scale);
=======
        button1.setLocation(70 * scale,70 * scale);
        /** button1.addActionListener(new Action2()); */

        button2.setSize(100 * scale, 20 * scale);
        button2.setLocation(210 * scale,70 * scale);
>>>>>>> origin/master
>>>>>>> origin/master
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

<<<<<<< HEAD
    /**
     * Поведения кнопки генерации массива
     */
=======
<<<<<<< HEAD
    /**
     * Поведения кнопки генерации массива
     */
=======
    /** Поведения кнопки генерации массива */
>>>>>>> origin/master
>>>>>>> origin/master
    class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
<<<<<<< HEAD
            spd = Integer.parseInt(speed.getText());
            pse = Integer.parseInt(ps.getText());

=======
<<<<<<< HEAD
            spd = Integer.parseInt(speed.getText());
            pse = Integer.parseInt(ps.getText());

=======
>>>>>>> origin/master
>>>>>>> origin/master
            label.setVisible(true);
            button1.setVisible(true);
            button2.setVisible(true);

            speed.setVisible(false);
<<<<<<< HEAD
            ps.setVisible(false);
=======
<<<<<<< HEAD
            ps.setVisible(false);
=======
>>>>>>> origin/master
>>>>>>> origin/master
            next.setVisible(false);

            label.setText("Выберите тип визуализации");

            button1.setText("Куча");
            button1.addActionListener(new Action3());

            button2.setText("Размер");
            button2.addActionListener(new Action4());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
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

            text.setSize(120 * scale, 25 * scale);
            text.setLocation(210 * scale, 150 * scale);
<<<<<<< HEAD
=======
=======

            tree.setSize(150 * scale, 110 * scale);
            tree.setLocation(45 * scale, 95 * scale);

            circle.setSize(150 * scale, 110 * scale);
            circle.setLocation(185 * scale, 95 * scale);
        }
    }

    /** Поведение кнопки ручного ввода массива */
    class Action1 implements ActionListener
    {
        public void  actionPerformed(ActionEvent e)
        {
            text.setSize(120 * scale, 25 * scale);
            text.setLocation(210 * scale,150 * scale);
>>>>>>> origin/master
>>>>>>> origin/master

            nexter.setSize(30 * scale, 15 * scale);
            nexter.setLocation(300 * scale, 210 * scale);
            nexter.addActionListener(new Action2());

            add(text);
            add(nexter);
        }
    }

    class Action2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
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
<<<<<<< HEAD

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
=======
>>>>>>> origin/master
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
<<<<<<< HEAD

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

            label.setVisible(false);
            button1.setVisible(false);
            button2.setVisible(false);
            text.setVisible(false);
            nexter.setVisible(false);

            speed.setSize(120 * scale, 25 * scale);
            speed.setLocation(120 * scale, 70 * scale);

            ps.setSize(120 * scale, 25 * scale);
            ps.setLocation(120 * scale, 100 * scale);

            next.setSize(30 * scale, 15 * scale);
            next.setLocation(165 * scale, 130 * scale);
            next.addActionListener(new Action());

            add(speed);
            add(ps);
            add(next);
        }
    }

    class Action3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Visual scene = new Visual(array, spd);

            JPanel cp = new JPanel(new BorderLayout());

            cp.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
                    BorderFactory.createLineBorder(Color.black)));

            setContentPane(cp);

            add(scene, BorderLayout.CENTER);

            pause.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try
                    {
                        Thread.sleep(pse);
                    }

=======
            }
=======
            tmp = text.getText();

            array = tmp.split(" ");
>>>>>>> origin/master

            label.setVisible(false);
            button1.setVisible(false);
            button2.setVisible(false);
            text.setVisible(false);
            nexter.setVisible(false);

            speed.setSize(120 * scale, 25 * scale);
<<<<<<< HEAD
            speed.setLocation(120 * scale, 70 * scale);

            ps.setSize(120 * scale, 25 * scale);
            ps.setLocation(120 * scale, 100 * scale);

            next.setSize(30 * scale, 15 * scale);
            next.setLocation(165 * scale, 130 * scale);
            next.addActionListener(new Action());

            add(speed);
            add(ps);
=======
            speed.setLocation(120 * scale,70 * scale);

            next.setSize(30 * scale, 15 * scale);
            next.setLocation(165 * scale, 100 * scale);
            next.addActionListener(new Action());

            add(speed);
>>>>>>> origin/master
            add(next);
        }
    }

    class Action3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
<<<<<<< HEAD
            Visual scene = new Visual(array, spd);

            JPanel cp = new JPanel(new BorderLayout());

            cp.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
                    BorderFactory.createLineBorder(Color.black)));

            setContentPane(cp);

            add(scene, BorderLayout.CENTER);

            pause.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try
                    {
                        Thread.sleep(pse);
                    }

                    catch (InterruptedException err)
                    {
                        err.printStackTrace();
                    }
                }
            });

            cp.add(pause, BorderLayout.SOUTH);

            setSize(250 * scale, 200 * scale);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
=======

>>>>>>> origin/master
        }
    }

    class Action4 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
<<<<<<< HEAD
            Visualisation scene = new Visualisation(array, spd);

            JPanel cp = new JPanel(new BorderLayout());

            cp.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
                    BorderFactory.createLineBorder(Color.black)));

            setContentPane(cp);

            add(scene, BorderLayout.CENTER);

            pause.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try
                    {
                        Thread.sleep(pse);
                    }

>>>>>>> origin/master
                    catch (InterruptedException err)
                    {
                        err.printStackTrace();
                    }
                }
            });

            cp.add(pause, BorderLayout.SOUTH);
<<<<<<< HEAD
=======
            cp.setBackground(Color.white);
>>>>>>> origin/master

            setSize(250 * scale, 200 * scale);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
<<<<<<< HEAD
        }
    }

    class Action4 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            scene = new Visualisation(array);

            JPanel cp = new JPanel(new BorderLayout());

            cp.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 40, 5),
                    BorderFactory.createLineBorder(Color.black)));

            setContentPane(cp);

            //scene.timerStart();

            scene.setCont();

            pause.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    scene = new Visualisation(hs.get(con).stp);

                    con++;

                    add(scene, BorderLayout.CENTER);

                    scene.setCont();

                    scene.revalidate();

                    scene.repaint();

                    outp.setText("Закончено построение дерева, началась фаза 2");
                }
            });

            outp.setSize(200 * scale, 20);
            outp.setLocation(100, 210 * scale);

            cp.add(outp, BorderLayout.SOUTH);

            cp.add(pause, BorderLayout.SOUTH);
            cp.setBackground(Color.white);

            setSize(250 * scale, 241 * scale);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
=======
=======

>>>>>>> origin/master
>>>>>>> origin/master
        }
    }
}
